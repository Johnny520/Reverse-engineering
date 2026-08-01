// Batch-export Ghidra decompiler output for every discovered function.
// @category Analysis

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileOptions;
import ghidra.app.decompiler.DecompileResults;
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;

public class DecompileAll extends GhidraScript {
    @Override
    protected void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: DecompileAll <output.c> <index.tsv>");
        }

        File outputFile = new File(args[0]);
        File indexFile = new File(args[1]);
        File outputParent = outputFile.getParentFile();
        if (outputParent != null) {
            outputParent.mkdirs();
        }
        File indexParent = indexFile.getParentFile();
        if (indexParent != null) {
            indexParent.mkdirs();
        }

        DecompInterface decompiler = new DecompInterface();
        DecompileOptions options = new DecompileOptions();
        options.grabFromProgram(currentProgram);
        decompiler.setOptions(options);
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        decompiler.setSimplificationStyle("decompile");
        if (!decompiler.openProgram(currentProgram)) {
            throw new IllegalStateException(decompiler.getLastMessage());
        }

        int total = 0;
        int completed = 0;
        int failed = 0;
        FunctionIterator functions = currentProgram.getFunctionManager().getFunctions(true);

        try (
            BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8)
            );
            BufferedWriter index = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(indexFile), StandardCharsets.UTF_8)
            )
        ) {
            output.write("/* Ghidra decompiler output for " + currentProgram.getName() + " */\n");
            output.write("/* Original symbols were stripped/obfuscated; names may be synthetic. */\n\n");
            index.write("address\tname\tstatus\tmessage\n");

            while (functions.hasNext() && !monitor.isCancelled()) {
                monitor.checkCancelled();
                Function function = functions.next();
                total++;
                monitor.setMessage("Decompiling " + function.getName() + " @ " + function.getEntryPoint());

                DecompileResults result = decompiler.decompileFunction(function, 90, monitor);
                String address = function.getEntryPoint().toString();
                String name = function.getName();
                if (result.decompileCompleted() && result.getDecompiledFunction() != null) {
                    output.write("/* ============================================================ */\n");
                    output.write("/* Function: " + name + " @ 0x" + address + " */\n");
                    output.write("/* Signature: " + function.getSignature() + " */\n");
                    output.write("/* ============================================================ */\n");
                    output.write(result.getDecompiledFunction().getC());
                    output.write("\n\n");
                    index.write(address + "\t" + name + "\tOK\t\n");
                    completed++;
                }
                else {
                    String message = result.getErrorMessage();
                    if (message == null) {
                        message = "decompiler returned no C output";
                    }
                    message = message.replace('\t', ' ').replace('\r', ' ').replace('\n', ' ');
                    output.write("/* FAILED: " + name + " @ 0x" + address + ": " + message + " */\n\n");
                    index.write(address + "\t" + name + "\tFAILED\t" + message + "\n");
                    failed++;
                }

                if ((total % 100) == 0) {
                    output.flush();
                    index.flush();
                    println("Processed " + total + " functions");
                }
            }

            output.write("/* Summary: total=" + total + " completed=" + completed + " failed=" + failed + " */\n");
        }
        finally {
            decompiler.dispose();
        }

        println("Decompile export complete: total=" + total + " completed=" + completed + " failed=" + failed);
        println(outputFile.getAbsolutePath());
        println(indexFile.getAbsolutePath());
    }
}
