# Gold and Silver Design Prototype

An exploratory Java console prototype prepared for Nadeem Abdulwahab's step-by-step cryptocurrency design. This is not a working cryptocurrency or an investment product.

## Requirements
JDK 8 or newer. No external Java libraries are required.

## Build and run
Run from the repository root:

```sh
mkdir -p build
javac -d build src/*.java
java -cp build GoldSilverPrototype
```

On Windows Command Prompt, use `mkdir build` instead of `mkdir -p build`.

## Current behaviour
- Registers gold grades 9, 18, 21 and 24.
- Registers silver under the custom design label 28. This is not an established silver purity label.
- Stores placeholder prices per gram using BigDecimal; currency and data source are not configured.
- Generates an independent random integer from 1 through 24 for each entry.
- With five entries, calculates C(max(input,5), min(input,5)). Swapping arguments preserves the proposed adjustment rule; it is not the original C(input,5) when input is below five.
- Stores results in a List and displays them.
- Results change between runs; prices do not yet affect scores.

## Files and concepts
| File | Purpose |
| --- | --- |
| Metal.java | Abstract parent, encapsulated ID, grade and price |
| Gold.java | Gold subclass |
| Silver.java | Custom silver design subclass |
| ScoreRule.java | Replaceable scoring interface |
| RandomCombinationRule.java | Random input and combination calculation |
| ScoreResult.java | Result snapshot |
| GoldSilverPrototype.java | Registry, processing and output |

LinkedHashMap preserves registration order. Polymorphism lets the main loop process Gold and Silver as Metal objects. No carat values are used as array indexes.

## Editing
Change grade registrations and placeholder prices in GoldSilverPrototype.java. Implement ScoreRule to propose a different scoring formula. Changing the number of registered grades changes the combination parameter.

## Design boundaries
The proposed three 1-gram gold portions plus one 1-gram silver portion, and the 72 + 28 = 100 design-unit allocation, are not yet implemented as a valuation formula. Design units are not physical purity units.

No live price feed, price history, currency conversion, ceiling threshold, mining rewards, balances, transactions, wallets, blockchain, custody, reserves or redemption exists here. Random values are local simulation inputs, not proof of work, consensus or secure mining. A real network would need an agreed deterministic validation design. Combination arithmetic uses long with checked intermediate multiplication and can overflow if parameters are expanded significantly.

## Verification status
Source files were generated as a multi-file adaptation of the conversation prototype. See the accompanying delivery message for compilation status. No claim of production readiness is made.

## GitHub upload
Extract the archive and upload the repository contents (README.md, src, docs and .gitignore) to your own GitHub repository. No remote repository has been created by this package.

## License
No license has been selected. Add a LICENSE file after deciding your licensing terms; this package does not grant an open-source license automatically.
