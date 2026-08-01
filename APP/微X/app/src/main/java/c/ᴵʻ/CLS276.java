// Decompiled by JEB v5.42.0.202606242140

package c.ᴵʻ;

import c.ﾞʾ.CLS365;
import com.google.zxing.FormatException;

public final class CLS276 {
    public final StringBuilder FLD1083;
    public final CLS365 FLD1084;
    public final CLS275 FLD1085;

    public CLS276(CLS365 ⁱˋ0) {
        this.FLD1085 = new CLS275();
        this.FLD1083 = new StringBuilder();
        this.FLD1084 = ⁱˋ0;
    }

    public CLS589 MTH3539(int v, String s) {
        this.FLD1083.setLength(0);
        if(s != null) {
            this.FLD1083.append(s);
        }
        this.FLD1085.MTH3525(v);
        CLS589 ᵎʾ0 = this.MTH3549();
        return ᵎʾ0 == null || !ᵎʾ0.MTH3565() ? new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString()) : new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString(), ᵎʾ0.MTH3564());
    }

    public final boolean MTH3540(int v) {
        if(v + 1 > this.FLD1084.MTH5007()) {
            return false;
        }
        for(int v1 = 0; v1 < 5; ++v1) {
            int v2 = v1 + v;
            if(v2 >= this.FLD1084.MTH5007()) {
                break;
            }
            if(v1 == 2) {
                if(!this.FLD1084.MTH5018(v + 2)) {
                    return false;
                }
            }
            else if(this.FLD1084.MTH5018(v2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean MTH3541(int v) {
        if(v + 5 > this.FLD1084.MTH5007()) {
            return false;
        }
        int v1 = this.MTH3546(v, 5);
        if(v1 >= 5 && v1 < 16) {
            return true;
        }
        if(v + 7 > this.FLD1084.MTH5007()) {
            return false;
        }
        int v2 = this.MTH3546(v, 7);
        if(v2 >= 0x40 && v2 < 0x74) {
            return true;
        }
        if(v + 8 > this.FLD1084.MTH5007()) {
            return false;
        }
        int v3 = this.MTH3546(v, 8);
        return v3 >= 0xE8 && v3 < 0xFD;
    }

    public final CLS591 MTH3542(int v) {
        if(v + 7 > this.FLD1084.MTH5007()) {
            int v1 = this.MTH3546(v, 4);
            return v1 == 0 ? new CLS591(this.FLD1084.MTH5007(), 10, 10) : new CLS591(this.FLD1084.MTH5007(), v1 - 1, 10);
        }
        int v2 = this.MTH3546(v, 7);
        return new CLS591(v + 7, (v2 - 8) / 11, (v2 - 8) % 11);
    }

    public final boolean MTH3543(int v) {
        if(v + 7 > this.FLD1084.MTH5007()) {
            return v + 4 <= this.FLD1084.MTH5007();
        }
        for(int v1 = v; v1 < v + 3; ++v1) {
            if(this.FLD1084.MTH5018(v1)) {
                return true;
            }
        }
        return this.FLD1084.MTH5018(v + 3);
    }

    public final CLS588 MTH3544(int v) {
        int v1 = this.MTH3546(v, 5);
        if(v1 == 15) {
            return new CLS588(v + 5, '$');
        }
        if(v1 >= 5 && v1 < 15) {
            return new CLS588(v + 5, ((char)(v1 + 43)));
        }
        int v2 = this.MTH3546(v, 7);
        if(v2 >= 0x40 && v2 < 90) {
            return new CLS588(v + 7, ((char)(v2 + 1)));
        }
        if(v2 >= 90 && v2 < 0x74) {
            return new CLS588(v + 7, ((char)(v2 + 7)));
        }
        switch(this.MTH3546(v, 8)) {
            case 0xE8: {
                return new CLS588(v + 8, '!');
            }
            case 0xE9: {
                return new CLS588(v + 8, '\"');
            }
            case 0xEA: {
                return new CLS588(v + 8, '%');
            }
            case 0xEB: {
                return new CLS588(v + 8, '&');
            }
            case 0xEC: {
                return new CLS588(v + 8, '\'');
            }
            case 0xED: {
                return new CLS588(v + 8, '(');
            }
            case 0xEE: {
                return new CLS588(v + 8, ')');
            }
            case 0xEF: {
                return new CLS588(v + 8, '*');
            }
            case 0xF0: {
                return new CLS588(v + 8, '+');
            }
            case 0xF1: {
                return new CLS588(v + 8, ',');
            }
            case 0xF2: {
                return new CLS588(v + 8, '-');
            }
            case 0xF3: {
                return new CLS588(v + 8, '.');
            }
            case 0xF4: {
                return new CLS588(v + 8, '/');
            }
            case 0xF5: {
                return new CLS588(v + 8, ':');
            }
            case 0xF6: {
                return new CLS588(v + 8, ';');
            }
            case 0xF7: {
                return new CLS588(v + 8, '<');
            }
            case 0xF8: {
                return new CLS588(v + 8, '=');
            }
            case 0xF9: {
                return new CLS588(v + 8, '>');
            }
            case 0xFA: {
                return new CLS588(v + 8, '?');
            }
            case 0xFB: {
                return new CLS588(v + 8, '_');
            }
            case 0xFC: {
                return new CLS588(v + 8, ' ');
            }
            default: {
                throw FormatException.getFormatInstance();
            }
        }
    }

    public final boolean MTH3545(int v) {
        if(v + 5 > this.FLD1084.MTH5007()) {
            return false;
        }
        int v1 = this.MTH3546(v, 5);
        if(v1 >= 5 && v1 < 16) {
            return true;
        }
        if(v + 6 > this.FLD1084.MTH5007()) {
            return false;
        }
        int v2 = this.MTH3546(v, 6);
        return v2 >= 16 && v2 < 0x3F;
    }

    public int MTH3546(int v, int v1) {
        return CLS276.MTH3554(this.FLD1084, v, v1);
    }

    public final CLS273 MTH3547() {
        while(this.MTH3545(this.FLD1085.MTH3526())) {
            CLS588 ˎﹳ0 = this.MTH3555(this.FLD1085.MTH3526());
            int v = ((CLS277)ˎﹳ0).MTH3557();
            this.FLD1085.MTH3525(v);
            if(ˎﹳ0.MTH3536()) {
                return new CLS273(new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString()), true);
            }
            this.FLD1083.append(ˎﹳ0.MTH3537());
        }
        if(this.MTH3550(this.FLD1085.MTH3526())) {
            this.FLD1085.MTH3528(3);
            this.FLD1085.MTH3527();
            return new CLS273(false);
        }
        if(this.MTH3540(this.FLD1085.MTH3526())) {
            if(this.FLD1085.MTH3526() + 5 < this.FLD1084.MTH5007()) {
                this.FLD1085.MTH3528(5);
            }
            else {
                this.FLD1085.MTH3525(this.FLD1084.MTH5007());
            }
            this.FLD1085.MTH3524();
        }
        return new CLS273(false);
    }

    public final CLS273 MTH3548() {
        while(this.MTH3543(this.FLD1085.MTH3526())) {
            CLS591 ﹶˆ0 = this.MTH3542(this.FLD1085.MTH3526());
            int v = ((CLS277)ﹶˆ0).MTH3557();
            this.FLD1085.MTH3525(v);
            if(ﹶˆ0.MTH3582()) {
                return ﹶˆ0.MTH3581() ? new CLS273(new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString()), true) : new CLS273(new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString(), ﹶˆ0.MTH3580()), true);
            }
            this.FLD1083.append(ﹶˆ0.MTH3583());
            if(ﹶˆ0.MTH3581()) {
                return new CLS273(new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString()), true);
            }
            this.FLD1083.append(ﹶˆ0.MTH3580());
        }
        if(this.MTH3551(this.FLD1085.MTH3526())) {
            this.FLD1085.MTH3522();
            this.FLD1085.MTH3528(4);
        }
        return new CLS273(false);
    }

    public final CLS589 MTH3549() {
        CLS273 ˆﾞ0;
        do {
            int v = this.FLD1085.MTH3526();
            if(this.FLD1085.MTH3521()) {
                ˆﾞ0 = this.MTH3547();
            }
            else {
                ˆﾞ0 = this.FLD1085.MTH3523() ? this.MTH3553() : this.MTH3548();
            }
            boolean z = ˆﾞ0.MTH3510();
        }
        while((v != this.FLD1085.MTH3526() || z) && !z);
        return ˆﾞ0.MTH3509();
    }

    public final boolean MTH3550(int v) {
        int v1 = v + 3;
        if(v1 > this.FLD1084.MTH5007()) {
            return false;
        }
        while(v < v1) {
            if(this.FLD1084.MTH5018(v)) {
                return false;
            }
            ++v;
        }
        return true;
    }

    public final boolean MTH3551(int v) {
        if(v + 1 > this.FLD1084.MTH5007()) {
            return false;
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            int v2 = v1 + v;
            if(v2 >= this.FLD1084.MTH5007()) {
                break;
            }
            if(this.FLD1084.MTH5018(v2)) {
                return false;
            }
        }
        return true;
    }

    public String MTH3552(StringBuilder stringBuilder0, int v) {
        for(String s = null; true; s = s2) {
            CLS589 ᵎʾ0 = this.MTH3539(v, s);
            String s1 = CLS278.MTH3560(ᵎʾ0.MTH3566());
            if(s1 != null) {
                stringBuilder0.append(s1);
            }
            String s2 = ᵎʾ0.MTH3565() ? String.valueOf(ᵎʾ0.MTH3564()) : null;
            if(v == ((CLS277)ᵎʾ0).MTH3557()) {
                break;
            }
            v = ((CLS277)ᵎʾ0).MTH3557();
        }
        return stringBuilder0.toString();
    }

    public final CLS273 MTH3553() {
        while(this.MTH3541(this.FLD1085.MTH3526())) {
            CLS588 ˎﹳ0 = this.MTH3544(this.FLD1085.MTH3526());
            int v = ((CLS277)ˎﹳ0).MTH3557();
            this.FLD1085.MTH3525(v);
            if(ˎﹳ0.MTH3536()) {
                return new CLS273(new CLS589(this.FLD1085.MTH3526(), this.FLD1083.toString()), true);
            }
            this.FLD1083.append(ˎﹳ0.MTH3537());
        }
        if(this.MTH3550(this.FLD1085.MTH3526())) {
            this.FLD1085.MTH3528(3);
            this.FLD1085.MTH3527();
            return new CLS273(false);
        }
        if(this.MTH3540(this.FLD1085.MTH3526())) {
            if(this.FLD1085.MTH3526() + 5 < this.FLD1084.MTH5007()) {
                this.FLD1085.MTH3528(5);
            }
            else {
                this.FLD1085.MTH3525(this.FLD1084.MTH5007());
            }
            this.FLD1085.MTH3522();
        }
        return new CLS273(false);
    }

    public static int MTH3554(CLS365 ⁱˋ0, int v, int v1) {
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(ⁱˋ0.MTH5018(v + v2)) {
                v3 |= 1 << v1 - v2 - 1;
            }
        }
        return v3;
    }

    public final CLS588 MTH3555(int v) {
        int v1 = this.MTH3546(v, 5);
        if(v1 == 15) {
            return new CLS588(v + 5, '$');
        }
        if(v1 >= 5 && v1 < 15) {
            return new CLS588(v + 5, ((char)(v1 + 43)));
        }
        int v2 = this.MTH3546(v, 6);
        if(v2 >= 0x20 && v2 < 58) {
            return new CLS588(v + 6, ((char)(v2 + 33)));
        }
        switch(v2) {
            case 58: {
                return new CLS588(v + 6, '*');
            }
            case 59: {
                return new CLS588(v + 6, ',');
            }
            case 60: {
                return new CLS588(v + 6, '-');
            }
            case 61: {
                return new CLS588(v + 6, '.');
            }
            case 62: {
                return new CLS588(v + 6, '/');
            }
            default: {
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + v2);
            }
        }
    }
}

