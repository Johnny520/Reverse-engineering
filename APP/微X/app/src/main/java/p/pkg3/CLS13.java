// Decompiled by JEB v5.42.0.202606242140

package p.pkg3;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;
import p.pkg10.CLS66;
import p.pkg7.CLS39;

public final class CLS13 {
    public int FLD88;
    public int FLD89;
    @Nullable
    public String FLD90;
    public int FLD91;
    public int FLD92;
    public int FLD93;
    @Nullable
    public ArrayList FLD94;
    public char[] FLD95;
    public boolean FLD96;
    public String[] FLD97;
    public int FLD98;
    public int FLD99;
    public Reader FLD100;

    public CLS13(StringReader stringReader0, int v) {
        this.FLD99 = -1;
        this.FLD97 = new String[0x200];
        this.FLD94 = null;
        this.FLD93 = 1;
        CLS39.MTH870(stringReader0.markSupported());
        this.FLD100 = stringReader0;
        this.FLD95 = new char[Math.min(v, 0x8000)];
        this.MTH539();
    }

    @Override
    public final String toString() {
        return this.FLD98 - this.FLD92 >= 0 ? new String(this.FLD95, this.FLD92, this.FLD98 - this.FLD92) : "";
    }

    public final String MTH515() {
        int v1;
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.FLD91 + this.FLD92;
        if(this.FLD94 == null) {
            v1 = 1;
        }
        else {
            int v2 = this.MTH531(v);
            v1 = v2 == -1 ? this.FLD93 : v2 + this.FLD93 + 1;
        }
        stringBuilder0.append(v1);
        stringBuilder0.append(":");
        int v3 = this.FLD91 + this.FLD92;
        if(this.FLD94 != null) {
            int v4 = this.MTH531(v3);
            if(v4 != -1) {
                v3 -= (int)(((Integer)this.FLD94.get(v4)));
            }
        }
        stringBuilder0.append(v3 + 1);
        return stringBuilder0.toString();
    }

    public final boolean MTH516() {
        if(this.MTH524()) {
            return false;
        }
        int v = this.FLD95[this.FLD92];
        return v >= 65 && v <= 90 || v >= 97 && v <= 0x7A || Character.isLetter(((char)v));
    }

    public final void MTH517() {
        ArrayList arrayList0 = this.FLD94;
        int v = 0;
        if(arrayList0 == null) {
            return;
        }
        if(arrayList0.size() > 0) {
            int v1 = this.MTH531(this.FLD91);
            if(v1 != -1) {
                v = v1;
            }
            int v2 = (int)(((Integer)this.FLD94.get(v)));
            this.FLD93 += v;
            this.FLD94.clear();
            this.FLD94.add(v2);
        }
        for(int v3 = this.FLD92; v3 < this.FLD98; ++v3) {
            if(this.FLD95[v3] == 10) {
                this.FLD94.add(((int)(this.FLD91 + 1 + v3)));
            }
        }
    }

    public final void MTH518() {
        int v = this.FLD92;
        if(v < 1) {
            throw new CLS66(new IOException("WTF: No buffer left to unconsume."));
        }
        this.FLD92 = v - 1;
    }

    public final void MTH519() {
        Reader reader0 = this.FLD100;
        if(reader0 == null) {
            return;
        }
        try {
            reader0.close();
        }
        catch(IOException unused_ex) {
        }
        finally {
            this.FLD100 = null;
            this.FLD95 = null;
            this.FLD97 = null;
        }
    }

    public final char MTH520() {
        this.MTH539();
        return this.FLD92 < this.FLD98 ? '\uFFFF' : this.FLD95[this.FLD92];
    }

    public final String MTH521(boolean z) {
        int v = this.FLD92;
        int v1 = this.FLD98;
        char[] arr_c = this.FLD95;
        int v2 = v;
    label_4:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 34: {
                label_8:
                    if(!z) {
                        break label_4;
                    }
                    ++v2;
                    continue;
                }
                case 0: 
                case 38: {
                    break label_4;
                }
                case 39: {
                    if(!z) {
                        goto label_8;
                    }
                    break label_4;
                }
                default: {
                    ++v2;
                    continue;
                }
            }
        }
        this.FLD92 = v2;
        return v2 <= v ? "" : CLS13.MTH536(this.FLD95, this.FLD97, v, v2 - v);
    }

    public final char MTH522() {
        this.MTH539();
        int v = this.FLD92;
        this.FLD92 = v + 1;
        return v < this.FLD98 ? '\uFFFF' : this.FLD95[v];
    }

    public final boolean MTH523(String s) {
        boolean z;
        this.MTH539();
        int v = s.length();
        if(v <= this.FLD98 - this.FLD92) {
            z = true;
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    goto label_10;
                }
                if(Character.toUpperCase(s.charAt(v1)) != Character.toUpperCase(this.FLD95[this.FLD92 + v1])) {
                    break;
                }
                ++v1;
            }
        }
        z = false;
    label_10:
        if(z) {
            this.FLD92 = s.length() + this.FLD92;
            return true;
        }
        return false;
    }

    public final boolean MTH524() {
        this.MTH539();
        return this.FLD92 >= this.FLD98;
    }

    public final String MTH525(char[] arr_c) {
        this.MTH539();
        int v = this.FLD92;
        int v1 = this.FLD98;
        char[] arr_c1 = this.FLD95;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            for(int v3 = 0; v3 < arr_c.length; ++v3) {
                if(arr_c1[v2] == arr_c[v3]) {
                    break alab1;
                }
            }
            ++v2;
        }
        this.FLD92 = v2;
        return v2 <= v ? "" : CLS13.MTH536(this.FLD95, this.FLD97, v, v2 - v);
    }

    public final String MTH526(char c) {
        int v1;
        this.MTH539();
        for(int v = this.FLD92; true; ++v) {
            v1 = -1;
            if(v >= this.FLD98) {
                break;
            }
            if(c == this.FLD95[v]) {
                v1 = v - this.FLD92;
                break;
            }
        }
        if(v1 != -1) {
            String s = CLS13.MTH536(this.FLD95, this.FLD97, this.FLD92, v1);
            this.FLD92 += v1;
            return s;
        }
        this.MTH539();
        String s1 = CLS13.MTH536(this.FLD95, this.FLD97, this.FLD92, this.FLD98 - this.FLD92);
        this.FLD92 = this.FLD98;
        return s1;
    }

    public final int MTH527(String s) {
        this.MTH539();
        int v = s.charAt(0);
        for(int v1 = this.FLD92; v1 < this.FLD98; ++v1) {
            if(v != this.FLD95[v1]) {
                while(true) {
                    ++v1;
                    if(v1 >= this.FLD98 || v == this.FLD95[v1]) {
                        break;
                    }
                }
            }
            int v3 = s.length() + (v1 + 1) - 1;
            if(v1 < this.FLD98 && v3 <= this.FLD98) {
                int v4 = v1 + 1;
                for(int v2 = 1; v4 < v3 && s.charAt(v2) == this.FLD95[v4]; ++v2) {
                    ++v4;
                }
                if(v4 == v3) {
                    return v1 - this.FLD92;
                }
            }
        }
        return -1;
    }

    public final boolean MTH528() {
        if(this.MTH524()) {
            return false;
        }
        int v = this.FLD95[this.FLD92];
        return v >= 65 && v <= 90 || v >= 97 && v <= 0x7A;
    }

    public final void MTH529() {
        ++this.FLD92;
    }

    public final boolean MTH530(char c) {
        return !this.MTH524() && this.FLD95[this.FLD92] == c;
    }

    public final int MTH531(int v) {
        ArrayList arrayList0 = this.FLD94;
        if(arrayList0 == null) {
            return 0;
        }
        int v1 = Collections.binarySearch(arrayList0, v);
        return v1 >= -1 ? v1 : Math.abs(v1) - 2;
    }

    public final String MTH532(char[] arr_c) {
        this.MTH539();
        int v = this.FLD92;
        int v1 = this.FLD98;
        char[] arr_c1 = this.FLD95;
        int v2;
        for(v2 = v; v2 < v1 && Arrays.binarySearch(arr_c, arr_c1[v2]) < 0; ++v2) {
        }
        this.FLD92 = v2;
        return v2 <= v ? "" : CLS13.MTH536(this.FLD95, this.FLD97, v, v2 - v);
    }

    public final String MTH533() {
        this.MTH539();
        int v = this.FLD92;
        int v1;
        while((v1 = this.FLD92) < this.FLD98) {
            int v2 = this.FLD95[v1];
            if((v2 < 65 || v2 > 90) && (v2 < 97 || v2 > 0x7A) && !Character.isLetter(((char)v2))) {
                break;
            }
            ++this.FLD92;
        }
        return CLS13.MTH536(this.FLD95, this.FLD97, v, this.FLD92 - v);
    }

    public final boolean MTH534(char[] arr_c) {
        if(this.MTH524()) {
            return false;
        }
        this.MTH539();
        int v = this.FLD95[this.FLD92];
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            if(arr_c[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public final boolean MTH535(String s) {
        boolean z;
        this.MTH539();
        this.MTH539();
        int v = s.length();
        if(v <= this.FLD98 - this.FLD92) {
            z = true;
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    goto label_11;
                }
                if(s.charAt(v1) != this.FLD95[this.FLD92 + v1]) {
                    break;
                }
                ++v1;
            }
        }
        z = false;
    label_11:
        if(z) {
            this.FLD92 = s.length() + this.FLD92;
            return true;
        }
        return false;
    }

    public static String MTH536(char[] arr_c, String[] arr_s, int v, int v1) {
        boolean z = true;
        if(v1 > 12) {
            return new String(arr_c, v, v1);
        }
        if(v1 < 1) {
            return "";
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 = v3 * 0x1F + arr_c[v + v2];
        }
        String s = arr_s[v3 & 0x1FF];
        if(s != null) {
            if(v1 == s.length()) {
                int v4 = v;
                int v5 = v1;
                int v6 = 0;
                while(v5 != 0) {
                    if(arr_c[v4] != s.charAt(v6)) {
                        goto label_24;
                    }
                    ++v4;
                    --v5;
                    ++v6;
                }
            }
            else {
            label_24:
                z = false;
            }
            if(z) {
                return s;
            }
        }
        String s1 = new String(arr_c, v, v1);
        arr_s[v3 & 0x1FF] = s1;
        return s1;
    }

    public final String MTH537() {
        int v = this.FLD92;
        int v1 = this.FLD98;
        char[] arr_c = this.FLD95;
        int v2 = v;
    alab1:
        while(v2 < v1) {
            switch(arr_c[v2]) {
                case 0: 
                case 38: 
                case 60: {
                    break alab1;
                }
                default: {
                    ++v2;
                }
            }
        }
        this.FLD92 = v2;
        return v2 <= v ? "" : CLS13.MTH536(this.FLD95, this.FLD97, v, v2 - v);
    }

    public final void MTH538() {
        int v = this.FLD99;
        if(v == -1) {
            throw new CLS66(new IOException("Mark invalid"));
        }
        this.FLD92 = v;
        this.FLD99 = -1;
    }

    public final void MTH539() {
        boolean z;
        int v2;
        if(!this.FLD96) {
            int v = this.FLD92;
            if(v >= this.FLD89) {
                int v1 = this.FLD99;
                if(v1 == -1) {
                    v2 = 0;
                }
                else {
                    v2 = v - v1;
                    v = v1;
                }
                try {
                    long v3 = this.FLD100.skip(((long)v));
                    this.FLD100.mark(0x8000);
                    int v4;
                    for(v4 = 0; true; v4 += v5) {
                        z = true;
                        if(v4 > 0x400) {
                            break;
                        }
                        int v5 = this.FLD100.read(this.FLD95, v4, this.FLD95.length - v4);
                        if(v5 == -1) {
                            this.FLD96 = true;
                        }
                        if(v5 <= 0) {
                            break;
                        }
                    }
                    this.FLD100.reset();
                    if(v4 > 0) {
                        if(v3 != ((long)v)) {
                            z = false;
                        }
                        CLS39.MTH870(z);
                        this.FLD98 = v4;
                        this.FLD91 += v;
                        this.FLD92 = v2;
                        if(this.FLD99 != -1) {
                            this.FLD99 = 0;
                        }
                        this.FLD89 = Math.min(v4, 0x6000);
                    }
                }
                catch(IOException iOException0) {
                    throw new CLS66(iOException0);
                }
                this.MTH517();
                this.FLD90 = null;
            }
        }
    }
}

