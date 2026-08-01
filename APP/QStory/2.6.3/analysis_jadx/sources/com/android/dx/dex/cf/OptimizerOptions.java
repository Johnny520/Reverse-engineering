package com.android.dx.dex.cf;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import bsh.C2633;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.rop.code.TranslationAdvice;
import com.android.dx.ssa.Optimizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class OptimizerOptions {
    private HashSet<String> dontOptimizeList;
    private HashSet<String> optimizeList;
    private boolean optimizeListsLoaded;

    private static HashSet<String> loadStringsFromFile(String str) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    fileReader.close();
                    return hashSet;
                }
                hashSet.add(line);
            }
        } catch (IOException e) {
            C0276.m848(AbstractC0053.m157("Error with optimize list: ", str), e);
            return null;
        }
    }

    public void compareOptimizerStep(RopMethod ropMethod, int i, boolean z, CfOptions cfOptions, TranslationAdvice translationAdvice, RopMethod ropMethod2) {
        EnumSet enumSetAllOf = EnumSet.allOf(Optimizer.OptionalStep.class);
        enumSetAllOf.remove(Optimizer.OptionalStep.CONST_COLLECTOR);
        RopMethod ropMethodOptimize = Optimizer.optimize(ropMethod, i, z, cfOptions.localInfo, translationAdvice, enumSetAllOf);
        int effectiveInstructionCount = ropMethod2.getBlocks().getEffectiveInstructionCount();
        int effectiveInstructionCount2 = ropMethodOptimize.getBlocks().getEffectiveInstructionCount();
        System.err.printf("optimize step regs:(%d/%d/%.2f%%) insns:(%d/%d/%.2f%%)\n", Integer.valueOf(ropMethod2.getBlocks().getRegCount()), Integer.valueOf(ropMethodOptimize.getBlocks().getRegCount()), Double.valueOf(((double) ((ropMethodOptimize.getBlocks().getRegCount() - ropMethod2.getBlocks().getRegCount()) / ropMethodOptimize.getBlocks().getRegCount())) * 100.0d), Integer.valueOf(effectiveInstructionCount), Integer.valueOf(effectiveInstructionCount2), Double.valueOf(((double) ((effectiveInstructionCount2 - effectiveInstructionCount) / effectiveInstructionCount2)) * 100.0d));
    }

    public void loadOptimizeLists(String str, String str2) {
        if (this.optimizeListsLoaded) {
            return;
        }
        if (str != null && str2 != null) {
            C2633.m5339("optimize and don't optimize lists  are mutually exclusive.");
            return;
        }
        if (str != null) {
            this.optimizeList = loadStringsFromFile(str);
        }
        if (str2 != null) {
            this.dontOptimizeList = loadStringsFromFile(str2);
        }
        this.optimizeListsLoaded = true;
    }

    public boolean shouldOptimize(String str) {
        HashSet<String> hashSet = this.optimizeList;
        if (hashSet != null) {
            return hashSet.contains(str);
        }
        if (this.dontOptimizeList != null) {
            return !r1.contains(str);
        }
        return true;
    }
}
