package Yue;

import Yue.AbstractC7853;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Yue.ۥۢۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC7866 {

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final char f23608 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final char f23611 = 65533;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final char f23613 = 65535;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC7866 f23541 = new C7875("Data", 0);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final EnumC7866 f23542 = new EnumC7866("CharacterReferenceInData", 1) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25035(c7865, EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final EnumC7866 f23543 = new EnumC7866("Rcdata", 2) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c3787.m834();
                c7865.m25009((char) 65533);
            } else {
                if (cM10412 == '&') {
                    c7865.m3945(EnumC7866.f23544);
                    return;
                }
                if (cM10412 == '<') {
                    c7865.m3945(EnumC7866.f23551);
                } else if (cM10412 != 65535) {
                    c7865.m25011(c3787.m10399());
                } else {
                    c7865.m25010(new AbstractC7853.C7857());
                }
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final EnumC7866 f23544 = new EnumC7866("CharacterReferenceInRcdata", 3) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25035(c7865, EnumC7866.f23543);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final EnumC7866 f23545 = new EnumC7866("Rawtext", 4) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25037(c7865, c3787, this, EnumC7866.f23554);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final EnumC7866 f23546 = new EnumC7866("ScriptData", 5) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25037(c7865, c3787, this, EnumC7866.f23557);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC7866 f23547 = new EnumC7866("PLAINTEXT", 6) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c3787.m834();
                c7865.m25009((char) 65533);
            } else if (cM10412 != 65535) {
                c7865.m25011(c3787.m10406((char) 0));
            } else {
                c7865.m25010(new AbstractC7853.C7857());
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final EnumC7866 f23548 = new EnumC7866("TagOpen", 7) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == '!') {
                c7865.m3945(EnumC7866.f23584);
                return;
            }
            if (cM10412 == '/') {
                c7865.m3945(EnumC7866.f23549);
                return;
            }
            if (cM10412 == '?') {
                c7865.m25004();
                c7865.m25025(EnumC7866.f23583);
            } else if (c3787.m10426()) {
                c7865.m25007(true);
                c7865.m25025(EnumC7866.f23550);
            } else {
                c7865.m25019(this);
                c7865.m25009(C8039.f23875);
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final EnumC7866 f23549 = new EnumC7866("EndTagOpen", 8) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10413()) {
                c7865.m25018(this);
                c7865.m25011("</");
                c7865.m25025(EnumC7866.f23541);
            } else if (c3787.m10426()) {
                c7865.m25007(false);
                c7865.m25025(EnumC7866.f23550);
            } else if (c3787.m10422(C8039.f23876)) {
                c7865.m25019(this);
                c7865.m3945(EnumC7866.f23541);
            } else {
                c7865.m25019(this);
                c7865.m25004();
                c7865.f23534.m24942('/');
                c7865.m25025(EnumC7866.f23583);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final EnumC7866 f23550 = new EnumC7866("TagName", 9) { // from class: Yue.ۥۢۡۧۥ.ۥ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            c7865.f23531.m24959(c3787.m10405());
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.f23531.m24959(EnumC7866.f23612);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 == '/') {
                    c7865.m25025(EnumC7866.f23582);
                    return;
                }
                if (cM10397 == '<') {
                    c3787.m10439();
                    c7865.m25019(this);
                } else if (cM10397 != '>') {
                    if (cM10397 == 65535) {
                        c7865.m25018(this);
                        c7865.m25025(EnumC7866.f23541);
                        return;
                    } else if (cM10397 != '\t' && cM10397 != '\n' && cM10397 != '\f' && cM10397 != '\r') {
                        c7865.f23531.m24958(cM10397);
                        return;
                    }
                }
                c7865.m25017();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            c7865.m25025(EnumC7866.f23574);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final EnumC7866 f23551 = new EnumC7866("RcdataLessthanSign", 10) { // from class: Yue.ۥۢۡۧۥ.ۥ۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10422('/')) {
                c7865.m25008();
                c7865.m3945(EnumC7866.f23552);
            } else if (!c3787.m10435() || !c3787.m10426() || c7865.m3946() == null || c3787.m10411(c7865.m25001())) {
                c7865.m25011("<");
                c7865.m25025(EnumC7866.f23543);
            } else {
                c7865.f23531 = c7865.m25007(false).m24967(c7865.m3946());
                c7865.m25017();
                c7865.m25025(EnumC7866.f23548);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC7866 f23552 = new EnumC7866("RCDATAEndTagOpen", 11) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (!c3787.m10426()) {
                c7865.m25011("</");
                c7865.m25025(EnumC7866.f23543);
            } else {
                c7865.m25007(false);
                c7865.f23531.m24958(c3787.m10412());
                c7865.f23528.append(c3787.m10412());
                c7865.m3945(EnumC7866.f23553);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final EnumC7866 f23553 = new EnumC7866("RCDATAEndTagName", 12) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10426()) {
                String strM10402 = c3787.m10402();
                c7865.f23531.m24959(strM10402);
                c7865.f23528.append(strM10402);
                return;
            }
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                if (c7865.m25023()) {
                    c7865.m25025(EnumC7866.f23574);
                    return;
                } else {
                    m25039(c7865, c3787);
                    return;
                }
            }
            if (cM10397 == '/') {
                if (c7865.m25023()) {
                    c7865.m25025(EnumC7866.f23582);
                    return;
                } else {
                    m25039(c7865, c3787);
                    return;
                }
            }
            if (cM10397 != '>') {
                m25039(c7865, c3787);
            } else if (!c7865.m25023()) {
                m25039(c7865, c3787);
            } else {
                c7865.m25017();
                c7865.m25025(EnumC7866.f23541);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m25039(C7865 c7865, C3787 c3787) {
            c7865.m25011("</");
            c7865.m25012(c7865.f23528);
            c3787.m10439();
            c7865.m25025(EnumC7866.f23543);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final EnumC7866 f23554 = new EnumC7866("RawtextLessthanSign", 13) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10422('/')) {
                c7865.m25008();
                c7865.m3945(EnumC7866.f23555);
            } else {
                c7865.m25009(C8039.f23875);
                c7865.m25025(EnumC7866.f23545);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final EnumC7866 f23555 = new EnumC7866("RawtextEndTagOpen", 14) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25036(c7865, c3787, EnumC7866.f23556, EnumC7866.f23545);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final EnumC7866 f23556 = new EnumC7866("RawtextEndTagName", 15) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25034(c7865, c3787, EnumC7866.f23545);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final EnumC7866 f23557 = new EnumC7866("ScriptDataLessthanSign", 16) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '!') {
                c7865.m25011("<!");
                c7865.m25025(EnumC7866.f23560);
                return;
            }
            if (cM10397 == '/') {
                c7865.m25008();
                c7865.m25025(EnumC7866.f23558);
            } else if (cM10397 != 65535) {
                c7865.m25011("<");
                c3787.m10439();
                c7865.m25025(EnumC7866.f23546);
            } else {
                c7865.m25011("<");
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final EnumC7866 f23558 = new EnumC7866("ScriptDataEndTagOpen", 17) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25036(c7865, c3787, EnumC7866.f23559, EnumC7866.f23546);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final EnumC7866 f23559 = new EnumC7866("ScriptDataEndTagName", 18) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25034(c7865, c3787, EnumC7866.f23546);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final EnumC7866 f23560 = new EnumC7866("ScriptDataEscapeStart", 19) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (!c3787.m10422(SignatureVisitor.SUPER)) {
                c7865.m25025(EnumC7866.f23546);
            } else {
                c7865.m25009(SignatureVisitor.SUPER);
                c7865.m3945(EnumC7866.f23561);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final EnumC7866 f23561 = new EnumC7866("ScriptDataEscapeStartDash", 20) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۧ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (!c3787.m10422(SignatureVisitor.SUPER)) {
                c7865.m25025(EnumC7866.f23546);
            } else {
                c7865.m25009(SignatureVisitor.SUPER);
                c7865.m3945(EnumC7866.f23564);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final EnumC7866 f23562 = new EnumC7866("ScriptDataEscaped", 21) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۟ۨ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10413()) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c3787.m834();
                c7865.m25009((char) 65533);
            } else if (cM10412 == '-') {
                c7865.m25009(SignatureVisitor.SUPER);
                c7865.m3945(EnumC7866.f23563);
            } else if (cM10412 != '<') {
                c7865.m25011(c3787.m10408(SignatureVisitor.SUPER, C8039.f23875, 0));
            } else {
                c7865.m3945(EnumC7866.f23565);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final EnumC7866 f23563 = new EnumC7866("ScriptDataEscapedDash", 22) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10413()) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.m25009((char) 65533);
                c7865.m25025(EnumC7866.f23562);
            } else if (cM10397 == '-') {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23564);
            } else if (cM10397 == '<') {
                c7865.m25025(EnumC7866.f23565);
            } else {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23562);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final EnumC7866 f23564 = new EnumC7866("ScriptDataEscapedDashDash", 23) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10413()) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.m25009((char) 65533);
                c7865.m25025(EnumC7866.f23562);
            } else {
                if (cM10397 == '-') {
                    c7865.m25009(cM10397);
                    return;
                }
                if (cM10397 == '<') {
                    c7865.m25025(EnumC7866.f23565);
                } else if (cM10397 != '>') {
                    c7865.m25009(cM10397);
                    c7865.m25025(EnumC7866.f23562);
                } else {
                    c7865.m25009(cM10397);
                    c7865.m25025(EnumC7866.f23546);
                }
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final EnumC7866 f23565 = new EnumC7866("ScriptDataEscapedLessthanSign", 24) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10426()) {
                c7865.m25008();
                c7865.f23528.append(c3787.m10412());
                c7865.m25011("<");
                c7865.m25009(c3787.m10412());
                c7865.m3945(EnumC7866.f23568);
                return;
            }
            if (c3787.m10422('/')) {
                c7865.m25008();
                c7865.m3945(EnumC7866.f23566);
            } else {
                c7865.m25009(C8039.f23875);
                c7865.m25025(EnumC7866.f23562);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final EnumC7866 f23566 = new EnumC7866("ScriptDataEscapedEndTagOpen", 25) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (!c3787.m10426()) {
                c7865.m25011("</");
                c7865.m25025(EnumC7866.f23562);
            } else {
                c7865.m25007(false);
                c7865.f23531.m24958(c3787.m10412());
                c7865.f23528.append(c3787.m10412());
                c7865.m3945(EnumC7866.f23567);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final EnumC7866 f23567 = new EnumC7866("ScriptDataEscapedEndTagName", 26) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25034(c7865, c3787, EnumC7866.f23562);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final EnumC7866 f23568 = new EnumC7866("ScriptDataDoubleEscapeStart", 27) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25033(c7865, c3787, EnumC7866.f23569, EnumC7866.f23562);
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final EnumC7866 f23569 = new EnumC7866("ScriptDataDoubleEscaped", 28) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c3787.m834();
                c7865.m25009((char) 65533);
            } else if (cM10412 == '-') {
                c7865.m25009(cM10412);
                c7865.m3945(EnumC7866.f23570);
            } else if (cM10412 == '<') {
                c7865.m25009(cM10412);
                c7865.m3945(EnumC7866.f23572);
            } else if (cM10412 != 65535) {
                c7865.m25011(c3787.m10408(SignatureVisitor.SUPER, C8039.f23875, 0));
            } else {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final EnumC7866 f23570 = new EnumC7866("ScriptDataDoubleEscapedDash", 29) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.m25009((char) 65533);
                c7865.m25025(EnumC7866.f23569);
            } else if (cM10397 == '-') {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23571);
            } else if (cM10397 == '<') {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23572);
            } else if (cM10397 != 65535) {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23569);
            } else {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final EnumC7866 f23571 = new EnumC7866("ScriptDataDoubleEscapedDashDash", 30) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۧ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.m25009((char) 65533);
                c7865.m25025(EnumC7866.f23569);
                return;
            }
            if (cM10397 == '-') {
                c7865.m25009(cM10397);
                return;
            }
            if (cM10397 == '<') {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23572);
            } else if (cM10397 == '>') {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23546);
            } else if (cM10397 != 65535) {
                c7865.m25009(cM10397);
                c7865.m25025(EnumC7866.f23569);
            } else {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final EnumC7866 f23572 = new EnumC7866("ScriptDataDoubleEscapedLessthanSign", 31) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟۠ۨ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (!c3787.m10422('/')) {
                c7865.m25025(EnumC7866.f23569);
                return;
            }
            c7865.m25009('/');
            c7865.m25008();
            c7865.m3945(EnumC7866.f23573);
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final EnumC7866 f23573 = new EnumC7866("ScriptDataDoubleEscapeEnd", 32) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            EnumC7866.m25033(c7865, c3787, EnumC7866.f23562, EnumC7866.f23569);
        }
    };

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final EnumC7866 f23574 = new EnumC7866("BeforeAttributeName", 33) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡ۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c3787.m10439();
                c7865.m25019(this);
                c7865.f23531.m24969();
                c7865.m25025(EnumC7866.f23575);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 != '\"' && cM10397 != '\'') {
                    if (cM10397 == '/') {
                        c7865.m25025(EnumC7866.f23582);
                        return;
                    }
                    if (cM10397 == 65535) {
                        c7865.m25018(this);
                        c7865.m25025(EnumC7866.f23541);
                        return;
                    }
                    if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r') {
                        return;
                    }
                    switch (cM10397) {
                        case '<':
                            c3787.m10439();
                            c7865.m25019(this);
                            break;
                        case '=':
                            break;
                        case '>':
                            break;
                        default:
                            c7865.f23531.m24969();
                            c3787.m10439();
                            c7865.m25025(EnumC7866.f23575);
                            return;
                    }
                    c7865.m25017();
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
                c7865.m25019(this);
                c7865.f23531.m24969();
                c7865.f23531.m24953(cM10397, c3787.m10432() - 1, c3787.m10432());
                c7865.m25025(EnumC7866.f23575);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final EnumC7866 f23575 = new EnumC7866("AttributeName", 34) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡ۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            int iM10432 = c3787.m10432();
            c7865.f23531.m24954(c3787.m10409(EnumC7866.f23609), iM10432, c3787.m10432());
            int iM104322 = c3787.m10432();
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23576);
                return;
            }
            if (cM10397 != '\"' && cM10397 != '\'') {
                if (cM10397 == '/') {
                    c7865.m25025(EnumC7866.f23582);
                    return;
                }
                if (cM10397 == 65535) {
                    c7865.m25018(this);
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
                switch (cM10397) {
                    case '<':
                        break;
                    case '=':
                        c7865.m25025(EnumC7866.f23577);
                        break;
                    case '>':
                        c7865.m25017();
                        c7865.m25025(EnumC7866.f23541);
                        break;
                    default:
                        c7865.f23531.m24953(cM10397, iM104322, c3787.m10432());
                        break;
                }
                return;
            }
            c7865.m25019(this);
            c7865.f23531.m24953(cM10397, iM104322, c3787.m10432());
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final EnumC7866 f23576 = new EnumC7866("AfterAttributeName", 35) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23531.m24953((char) 65533, c3787.m10432() - 1, c3787.m10432());
                c7865.m25025(EnumC7866.f23575);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 != '\"' && cM10397 != '\'') {
                    if (cM10397 == '/') {
                        c7865.m25025(EnumC7866.f23582);
                        return;
                    }
                    if (cM10397 == 65535) {
                        c7865.m25018(this);
                        c7865.m25025(EnumC7866.f23541);
                        return;
                    }
                    if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r') {
                        return;
                    }
                    switch (cM10397) {
                        case '<':
                            break;
                        case '=':
                            c7865.m25025(EnumC7866.f23577);
                            break;
                        case '>':
                            c7865.m25017();
                            c7865.m25025(EnumC7866.f23541);
                            break;
                        default:
                            c7865.f23531.m24969();
                            c3787.m10439();
                            c7865.m25025(EnumC7866.f23575);
                            break;
                    }
                    return;
                }
                c7865.m25019(this);
                c7865.f23531.m24969();
                c7865.f23531.m24953(cM10397, c3787.m10432() - 1, c3787.m10432());
                c7865.m25025(EnumC7866.f23575);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final EnumC7866 f23577 = new EnumC7866("BeforeAttributeValue", 36) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23531.m24955((char) 65533, c3787.m10432() - 1, c3787.m10432());
                c7865.m25025(EnumC7866.f23580);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 == '\"') {
                    c7865.m25025(EnumC7866.f23578);
                    return;
                }
                if (cM10397 != '`') {
                    if (cM10397 == 65535) {
                        c7865.m25018(this);
                        c7865.m25017();
                        c7865.m25025(EnumC7866.f23541);
                        return;
                    }
                    if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r') {
                        return;
                    }
                    if (cM10397 == '&') {
                        c3787.m10439();
                        c7865.m25025(EnumC7866.f23580);
                        return;
                    }
                    if (cM10397 == '\'') {
                        c7865.m25025(EnumC7866.f23579);
                        return;
                    }
                    switch (cM10397) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            c7865.m25019(this);
                            c7865.m25017();
                            c7865.m25025(EnumC7866.f23541);
                            break;
                        default:
                            c3787.m10439();
                            c7865.m25025(EnumC7866.f23580);
                            break;
                    }
                    return;
                }
                c7865.m25019(this);
                c7865.f23531.m24955(cM10397, c3787.m10432() - 1, c3787.m10432());
                c7865.m25025(EnumC7866.f23580);
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final EnumC7866 f23578 = new EnumC7866("AttributeValue_doubleQuoted", 37) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            int iM10432 = c3787.m10432();
            String strM10398 = c3787.m10398(false);
            if (strM10398.length() > 0) {
                c7865.f23531.m24956(strM10398, iM10432, c3787.m10432());
            } else {
                c7865.f23531.m24972();
            }
            int iM104322 = c3787.m10432();
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23531.m24955((char) 65533, iM104322, c3787.m10432());
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25025(EnumC7866.f23581);
                return;
            }
            if (cM10397 != '&') {
                if (cM10397 != 65535) {
                    c7865.f23531.m24955(cM10397, iM104322, c3787.m10432());
                    return;
                } else {
                    c7865.m25018(this);
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
            }
            int[] iArrM25003 = c7865.m25003(Character.valueOf(C8039.f3212), true);
            if (iArrM25003 != null) {
                c7865.f23531.m24957(iArrM25003, iM104322, c3787.m10432());
            } else {
                c7865.f23531.m24955(C8039.f23874, iM104322, c3787.m10432());
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final EnumC7866 f23579 = new EnumC7866("AttributeValue_singleQuoted", 38) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            int iM10432 = c3787.m10432();
            String strM10398 = c3787.m10398(true);
            if (strM10398.length() > 0) {
                c7865.f23531.m24956(strM10398, iM10432, c3787.m10432());
            } else {
                c7865.f23531.m24972();
            }
            int iM104322 = c3787.m10432();
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23531.m24955((char) 65533, iM104322, c3787.m10432());
                return;
            }
            if (cM10397 == 65535) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != '&') {
                if (cM10397 != '\'') {
                    c7865.f23531.m24955(cM10397, iM104322, c3787.m10432());
                    return;
                } else {
                    c7865.m25025(EnumC7866.f23581);
                    return;
                }
            }
            int[] iArrM25003 = c7865.m25003('\'', true);
            if (iArrM25003 != null) {
                c7865.f23531.m24957(iArrM25003, iM104322, c3787.m10432());
            } else {
                c7865.f23531.m24955(C8039.f23874, iM104322, c3787.m10432());
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final EnumC7866 f23580 = new EnumC7866("AttributeValue_unquoted", 39) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            int iM10432 = c3787.m10432();
            String strM10409 = c3787.m10409(EnumC7866.f23610);
            if (strM10409.length() > 0) {
                c7865.f23531.m24956(strM10409, iM10432, c3787.m10432());
            }
            int iM104322 = c3787.m10432();
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23531.m24955((char) 65533, iM104322, c3787.m10432());
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 != '\"' && cM10397 != '`') {
                    if (cM10397 == 65535) {
                        c7865.m25018(this);
                        c7865.m25025(EnumC7866.f23541);
                        return;
                    }
                    if (cM10397 != '\t' && cM10397 != '\n' && cM10397 != '\f' && cM10397 != '\r') {
                        if (cM10397 == '&') {
                            int[] iArrM25003 = c7865.m25003(Character.valueOf(C8039.f23876), true);
                            if (iArrM25003 != null) {
                                c7865.f23531.m24957(iArrM25003, iM104322, c3787.m10432());
                                return;
                            } else {
                                c7865.f23531.m24955(C8039.f23874, iM104322, c3787.m10432());
                                return;
                            }
                        }
                        if (cM10397 != '\'') {
                            switch (cM10397) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c7865.m25017();
                                    c7865.m25025(EnumC7866.f23541);
                                    break;
                                default:
                                    c7865.f23531.m24955(cM10397, iM104322, c3787.m10432());
                                    break;
                            }
                            return;
                        }
                    }
                }
                c7865.m25019(this);
                c7865.f23531.m24955(cM10397, iM104322, c3787.m10432());
                return;
            }
            c7865.m25025(EnumC7866.f23574);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final EnumC7866 f23581 = new EnumC7866("AfterAttributeValue_quoted", 40) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۧ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23574);
                return;
            }
            if (cM10397 == '/') {
                c7865.m25025(EnumC7866.f23582);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25017();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 == 65535) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            } else {
                c3787.m10439();
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23574);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final EnumC7866 f23582 = new EnumC7866("SelfClosingStartTag", 41) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۡۨ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '>') {
                c7865.f23531.f23492 = true;
                c7865.m25017();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 == 65535) {
                c7865.m25018(this);
                c7865.m25025(EnumC7866.f23541);
            } else {
                c3787.m10439();
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23574);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final EnumC7866 f23583 = new EnumC7866("BogusComment", 42) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            c7865.f23534.m24943(c3787.m10406(C8039.f23876));
            char cM10412 = c3787.m10412();
            if (cM10412 == '>' || cM10412 == 65535) {
                c3787.m10397();
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final EnumC7866 f23584 = new EnumC7866("MarkupDeclarationOpen", 43) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢ۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10420("--")) {
                c7865.m25005();
                c7865.m25025(EnumC7866.f23585);
            } else {
                if (c3787.m10421("DOCTYPE")) {
                    c7865.m25025(EnumC7866.f23591);
                    return;
                }
                if (c3787.m10420("[CDATA[")) {
                    c7865.m25008();
                    c7865.m25025(EnumC7866.f23607);
                } else {
                    c7865.m25019(this);
                    c7865.m25004();
                    c7865.m25025(EnumC7866.f23583);
                }
            }
        }
    };

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final EnumC7866 f23585 = new EnumC7866("CommentStart", 44) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢ۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23534.m24942((char) 65533);
                c7865.m25025(EnumC7866.f23587);
                return;
            }
            if (cM10397 == '-') {
                c7865.m25025(EnumC7866.f23586);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c3787.m10439();
                c7865.m25025(EnumC7866.f23587);
            } else {
                c7865.m25018(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final EnumC7866 f23586 = new EnumC7866("CommentStartDash", 45) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23534.m24942((char) 65533);
                c7865.m25025(EnumC7866.f23587);
                return;
            }
            if (cM10397 == '-') {
                c7865.m25025(EnumC7866.f23589);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.f23534.m24942(cM10397);
                c7865.m25025(EnumC7866.f23587);
            } else {
                c7865.m25018(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final EnumC7866 f23587 = new EnumC7866("Comment", 46) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c3787.m834();
                c7865.f23534.m24942((char) 65533);
            } else if (cM10412 == '-') {
                c7865.m3945(EnumC7866.f23588);
            } else {
                if (cM10412 != 65535) {
                    c7865.f23534.m24943(c3787.m10408(SignatureVisitor.SUPER, 0));
                    return;
                }
                c7865.m25018(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final EnumC7866 f23588 = new EnumC7866("CommentEndDash", 47) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23534.m24942(SignatureVisitor.SUPER).m24942((char) 65533);
                c7865.m25025(EnumC7866.f23587);
            } else {
                if (cM10397 == '-') {
                    c7865.m25025(EnumC7866.f23589);
                    return;
                }
                if (cM10397 != 65535) {
                    c7865.f23534.m24942(SignatureVisitor.SUPER).m24942(cM10397);
                    c7865.m25025(EnumC7866.f23587);
                } else {
                    c7865.m25018(this);
                    c7865.m25015();
                    c7865.m25025(EnumC7866.f23541);
                }
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final EnumC7866 f23589 = new EnumC7866("CommentEnd", 48) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23534.m24943("--").m24942((char) 65533);
                c7865.m25025(EnumC7866.f23587);
                return;
            }
            if (cM10397 == '!') {
                c7865.m25025(EnumC7866.f23590);
                return;
            }
            if (cM10397 == '-') {
                c7865.f23534.m24942(SignatureVisitor.SUPER);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.f23534.m24943("--").m24942(cM10397);
                c7865.m25025(EnumC7866.f23587);
            } else {
                c7865.m25018(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final EnumC7866 f23590 = new EnumC7866("CommentEndBang", 49) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23534.m24943("--!").m24942((char) 65533);
                c7865.m25025(EnumC7866.f23587);
                return;
            }
            if (cM10397 == '-') {
                c7865.f23534.m24943("--!");
                c7865.m25025(EnumC7866.f23588);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.f23534.m24943("--!").m24942(cM10397);
                c7865.m25025(EnumC7866.f23587);
            } else {
                c7865.m25018(this);
                c7865.m25015();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final EnumC7866 f23591 = new EnumC7866("Doctype", 50) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۧ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23592);
                return;
            }
            if (cM10397 != '>') {
                if (cM10397 != 65535) {
                    c7865.m25019(this);
                    c7865.m25025(EnumC7866.f23592);
                    return;
                }
                c7865.m25018(this);
            }
            c7865.m25019(this);
            c7865.m25006();
            c7865.f23533.f23487 = true;
            c7865.m25016();
            c7865.m25025(EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final EnumC7866 f23592 = new EnumC7866("BeforeDoctypeName", 51) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۢۨ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10426()) {
                c7865.m25006();
                c7865.m25025(EnumC7866.f23593);
                return;
            }
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.m25006();
                c7865.f23533.f23483.append((char) 65533);
                c7865.m25025(EnumC7866.f23593);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 == 65535) {
                    c7865.m25018(this);
                    c7865.m25006();
                    c7865.f23533.f23487 = true;
                    c7865.m25016();
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
                if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r') {
                    return;
                }
                c7865.m25006();
                c7865.f23533.f23483.append(cM10397);
                c7865.m25025(EnumC7866.f23593);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final EnumC7866 f23593 = new EnumC7866("DoctypeName", 52) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10429()) {
                c7865.f23533.f23483.append(c3787.m10402());
                return;
            }
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23533.f23483.append((char) 65533);
                return;
            }
            if (cM10397 != ' ') {
                if (cM10397 == '>') {
                    c7865.m25016();
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
                if (cM10397 == 65535) {
                    c7865.m25018(this);
                    c7865.f23533.f23487 = true;
                    c7865.m25016();
                    c7865.m25025(EnumC7866.f23541);
                    return;
                }
                if (cM10397 != '\t' && cM10397 != '\n' && cM10397 != '\f' && cM10397 != '\r') {
                    c7865.f23533.f23483.append(cM10397);
                    return;
                }
            }
            c7865.m25025(EnumC7866.f23594);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final EnumC7866 f23594 = new EnumC7866("AfterDoctypeName", 53) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            if (c3787.m10413()) {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (c3787.m10424('\t', '\n', '\r', '\f', ' ')) {
                c3787.m834();
                return;
            }
            if (c3787.m10422(C8039.f23876)) {
                c7865.m25016();
                c7865.m3945(EnumC7866.f23541);
                return;
            }
            if (c3787.m10421(C4486.f9435)) {
                c7865.f23533.f23484 = C4486.f9435;
                c7865.m25025(EnumC7866.f23595);
            } else if (c3787.m10421(C4486.f9436)) {
                c7865.f23533.f23484 = C4486.f9436;
                c7865.m25025(EnumC7866.f23601);
            } else {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m3945(EnumC7866.f23606);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final EnumC7866 f23595 = new EnumC7866("AfterDoctypePublicKeyword", 54) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23596);
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23597);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23598);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final EnumC7866 f23596 = new EnumC7866("BeforeDoctypePublicIdentifier", 55) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25025(EnumC7866.f23597);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25025(EnumC7866.f23598);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final EnumC7866 f23597 = new EnumC7866("DoctypePublicIdentifier_doubleQuoted", 56) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23533.f23485.append((char) 65533);
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25025(EnumC7866.f23599);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.f23533.f23485.append(cM10397);
                return;
            }
            c7865.m25018(this);
            c7865.f23533.f23487 = true;
            c7865.m25016();
            c7865.m25025(EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final EnumC7866 f23598 = new EnumC7866("DoctypePublicIdentifier_singleQuoted", 57) { // from class: Yue.ۥۢۡۧۥ.ۥۣۣ۟۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23533.f23485.append((char) 65533);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25025(EnumC7866.f23599);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.f23533.f23485.append(cM10397);
                return;
            }
            c7865.m25018(this);
            c7865.f23533.f23487 = true;
            c7865.m25016();
            c7865.m25025(EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final EnumC7866 f23599 = new EnumC7866("AfterDoctypePublicIdentifier", 58) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23600);
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23603);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23604);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final EnumC7866 f23600 = new EnumC7866("BetweenDoctypePublicAndSystemIdentifiers", 59) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۦ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23603);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23604);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final EnumC7866 f23601 = new EnumC7866("AfterDoctypeSystemKeyword", 60) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۧ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(EnumC7866.f23602);
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23603);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23604);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final EnumC7866 f23602 = new EnumC7866("BeforeDoctypeSystemIdentifier", 61) { // from class: Yue.ۥۢۡۧۥ.ۥۣ۟۟ۨ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25025(EnumC7866.f23603);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25025(EnumC7866.f23604);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final EnumC7866 f23603 = new EnumC7866("DoctypeSystemIdentifier_doubleQuoted", 62) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23533.f23486.append((char) 65533);
                return;
            }
            if (cM10397 == '\"') {
                c7865.m25025(EnumC7866.f23605);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.f23533.f23486.append(cM10397);
                return;
            }
            c7865.m25018(this);
            c7865.f23533.f23487 = true;
            c7865.m25016();
            c7865.m25025(EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final EnumC7866 f23604 = new EnumC7866("DoctypeSystemIdentifier_singleQuoted", 63) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤ۟
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == 0) {
                c7865.m25019(this);
                c7865.f23533.f23486.append((char) 65533);
                return;
            }
            if (cM10397 == '\'') {
                c7865.m25025(EnumC7866.f23605);
                return;
            }
            if (cM10397 == '>') {
                c7865.m25019(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
                return;
            }
            if (cM10397 != 65535) {
                c7865.f23533.f23486.append(cM10397);
                return;
            }
            c7865.m25018(this);
            c7865.f23533.f23487 = true;
            c7865.m25016();
            c7865.m25025(EnumC7866.f23541);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final EnumC7866 f23605 = new EnumC7866("AfterDoctypeSystemIdentifier", 64) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤ۠
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                return;
            }
            if (cM10397 == '>') {
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            } else if (cM10397 != 65535) {
                c7865.m25019(this);
                c7865.m25025(EnumC7866.f23606);
            } else {
                c7865.m25018(this);
                c7865.f23533.f23487 = true;
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final EnumC7866 f23606 = new EnumC7866("BogusDoctype", 65) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤۡ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '>') {
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            } else {
                if (cM10397 != 65535) {
                    return;
                }
                c7865.m25016();
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final EnumC7866 f23607 = new EnumC7866("CdataSection", 66) { // from class: Yue.ۥۢۡۧۥ.ۥ۟۟ۤۢ
        {
            C7875 c7875 = null;
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            c7865.f23528.append(c3787.m10407("]]>"));
            if (c3787.m10420("]]>") || c3787.m10413()) {
                c7865.m25010(new AbstractC7853.C1380(c7865.f23528.toString()));
                c7865.m25025(EnumC7866.f23541);
            }
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7866[] f23614 = m3947();

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final char[] f23609 = {'\t', '\n', '\f', '\r', ' ', C8039.f3212, '\'', '/', C8039.f23875, SignatureVisitor.INSTANCEOF, C8039.f23876};

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final char[] f23610 = {0, '\t', '\n', '\f', '\r', ' ', C8039.f3212, C8039.f23874, '\'', C8039.f23875, SignatureVisitor.INSTANCEOF, C8039.f23876, '`'};

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String f23612 = String.valueOf((char) 65533);

    /* JADX INFO: renamed from: Yue.ۥۢۡۧۥ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public enum C7875 extends EnumC7866 {
        public C7875(String str, int i) {
            super(str, i, null);
        }

        @Override // Yue.EnumC7866
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo25038(C7865 c7865, C3787 c3787) {
            char cM10412 = c3787.m10412();
            if (cM10412 == 0) {
                c7865.m25019(this);
                c7865.m25009(c3787.m10397());
            } else {
                if (cM10412 == '&') {
                    c7865.m3945(EnumC7866.f23542);
                    return;
                }
                if (cM10412 == '<') {
                    c7865.m3945(EnumC7866.f23548);
                } else if (cM10412 != 65535) {
                    c7865.m25011(c3787.m10399());
                } else {
                    c7865.m25010(new AbstractC7853.C7857());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC7866(String str, int i) {
    }

    public static EnumC7866 valueOf(String str) {
        return (EnumC7866) Enum.valueOf(EnumC7866.class, str);
    }

    public static EnumC7866[] values() {
        return (EnumC7866[]) f23614.clone();
    }

    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ EnumC7866[] m3947() {
        return new EnumC7866[]{f23541, f23542, f23543, f23544, f23545, f23546, f23547, f23548, f23549, f23550, f23551, f23552, f23553, f23554, f23555, f23556, f23557, f23558, f23559, f23560, f23561, f23562, f23563, f23564, f23565, f23566, f23567, f23568, f23569, f23570, f23571, f23572, f23573, f23574, f23575, f23576, f23577, f23578, f23579, f23580, f23581, f23582, f23583, f23584, f23585, f23586, f23587, f23588, f23589, f23590, f23591, f23592, f23593, f23594, f23595, f23596, f23597, f23598, f23599, f23600, f23601, f23602, f23603, f23604, f23605, f23606, f23607};
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m25033(C7865 c7865, C3787 c3787, EnumC7866 enumC7866, EnumC7866 enumC78662) {
        if (c3787.m10429()) {
            String strM10402 = c3787.m10402();
            c7865.f23528.append(strM10402);
            c7865.m25011(strM10402);
            return;
        }
        char cM10397 = c3787.m10397();
        if (cM10397 != '\t' && cM10397 != '\n' && cM10397 != '\f' && cM10397 != '\r' && cM10397 != ' ' && cM10397 != '/' && cM10397 != '>') {
            c3787.m10439();
            c7865.m25025(enumC78662);
        } else {
            if (c7865.f23528.toString().equals("script")) {
                c7865.m25025(enumC7866);
            } else {
                c7865.m25025(enumC78662);
            }
            c7865.m25009(cM10397);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m25034(C7865 c7865, C3787 c3787, EnumC7866 enumC7866) {
        if (c3787.m10429()) {
            String strM10402 = c3787.m10402();
            c7865.f23531.m24959(strM10402);
            c7865.f23528.append(strM10402);
            return;
        }
        if (c7865.m25023() && !c3787.m10413()) {
            char cM10397 = c3787.m10397();
            if (cM10397 == '\t' || cM10397 == '\n' || cM10397 == '\f' || cM10397 == '\r' || cM10397 == ' ') {
                c7865.m25025(f23574);
                return;
            }
            if (cM10397 == '/') {
                c7865.m25025(f23582);
                return;
            } else {
                if (cM10397 == '>') {
                    c7865.m25017();
                    c7865.m25025(f23541);
                    return;
                }
                c7865.f23528.append(cM10397);
            }
        }
        c7865.m25011("</");
        c7865.m25012(c7865.f23528);
        c7865.m25025(enumC7866);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m25035(C7865 c7865, EnumC7866 enumC7866) {
        int[] iArrM25003 = c7865.m25003(null, false);
        if (iArrM25003 == null) {
            c7865.m25009(C8039.f23874);
        } else {
            c7865.m25014(iArrM25003);
        }
        c7865.m25025(enumC7866);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m25036(C7865 c7865, C3787 c3787, EnumC7866 enumC7866, EnumC7866 enumC78662) {
        if (c3787.m10426()) {
            c7865.m25007(false);
            c7865.m25025(enumC7866);
        } else {
            c7865.m25011("</");
            c7865.m25025(enumC78662);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m25037(C7865 c7865, C3787 c3787, EnumC7866 enumC7866, EnumC7866 enumC78662) {
        char cM10412 = c3787.m10412();
        if (cM10412 == 0) {
            c7865.m25019(enumC7866);
            c3787.m834();
            c7865.m25009((char) 65533);
        } else if (cM10412 == '<') {
            c7865.m3945(enumC78662);
        } else if (cM10412 != 65535) {
            c7865.m25011(c3787.m10404());
        } else {
            c7865.m25010(new AbstractC7853.C7857());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract void mo25038(C7865 c7865, C3787 c3787);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:2) call: Yue.ۥۢۡۧۥ.<init>(java.lang.String, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ EnumC7866(String str, int i, C7875 c7875) {
        this(str, i);
    }
}
