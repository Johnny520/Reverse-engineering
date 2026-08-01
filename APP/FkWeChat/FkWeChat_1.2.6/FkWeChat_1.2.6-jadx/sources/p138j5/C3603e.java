package p138j5;

import bsh.C1193i2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import p181m4.C4965b;

/* JADX INFO: renamed from: j5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3603e {

    /* JADX INFO: renamed from: a */
    public HashSet f10012a;

    /* JADX INFO: renamed from: b */
    public HashSet f10013b;

    /* JADX INFO: renamed from: c */
    public boolean f10014c;

    /* JADX INFO: renamed from: b */
    public static HashSet m13478b(String str) {
        HashSet hashSet = new HashSet();
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
        } catch (IOException e10) {
            C4965b.m20055a("Error with optimize list: ", str, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13479a(String str, String str2) {
        if (this.f10014c) {
            return;
        }
        if (str != null && str2 != null) {
            C1193i2.m4438a("optimize and don't optimize lists  are mutually exclusive.");
            return;
        }
        if (str != null) {
            this.f10012a = m13478b(str);
        }
        if (str2 != null) {
            this.f10013b = m13478b(str2);
        }
        this.f10014c = true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m13480c(String str) {
        HashSet hashSet = this.f10012a;
        if (hashSet != null) {
            return hashSet.contains(str);
        }
        if (this.f10013b != null) {
            return !r0.contains(str);
        }
        return true;
    }
}
