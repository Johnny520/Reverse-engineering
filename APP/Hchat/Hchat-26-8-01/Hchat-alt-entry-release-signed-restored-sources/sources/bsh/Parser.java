package bsh;

import bsh.ClassGenerator;
import bsh.Types;
import bsh.org.objectweb.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Parser implements ParserTreeConstants, ParserConstants {
    private static int[] jj_la1_0;
    private static int[] jj_la1_1;
    private static int[] jj_la1_2;
    private static int[] jj_la1_3;
    private static int[] jj_la1_4;
    private final JJCalls[] jj_2_rtns;
    private int jj_endpos;
    private List<int[]> jj_expentries;
    private int[] jj_expentry;
    private int jj_gc;
    private int jj_gen;
    JavaCharStream jj_input_stream;
    private int jj_kind;
    private int jj_la;
    private final int[] jj_la1;
    private Token jj_lastpos;
    private int[] jj_lasttokens;
    private boolean jj_lookingAhead;
    private final LookaheadSuccess jj_ls;
    public Token jj_nt;
    private int jj_ntk;
    private boolean jj_rescan;
    private Token jj_scanpos;
    private boolean jj_semLA;
    protected JJTParserState jjtree;
    boolean retainComments;
    public Token token;
    public ParserTokenManager token_source;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class JJCalls {
        int arg;
        Token first;
        int gen;
        JJCalls next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        jj_la1_init_0();
        jj_la1_init_1();
        jj_la1_init_2();
        jj_la1_init_3();
        jj_la1_init_4();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Parser(InputStream inputStream, Charset charset) {
        this.jjtree = new JJTParserState();
        int i9 = 0;
        this.retainComments = false;
        this.jj_lookingAhead = false;
        this.jj_la1 = new int[123];
        this.jj_2_rtns = new JJCalls[41];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess(i9);
        this.jj_expentries = new ArrayList();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        JavaCharStream javaCharStream = new JavaCharStream(inputStream, charset, 1, 1);
        this.jj_input_stream = javaCharStream;
        this.token_source = new ParserTokenManager(javaCharStream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<String> getAllCommentsBeforeNode(SimpleNode simpleNode) {
        Token token;
        ArrayList arrayList = new ArrayList();
        if (simpleNode != null && (token = simpleNode.firstToken) != null && token.specialToken != null) {
            while (true) {
                Token token2 = token.specialToken;
                if (token2 == null) {
                    break;
                }
                token = token2;
            }
            while (token != null) {
                arrayList.add(token.image);
                token = token.next;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<String> getFormalCommentsBeforeNode(SimpleNode simpleNode) {
        Token token;
        ArrayList arrayList = new ArrayList();
        if (simpleNode != null && (token = simpleNode.firstToken) != null && token.specialToken != null) {
            while (true) {
                Token token2 = token.specialToken;
                if (token2 == null) {
                    break;
                }
                token = token2;
            }
            while (token != null) {
                if (token.image.startsWith("/**")) {
                    arrayList.add(token.image);
                }
                token = token.next;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getRadix(String str) {
        if (str.startsWith("0b") || str.startsWith("0B")) {
            return 2;
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            return 16;
        }
        return (!str.startsWith("0") || str.length() <= 1) ? 10 : 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getStartIdx(int i9) {
        if (i9 == 10) {
            return 0;
        }
        return i9 == 8 ? 1 : 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_1(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_1();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(0, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_10(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_10();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(9, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_11(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_11();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(10, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_12(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_12();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(11, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_13(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_13();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(12, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_14(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_14();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(13, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_15(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_15();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(14, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_16(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_16();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(15, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_17(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_17();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(16, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_18(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_18();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(17, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_19(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_19();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(18, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_2(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return !jj_3_2();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(1, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_20(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_20();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(19, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_21(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_21();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(20, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_22(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_22();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(21, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_23(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_23();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(22, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_24(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_24();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(23, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_25(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_25();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(24, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_26(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_26();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(25, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_27(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_27();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(26, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_28(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_28();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(27, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_29(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_29();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(28, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_3(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_3();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_30(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_30();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(29, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_31(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_31();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(30, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_32(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_32();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(31, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_33(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_33();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(32, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_34(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_34();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(33, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_35(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_35();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(34, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_36(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_36();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(35, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_37(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_37();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(36, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_38(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_38();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(37, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_39(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_39();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(38, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_4(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_4();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(3, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_40(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_40();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(39, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_41(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_41();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(40, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_5(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_5();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(4, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_6(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_6();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(5, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_7(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_7();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(6, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_8(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_8();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(7, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_2_9(int i9) {
        this.jj_la = i9;
        Token token = this.token;
        this.jj_scanpos = token;
        this.jj_lastpos = token;
        try {
            return true ^ jj_3_9();
        } catch (LookaheadSuccess unused) {
            return true;
        } finally {
            jj_save(8, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_100() {
        return jj_3R_125();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_101() {
        if (jj_3R_61()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_126()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_127();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_102() {
        if (jj_3R_61()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_128()) {
            this.jj_scanpos = token;
            if (jj_3R_129()) {
                return true;
            }
        }
        if (jj_3R_44()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_238()) {
            this.jj_scanpos = token2;
        }
        Token token3 = this.jj_scanpos;
        if (!jj_3R_239()) {
            return false;
        }
        this.jj_scanpos = token3;
        return jj_3R_240();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_103() {
        Token token;
        if (jj_3R_61() || jj_3R_52() || jj_3R_66()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_241());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_104() {
        Token token = this.jj_scanpos;
        if (!jj_3_4()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_130();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_105() {
        return jj_scan_token(43) || jj_3R_46();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_106() {
        Token token;
        Token token2 = this.jj_scanpos;
        if (jj_3_7()) {
            this.jj_scanpos = token2;
            if (jj_3R_131()) {
                return true;
            }
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_132());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_107() {
        return jj_scan_token(83) || jj_3R_106();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_108() {
        Token token = this.jj_scanpos;
        if (!jj_3R_133()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_134()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_135()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_136()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_137()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_138()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_139()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_140();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_109() {
        return jj_3R_142() || jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_110() {
        Token token = this.jj_scanpos;
        if (!jj_3_25()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_143()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_144();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_111() {
        Token token;
        if (jj_3R_145()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_149());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_112() {
        return jj_scan_token(83) || jj_3R_46();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_113() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_114() {
        Token token;
        if (jj_scan_token(51) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77) || jj_scan_token(78)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_254());
        this.jj_scanpos = token;
        return jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_115() {
        if (jj_scan_token(33) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_255()) {
            this.jj_scanpos = token;
            if (jj_3_35()) {
                return true;
            }
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_256()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_116() {
        return jj_scan_token(61) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_117() {
        return jj_scan_token(22) || jj_3R_63() || jj_scan_token(61) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77) || jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_118() {
        if (jj_scan_token(31) || jj_scan_token(76)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_257()) {
            this.jj_scanpos = token;
        }
        if (jj_scan_token(82)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_258()) {
            this.jj_scanpos = token2;
        }
        if (jj_scan_token(82)) {
            return true;
        }
        Token token3 = this.jj_scanpos;
        if (jj_3R_259()) {
            this.jj_scanpos = token3;
        }
        return jj_scan_token(77) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_119() {
        Token token = this.jj_scanpos;
        if (!jj_3_36()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_146();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_120() {
        if (jj_scan_token(13)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3_38()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_158();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_121() {
        if (jj_scan_token(20)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3_39()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_159();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_122() {
        if (jj_scan_token(47)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_160()) {
            this.jj_scanpos = token;
        }
        return jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_123() {
        return jj_scan_token(52) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77) || jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_124() {
        return jj_scan_token(54) || jj_3R_59() || jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_125() {
        Token token;
        if (jj_scan_token(57)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_161()) {
            this.jj_scanpos = token2;
        }
        if (jj_3R_58()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_260());
        this.jj_scanpos = token;
        if (!jj_3R_261()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_126() {
        Token token = this.jj_scanpos;
        if (jj_3R_147()) {
            this.jj_scanpos = token;
            if (jj_3R_148()) {
                return true;
            }
        }
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_127() {
        if (jj_scan_token(25) || jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_242()) {
            this.jj_scanpos = token;
        }
        return jj_3R_243();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_128() {
        return jj_3R_42() || jj_3R_43();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_129() {
        return jj_3R_43();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_130() {
        return jj_scan_token(35) || jj_scan_token(106) || jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_131() {
        return jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_132() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_133() {
        return jj_scan_token(12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_134() {
        return jj_scan_token(18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_135() {
        return jj_scan_token(15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_136() {
        return jj_scan_token(48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_137() {
        return jj_scan_token(37);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_138() {
        return jj_scan_token(39);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_139() {
        return jj_scan_token(30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_140() {
        return jj_scan_token(23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_141() {
        return jj_scan_token(149) || jj_3R_59() || jj_scan_token(150) || jj_3R_85();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_142() {
        Token token = this.jj_scanpos;
        if (!jj_scan_token(85)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(126)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(136)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(137)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(127)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(134)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(135)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(124)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(125)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(128)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(129)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(132)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(133)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(130)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(131)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(138)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(139)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(140)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(146)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(141)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(142)) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(143);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_143() {
        Token token;
        if (jj_3R_150()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_150());
        this.jj_scanpos = token;
        return jj_3R_49();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_144() {
        return jj_3R_49();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_145() {
        Token token;
        if (jj_3R_151()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_152());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_146() {
        if (jj_scan_token(31) || jj_scan_token(76)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_266()) {
            this.jj_scanpos = token;
        }
        return jj_3R_52() || jj_scan_token(73) || jj_scan_token(150) || jj_3R_59() || jj_scan_token(77) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_147() {
        if (jj_scan_token(14) || jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_247()) {
            this.jj_scanpos = token;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_248()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_148() {
        if (jj_scan_token(38) || jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_249()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_149() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(147)) {
            this.jj_scanpos = token;
            if (jj_scan_token(148)) {
                this.jj_scanpos = token;
                if (jj_scan_token(145)) {
                    return true;
                }
            }
        }
        return jj_3R_145();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_150() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_151() {
        Token token;
        if (jj_3R_153()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_154());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_152() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(98)) {
            this.jj_scanpos = token;
            if (jj_scan_token(99)) {
                return true;
            }
        }
        return jj_3R_151();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_153() {
        Token token;
        if (jj_3R_155()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_156());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_154() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(100)) {
            this.jj_scanpos = token;
            if (jj_scan_token(101)) {
                return true;
            }
        }
        return jj_3R_153();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_155() {
        Token token;
        if (jj_3R_157()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_162());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_156() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(110)) {
            this.jj_scanpos = token;
            if (jj_scan_token(111)) {
                return true;
            }
        }
        return jj_3R_155();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_157() {
        Token token;
        if (jj_3R_163()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_165());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_158() {
        return jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_159() {
        return jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_160() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_161() {
        return jj_3R_164();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_162() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(112)) {
            this.jj_scanpos = token;
            if (jj_scan_token(113)) {
                return true;
            }
        }
        return jj_3R_157();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_163() {
        Token token;
        if (jj_3R_166()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_167());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_164() {
        Token token;
        if (jj_scan_token(76) || jj_3R_275()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_276());
        this.jj_scanpos = token;
        return jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_165() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(108)) {
            this.jj_scanpos = token;
            if (jj_scan_token(109)) {
                return true;
            }
        }
        return jj_3R_163();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_166() {
        if (jj_3R_168()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_169()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_167() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(92)) {
            this.jj_scanpos = token;
            if (jj_scan_token(97)) {
                return true;
            }
        }
        return jj_3R_166();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_168() {
        Token token;
        if (jj_3R_170()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_171());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_169() {
        return jj_scan_token(36) || jj_3R_52();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_170() {
        Token token;
        if (jj_3R_172()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_173());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_171() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(88)) {
            this.jj_scanpos = token;
            if (jj_scan_token(89)) {
                this.jj_scanpos = token;
                if (jj_scan_token(86)) {
                    this.jj_scanpos = token;
                    if (jj_scan_token(87)) {
                        this.jj_scanpos = token;
                        if (jj_scan_token(93)) {
                            this.jj_scanpos = token;
                            if (jj_scan_token(94)) {
                                this.jj_scanpos = token;
                                if (jj_scan_token(95)) {
                                    this.jj_scanpos = token;
                                    if (jj_scan_token(96)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return jj_3R_170();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_172() {
        Token token;
        if (jj_3R_174()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_175());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_173() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(118)) {
            this.jj_scanpos = token;
            if (jj_scan_token(119)) {
                this.jj_scanpos = token;
                if (jj_scan_token(120)) {
                    this.jj_scanpos = token;
                    if (jj_scan_token(121)) {
                        this.jj_scanpos = token;
                        if (jj_scan_token(122)) {
                            this.jj_scanpos = token;
                            if (jj_scan_token(123)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return jj_3R_172();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_174() {
        Token token;
        if (jj_3R_176()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_177());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_175() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(104)) {
            this.jj_scanpos = token;
            if (jj_scan_token(105)) {
                return true;
            }
        }
        return jj_3R_174();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_176() {
        Token token;
        if (jj_3R_178()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_179());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_177() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(106)) {
            this.jj_scanpos = token;
            if (jj_scan_token(107)) {
                this.jj_scanpos = token;
                if (jj_scan_token(114)) {
                    this.jj_scanpos = token;
                    if (jj_scan_token(115)) {
                        return true;
                    }
                }
            }
        }
        return jj_3R_176();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_178() {
        Token token = this.jj_scanpos;
        if (!jj_3R_180()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_181()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_182()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_183()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_184();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_179() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(116)) {
            this.jj_scanpos = token;
            if (jj_scan_token(117)) {
                return true;
            }
        }
        return jj_3R_178();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_180() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(104)) {
            this.jj_scanpos = token;
            if (jj_scan_token(105)) {
                this.jj_scanpos = token;
                if (jj_scan_token(91)) {
                    this.jj_scanpos = token;
                    if (jj_scan_token(90)) {
                        return true;
                    }
                }
            }
        }
        return jj_3R_178();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_181() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(102)) {
            this.jj_scanpos = token;
            if (jj_scan_token(103)) {
                return true;
            }
        }
        return jj_3R_187();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_182() {
        return jj_3R_185();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_183() {
        return jj_3R_186();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_184() {
        if (jj_3R_187()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_188()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_185() {
        Token token = this.jj_scanpos;
        if (jj_3R_189()) {
            this.jj_scanpos = token;
            if (jj_scan_token(73)) {
                return true;
            }
        }
        if (jj_scan_token(144)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_191()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_192();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_186() {
        return jj_scan_token(76) || jj_3R_52() || jj_scan_token(77) || jj_3R_178();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_187() {
        Token token;
        if (jj_3R_190()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_15());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_188() {
        Token token = this.jj_scanpos;
        if (!jj_scan_token(102)) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(103);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_189() {
        return jj_3R_44();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_190() {
        Token token = this.jj_scanpos;
        if (!jj_3R_193()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_194()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_195()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_196()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_197()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_198()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_199();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_191() {
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_192() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_193() {
        return jj_3R_200();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_194() {
        return jj_scan_token(76) || jj_3R_59() || jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_195() {
        return jj_3R_201();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_196() {
        return jj_3R_57();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_197() {
        return jj_3R_202();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_198() {
        return jj_3R_52();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_199() {
        return jj_3R_46();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_200() {
        Token token = this.jj_scanpos;
        if (!jj_3R_203()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_204()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_205()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_206()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_207()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_208()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_209()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_210();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_201() {
        Token token;
        if (jj_scan_token(60) || jj_scan_token(76) || jj_3R_59() || jj_scan_token(77) || jj_scan_token(78) || jj_3R_211()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_211());
        this.jj_scanpos = token;
        return jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_202() {
        return jj_3R_46() || jj_3R_212();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_203() {
        return jj_scan_token(62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_204() {
        return jj_scan_token(67);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_205() {
        return jj_scan_token(70);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_206() {
        return jj_scan_token(71);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_207() {
        return jj_scan_token(72);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_208() {
        return jj_3R_217();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_209() {
        return jj_scan_token(42);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_210() {
        return jj_scan_token(58);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_211() {
        return jj_3R_218();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_212() {
        if (jj_scan_token(76)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_222()) {
            this.jj_scanpos = token;
        }
        return jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_213() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_214() {
        Token token = this.jj_scanpos;
        if (!jj_3R_223()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_224();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_215() {
        return jj_3R_212();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_216() {
        return jj_3R_212();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_217() {
        Token token = this.jj_scanpos;
        if (!jj_3R_225()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_226();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_218() {
        Token token = this.jj_scanpos;
        if (!jj_3R_227()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_228();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_219() {
        return jj_3R_108() || jj_3R_110();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_220() {
        if (jj_3R_46()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_229()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_230();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_221() {
        return jj_3R_110();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_222() {
        return jj_3R_231();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_223() {
        if (jj_scan_token(151)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_232()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_224() {
        if (jj_scan_token(150)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_233()) {
            this.jj_scanpos = token;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_234()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_225() {
        return jj_scan_token(56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_226() {
        return jj_scan_token(27);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_227() {
        return jj_scan_token(24) || jj_scan_token(144) || jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_228() {
        Token token;
        if (jj_3R_59()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_235());
        this.jj_scanpos = token;
        return jj_scan_token(144) || jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_229() {
        return jj_3R_110();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_230() {
        if (jj_3R_212()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3_22()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_231() {
        Token token;
        if (jj_3R_59()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_236());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_232() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_233() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_234() {
        if (jj_scan_token(150)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_237()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_235() {
        return jj_scan_token(83) || jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_236() {
        return jj_scan_token(83) || jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_237() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_238() {
        return jj_scan_token(55) || jj_3R_87();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_239() {
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_240() {
        return jj_3R_244();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_241() {
        return jj_scan_token(83) || jj_3R_66();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_242() {
        return jj_scan_token(34) || jj_3R_87();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_243() {
        Token token;
        if (jj_scan_token(78)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_250()) {
            this.jj_scanpos = token2;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_251());
        this.jj_scanpos = token;
        if (jj_3R_252()) {
            this.jj_scanpos = token;
        }
        return jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_244() {
        Token token = this.jj_scanpos;
        if (jj_scan_token(82)) {
            this.jj_scanpos = token;
            this.jj_lookingAhead = true;
            boolean zIsImplicitMethodTerminator = isImplicitMethodTerminator();
            this.jj_semLA = zIsImplicitMethodTerminator;
            this.jj_lookingAhead = false;
            if (!zIsImplicitMethodTerminator || jj_3R_253()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_245() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_246() {
        return jj_scan_token(85) || jj_3R_50();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_247() {
        return jj_scan_token(26) || jj_3R_46();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_248() {
        return jj_scan_token(34) || jj_3R_87();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_249() {
        return jj_scan_token(26) || jj_3R_87();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_250() {
        return jj_3R_262();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_251() {
        return jj_scan_token(83) || jj_3R_262();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_252() {
        Token token;
        if (jj_scan_token(82)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_2());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_253() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_254() {
        Token token;
        if (jj_3R_263()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_34());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_255() {
        return jj_scan_token(82);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_256() {
        return jj_scan_token(24) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_257() {
        return jj_3R_264();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_258() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_259() {
        return jj_3R_265();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_260() {
        return jj_scan_token(17) || jj_scan_token(76) || jj_3R_267() || jj_scan_token(77) || jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_261() {
        return jj_scan_token(29) || jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_262() {
        if (jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_268()) {
            this.jj_scanpos = token;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_269()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_263() {
        Token token = this.jj_scanpos;
        if (!jj_3R_270()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_271();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_264() {
        Token token = this.jj_scanpos;
        if (!jj_3R_272()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_273();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_265() {
        return jj_3R_274();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_266() {
        return jj_scan_token(28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_267() {
        Token token = this.jj_scanpos;
        if (!jj_3_40()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_277();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_268() {
        return jj_3R_212();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_269() {
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_270() {
        return jj_scan_token(16) || jj_3R_59() || jj_scan_token(150);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_271() {
        return jj_scan_token(Opcodes.IFNE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_272() {
        return jj_3R_103();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_273() {
        return jj_3R_274();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_274() {
        Token token;
        if (jj_3R_113()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_278());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_275() {
        Token token = this.jj_scanpos;
        if (!jj_3_41()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_279();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_276() {
        return jj_scan_token(82) || jj_3R_275();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_277() {
        return jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_278() {
        return jj_scan_token(83) || jj_3R_113();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_279() {
        return jj_3R_66();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_41() {
        Token token = this.jj_scanpos;
        if (!jj_3R_67()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_68()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_69()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_70()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3_33()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_71()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_72();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_42() {
        Token token = this.jj_scanpos;
        if (!jj_3R_73()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_74();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_43() {
        Token token;
        Token token2;
        Token token3 = this.jj_scanpos;
        if (jj_scan_token(73)) {
            this.jj_scanpos = token3;
            if (jj_scan_token(12)) {
                this.jj_scanpos = token3;
                if (jj_scan_token(18)) {
                    this.jj_scanpos = token3;
                    if (jj_scan_token(15)) {
                        this.jj_scanpos = token3;
                        if (jj_scan_token(48)) {
                            this.jj_scanpos = token3;
                            if (jj_scan_token(37)) {
                                this.jj_scanpos = token3;
                                if (jj_scan_token(39)) {
                                    this.jj_scanpos = token3;
                                    if (jj_scan_token(30)) {
                                        this.jj_scanpos = token3;
                                        if (jj_scan_token(23)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_10());
        this.jj_scanpos = token;
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_11());
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_44() {
        if (jj_scan_token(76)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_75()) {
            this.jj_scanpos = token;
        }
        return jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_45() {
        return jj_scan_token(49);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_46() {
        Token token;
        if (jj_scan_token(73)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_9());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_47() {
        return jj_scan_token(84) || jj_scan_token(106);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_48() {
        Token token = this.jj_scanpos;
        if (!jj_scan_token(82)) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_49() {
        if (jj_scan_token(78)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_76()) {
            this.jj_scanpos = token;
        }
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(83)) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_50() {
        Token token = this.jj_scanpos;
        if (!jj_3_5()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_77();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_51() {
        return jj_scan_token(28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_52() {
        Token token;
        Token token2 = this.jj_scanpos;
        if (jj_3R_78()) {
            this.jj_scanpos = token2;
            if (jj_3R_79()) {
                return true;
            }
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_8());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_53() {
        return jj_scan_token(152);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_54() {
        return jj_3R_44();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_55() {
        Token token = this.jj_scanpos;
        if (jj_3_18()) {
            this.jj_scanpos = token;
            if (jj_3R_80()) {
                this.jj_scanpos = token;
                this.jj_lookingAhead = true;
                boolean z9 = getToken(1).kind == 151 && (getToken(2).kind == 73 || getToken(2).kind == 41) && getToken(3).kind != 81;
                this.jj_semLA = z9;
                this.jj_lookingAhead = false;
                if (!z9 || jj_3R_81()) {
                    this.jj_scanpos = token;
                    if (jj_3_19()) {
                        this.jj_scanpos = token;
                        if (jj_3_20()) {
                            this.jj_scanpos = token;
                            if (jj_3R_82()) {
                                this.jj_scanpos = token;
                                if (jj_3_21()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_56() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_57() {
        Token token = this.jj_scanpos;
        if (!jj_3R_83()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_84();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_58() {
        Token token;
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(49)) {
            this.jj_scanpos = token2;
        }
        if (jj_scan_token(78)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_28());
        this.jj_scanpos = token;
        return jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_59() {
        if (jj_3R_85()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_109()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_60() {
        return jj_scan_token(73) || jj_scan_token(150) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_61() {
        Token token;
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_86());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_62() {
        return jj_scan_token(55) || jj_3R_87();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_63() {
        Token token = this.jj_scanpos;
        if (jj_3_26()) {
            this.jj_scanpos = token;
            if (jj_3_27()) {
                this.jj_scanpos = token;
                if (jj_scan_token(82)) {
                    this.jj_scanpos = token;
                    if (jj_3R_88()) {
                        this.jj_scanpos = token;
                        if (jj_3R_89()) {
                            this.jj_scanpos = token;
                            if (jj_3R_90()) {
                                this.jj_scanpos = token;
                                if (jj_3R_91()) {
                                    this.jj_scanpos = token;
                                    if (jj_3R_92()) {
                                        this.jj_scanpos = token;
                                        this.jj_lookingAhead = true;
                                        boolean zIsRegularForStatement = isRegularForStatement();
                                        this.jj_semLA = zIsRegularForStatement;
                                        this.jj_lookingAhead = false;
                                        if (!zIsRegularForStatement || jj_3R_93()) {
                                            this.jj_scanpos = token;
                                            if (jj_3R_94()) {
                                                this.jj_scanpos = token;
                                                if (jj_3R_95()) {
                                                    this.jj_scanpos = token;
                                                    if (jj_3R_96()) {
                                                        this.jj_scanpos = token;
                                                        if (jj_3R_97()) {
                                                            this.jj_scanpos = token;
                                                            if (jj_3R_98()) {
                                                                this.jj_scanpos = token;
                                                                if (jj_3R_99()) {
                                                                    this.jj_scanpos = token;
                                                                    if (jj_3R_100()) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_64() {
        return jj_scan_token(28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_65() {
        return jj_scan_token(110) || jj_3R_52();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_66() {
        Token token;
        if (jj_scan_token(73)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_245());
        this.jj_scanpos = token;
        if (!jj_3R_246()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_67() {
        return jj_3R_101();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_68() {
        return jj_3R_102();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_69() {
        return jj_3R_102();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_70() {
        return jj_3R_103() || jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_71() {
        return jj_3R_104();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_72() {
        return jj_3R_105();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_73() {
        return jj_scan_token(58);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_74() {
        return jj_3R_52();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_75() {
        Token token;
        if (jj_3R_106()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_107());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_76() {
        Token token;
        if (jj_3R_50()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_6());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_77() {
        return jj_3R_59();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_78() {
        return jj_3R_108();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_79() {
        return jj_3R_46();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_80() {
        if (jj_scan_token(80)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_213()) {
            this.jj_scanpos = token;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_214()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_81() {
        if (jj_scan_token(151)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_scan_token(73)) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(41);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_82() {
        return jj_scan_token(78) || jj_3R_59() || jj_scan_token(79);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_83() {
        if (jj_scan_token(41)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_219()) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_3R_220()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_3R_221();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_84() {
        return jj_3R_110();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_85() {
        if (jj_3R_111()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_141()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_86() {
        Token token = this.jj_scanpos;
        if (!jj_scan_token(44)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(45)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(46)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(52)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(28)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(40)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(53)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(59)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(11)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(49)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(50)) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_87() {
        Token token;
        if (jj_3R_46()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_112());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_88() {
        return jj_3R_113() || jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_89() {
        return jj_3R_114();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_90() {
        return jj_3R_115();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_91() {
        return jj_3R_116();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_92() {
        return jj_3R_117();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_93() {
        return jj_3R_118();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_94() {
        return jj_3R_119();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_95() {
        return jj_3R_120();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_96() {
        return jj_3R_121();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_97() {
        return jj_3R_122();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_98() {
        return jj_3R_123();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3R_99() {
        return jj_3R_124();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_1() {
        return jj_3R_41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_10() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_11() {
        Token token;
        if (jj_scan_token(84) || jj_scan_token(73)) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_12());
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_12() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_13() {
        Token token = this.jj_scanpos;
        if (jj_3R_54()) {
            this.jj_scanpos = token;
            if (jj_scan_token(73)) {
                return true;
            }
        }
        return jj_scan_token(144);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_14() {
        return jj_scan_token(76) || jj_3R_52() || jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_15() {
        return jj_3R_55();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_16() {
        if (jj_3R_46() || jj_scan_token(76)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_56()) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(77);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_17() {
        return jj_3R_52() || jj_scan_token(84) || jj_scan_token(14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_18() {
        return jj_scan_token(84) || jj_scan_token(14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_19() {
        if (jj_scan_token(Opcodes.IFEQ) || jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_215()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_2() {
        return jj_3R_41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_20() {
        if (jj_scan_token(84) || jj_scan_token(73)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_3R_216()) {
            return false;
        }
        this.jj_scanpos = token;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_21() {
        return jj_scan_token(84) || jj_3R_57();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_22() {
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_23() {
        return jj_scan_token(80) || jj_3R_59() || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_24() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_25() {
        Token token;
        Token token2;
        if (jj_3_23()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3_23());
        this.jj_scanpos = token;
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_24());
        this.jj_scanpos = token2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_26() {
        return jj_3R_60();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_27() {
        return jj_3R_58();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_28() {
        return jj_3R_41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_29() {
        if (jj_3R_61()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (!jj_scan_token(14)) {
            return false;
        }
        this.jj_scanpos = token;
        if (!jj_scan_token(38)) {
            return false;
        }
        this.jj_scanpos = token;
        return jj_scan_token(25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_3() {
        return jj_3R_42() || jj_3R_43() || jj_3R_44();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_30() {
        return jj_3R_61() || jj_3R_42() || jj_3R_43() || jj_scan_token(76);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_31() {
        if (jj_3R_61() || jj_3R_43() || jj_3R_44()) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_62()) {
            this.jj_scanpos = token;
        }
        return jj_scan_token(78);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_32() {
        return jj_3R_61() || jj_3R_52() || jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_33() {
        return jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_34() {
        return jj_3R_41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_35() {
        return jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_36() {
        return jj_scan_token(31) || jj_scan_token(76) || jj_scan_token(73) || jj_scan_token(150) || jj_3R_59() || jj_scan_token(77) || jj_3R_63();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_37() {
        return jj_3R_61() || jj_3R_52() || jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_38() {
        return jj_scan_token(73) || jj_scan_token(82);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_39() {
        return jj_scan_token(73) || jj_scan_token(82);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_4() {
        if (jj_scan_token(35)) {
            return true;
        }
        Token token = this.jj_scanpos;
        if (jj_3R_45()) {
            this.jj_scanpos = token;
        }
        if (jj_3R_46()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_47()) {
            this.jj_scanpos = token2;
        }
        return jj_3R_48();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_40() {
        Token token;
        Token token2 = this.jj_scanpos;
        if (jj_3R_64()) {
            this.jj_scanpos = token2;
        }
        if (jj_3R_52()) {
            return true;
        }
        do {
            token = this.jj_scanpos;
        } while (!jj_3R_65());
        this.jj_scanpos = token;
        return jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_41() {
        return jj_3R_52() || jj_3R_66();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_5() {
        return jj_3R_49();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_6() {
        return jj_scan_token(83) || jj_3R_50();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_7() {
        Token token = this.jj_scanpos;
        if (jj_3R_51()) {
            this.jj_scanpos = token;
        }
        if (jj_3R_52()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_53()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_8() {
        return jj_scan_token(80) || jj_scan_token(81);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_3_9() {
        return jj_scan_token(84) || jj_scan_token(73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jj_add_error_token(int i9, int i10) {
        if (i10 >= 100) {
            return;
        }
        int i11 = this.jj_endpos;
        if (i10 == i11 + 1) {
            int[] iArr = this.jj_lasttokens;
            this.jj_endpos = i11 + 1;
            iArr[i11] = i9;
            return;
        }
        if (i11 != 0) {
            this.jj_expentry = new int[i11];
            for (int i12 = 0; i12 < this.jj_endpos; i12++) {
                this.jj_expentry[i12] = this.jj_lasttokens[i12];
            }
            Iterator<int[]> it = this.jj_expentries.iterator();
            loop1: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                if (next.length == this.jj_expentry.length) {
                    int i13 = 0;
                    while (true) {
                        int[] iArr2 = this.jj_expentry;
                        if (i13 >= iArr2.length) {
                            this.jj_expentries.add(iArr2);
                            break loop1;
                        } else if (next[i13] != iArr2[i13]) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            if (i10 != 0) {
                this.jj_endpos = i10;
                this.jj_lasttokens[i10 - 1] = i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Token jj_consume_token(int i9) throws ParseException {
        Token token = this.token;
        Token token2 = token.next;
        if (token2 != null) {
            this.token = token2;
        } else {
            token.next = this.token_source.getNextToken();
            this.token = this.token.next;
        }
        this.jj_ntk = -1;
        if (this.token.kind != i9) {
            this.token = token;
            this.jj_kind = i9;
            throw generateParseException();
        }
        this.jj_gen++;
        int i10 = this.jj_gc + 1;
        this.jj_gc = i10;
        if (i10 > 100) {
            int i11 = 0;
            this.jj_gc = 0;
            while (true) {
                JJCalls[] jJCallsArr = this.jj_2_rtns;
                if (i11 >= jJCallsArr.length) {
                    break;
                }
                for (JJCalls jJCalls = jJCallsArr[i11]; jJCalls != null; jJCalls = jJCalls.next) {
                    if (jJCalls.gen < this.jj_gen) {
                        jJCalls.first = null;
                    }
                }
                i11++;
            }
        }
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void jj_la1_init_0() {
        jj_la1_0 = new int[]{1, 270534656, 270534656, 67108864, 0, 67108864, 16384, 0, 33570816, 0, 0, 0, 0, 0, 1082429440, 0, 0, 0, 0, 0, 0, 0, 1216647168, 1216647168, 0, 0, 1350864896, 268435456, 0, 0, 1082429440, 1082429440, 1082429440, 1082429440, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1216647168, 0, 1216647168, 1233424384, 0, 1233424384, 134217728, 0, 1216647168, 1216647168, 1216647168, 1216647168, 0, 0, 0, 0, 0, 0, 0, 0, 134217728, 134217728, 1216647168, 0, 0, 1082429440, 0, 0, 0, 1220841472, -2146426880, 0, 0, 0, 0, 65536, 65536, 0, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 1487181824, 1216647168, 1216647168, 268435456, Integer.MIN_VALUE, 1216647168, 0, 0, 0, Opcodes.ACC_DEPRECATED, 536870912, 268435456, 0, 0, 0, 0};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void jj_la1_init_1() {
        jj_la1_1 = new int[]{0, 137785600, 137785600, 0, 4, 0, 64, 4, 64, 0, Opcodes.ACC_DEPRECATED, 0, 0, 0, 65696, 8388608, Opcodes.ACC_DEPRECATED, Opcodes.ACC_DEPRECATED, 0, 8, 0, 0, 1426130592, 1426130592, 0, 0, 65696, 0, 0, 0, 65696, 67174560, 65696, 65696, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1426130592, 0, 1426261664, 1426130592, 0, 1426130592, 1426064896, 0, 1426130592, 1426130592, 1426130592, 1426130592, 0, 0, 0, Opcodes.ACC_INTERFACE, 0, 0, 0, 0, 1157628928, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 1426130592, 0, 0, 65696, Opcodes.ACC_INTERFACE, 0, 0, 1963525794, 38830080, Opcodes.ACC_DEPRECATED, 2056, 0, 0, 0, 0, 0, 0, 1563916192, 1426130592, 1426130592, 0, 0, 1426130592, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void jj_la1_init_2() {
        jj_la1_2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 4096, 16384, Opcodes.ACC_INTERFACE, 524288, Opcodes.ASM4, Opcodes.ACC_INTERFACE, 0, 16384, 0, 1048576, 0, 65536, 2097152, 201413576, 201413576, 524288, 524288, Opcodes.ACC_INTERFACE, 0, 0, Opcodes.ACC_INTERFACE, Opcodes.ACC_INTERFACE, Opcodes.ACC_INTERFACE, 0, Opcodes.ACC_INTERFACE, 524288, 2097152, 2097152, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 268435456, 268435456, 0, -473956352, -473956352, 0, 0, 0, 0, 0, 0, 0, 0, 201326592, 0, 0, 0, 201326592, 86984, 4608, 201413576, 201413576, 524288, 201413576, 86472, Opcodes.ACC_INTERFACE, 201413576, 201413576, 201413576, 201413576, 0, 0, 0, Opcodes.ACC_INTERFACE, 4096, 4096, 65536, 16384, 456, 0, 201413576, 524288, 86016, 82432, 81920, 65536, 81920, 201675720, 0, 0, 0, Opcodes.ASM4, Opcodes.ASM4, 0, 0, Opcodes.ASM4, 0, 201413576, 201413576, 201413576, 0, 0, 201413576, 524288, 524288, 4096, 0, 0, 0, 0, Opcodes.ACC_INTERFACE, Opcodes.ASM4, Opcodes.ACC_INTERFACE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void jj_la1_init_3() {
        jj_la1_3 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 960, 960, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -268435456, -268435456, 0, 0, 0, 12, 12, 48, 48, 49152, 49152, 196608, 196608, 12288, 12288, 2, 2, 0, 1, 1, 264241152, 264241152, 768, 768, 789504, 789504, 3145728, 3145728, 768, Opcodes.CHECKCAST, Opcodes.CHECKCAST, Opcodes.CHECKCAST, 960, 0, 0, 960, 960, 0, 960, 0, 0, 960, 960, 960, 960, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 960, 0, 0, 0, 0, 0, 0, 960, 0, 0, 0, 0, 0, 0, 0, 0, 0, 960, 960, 960, 0, 0, 960, 0, 0, 0, 0, 0, 0, 16384, 0, 0, 0};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void jj_la1_init_4() {
        jj_la1_4 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 0, 0, 0, 0, 0, 0, 327679, 327679, 2097152, 1703936, 1703936, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4194304, 12582912, 12582912, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67108864, 67108864, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jj_ntk_f() {
        Token token = this.token;
        Token token2 = token.next;
        this.jj_nt = token2;
        if (token2 != null) {
            int i9 = token2.kind;
            this.jj_ntk = i9;
            return i9;
        }
        token.next = this.token_source.getNextToken();
        int i10 = this.token.next.kind;
        this.jj_ntk = i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jj_rescan_token() {
        this.jj_rescan = true;
        for (int i9 = 0; i9 < 41; i9++) {
            try {
                JJCalls jJCalls = this.jj_2_rtns[i9];
                do {
                    if (jJCalls.gen > this.jj_gen) {
                        this.jj_la = jJCalls.arg;
                        Token token = jJCalls.first;
                        this.jj_scanpos = token;
                        this.jj_lastpos = token;
                        switch (i9) {
                            case 0:
                                jj_3_1();
                                break;
                            case 1:
                                jj_3_2();
                                break;
                            case 2:
                                jj_3_3();
                                break;
                            case 3:
                                jj_3_4();
                                break;
                            case 4:
                                jj_3_5();
                                break;
                            case 5:
                                jj_3_6();
                                break;
                            case 6:
                                jj_3_7();
                                break;
                            case 7:
                                jj_3_8();
                                break;
                            case 8:
                                jj_3_9();
                                break;
                            case 9:
                                jj_3_10();
                                break;
                            case 10:
                                jj_3_11();
                                break;
                            case 11:
                                jj_3_12();
                                break;
                            case 12:
                                jj_3_13();
                                break;
                            case 13:
                                jj_3_14();
                                break;
                            case 14:
                                jj_3_15();
                                break;
                            case 15:
                                jj_3_16();
                                break;
                            case 16:
                                jj_3_17();
                                break;
                            case 17:
                                jj_3_18();
                                break;
                            case 18:
                                jj_3_19();
                                break;
                            case 19:
                                jj_3_20();
                                break;
                            case 20:
                                jj_3_21();
                                break;
                            case 21:
                                jj_3_22();
                                break;
                            case 22:
                                jj_3_23();
                                break;
                            case 23:
                                jj_3_24();
                                break;
                            case 24:
                                jj_3_25();
                                break;
                            case 25:
                                jj_3_26();
                                break;
                            case 26:
                                jj_3_27();
                                break;
                            case 27:
                                jj_3_28();
                                break;
                            case 28:
                                jj_3_29();
                                break;
                            case 29:
                                jj_3_30();
                                break;
                            case 30:
                                jj_3_31();
                                break;
                            case 31:
                                jj_3_32();
                                break;
                            case 32:
                                jj_3_33();
                                break;
                            case 33:
                                jj_3_34();
                                break;
                            case 34:
                                jj_3_35();
                                break;
                            case 35:
                                jj_3_36();
                                break;
                            case 36:
                                jj_3_37();
                                break;
                            case 37:
                                jj_3_38();
                                break;
                            case 38:
                                jj_3_39();
                                break;
                            case 39:
                                jj_3_40();
                                break;
                            case 40:
                                jj_3_41();
                                break;
                        }
                    }
                    jJCalls = jJCalls.next;
                } while (jJCalls != null);
            } catch (LookaheadSuccess unused) {
            }
        }
        this.jj_rescan = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jj_save(int i9, int i10) {
        JJCalls jJCalls = this.jj_2_rtns[i9];
        while (true) {
            if (jJCalls.gen <= this.jj_gen) {
                break;
            }
            JJCalls jJCalls2 = jJCalls.next;
            if (jJCalls2 == null) {
                JJCalls jJCalls3 = new JJCalls();
                jJCalls.next = jJCalls3;
                jJCalls = jJCalls3;
                break;
            }
            jJCalls = jJCalls2;
        }
        jJCalls.gen = (this.jj_gen + i10) - this.jj_la;
        jJCalls.first = this.token;
        jJCalls.arg = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean jj_scan_token(int i9) {
        Token token = this.jj_scanpos;
        if (token == this.jj_lastpos) {
            this.jj_la--;
            Token token2 = token.next;
            if (token2 == null) {
                Token nextToken = this.token_source.getNextToken();
                token.next = nextToken;
                this.jj_scanpos = nextToken;
                this.jj_lastpos = nextToken;
            } else {
                this.jj_scanpos = token2;
                this.jj_lastpos = token2;
            }
        } else {
            this.jj_scanpos = token.next;
        }
        if (this.jj_rescan) {
            Token token3 = this.token;
            int i10 = 0;
            while (token3 != null && token3 != this.jj_scanpos) {
                i10++;
                token3 = token3.next;
            }
            if (token3 != null) {
                jj_add_error_token(i9, i10);
            }
        }
        Token token4 = this.jj_scanpos;
        if (token4.kind != i9) {
            return true;
        }
        if (this.jj_la == 0 && token4 == this.jj_lastpos) {
            throw this.jj_ls;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void main(String[] strArr) throws IOException {
        int i9 = strArr[0].equals("-p") ? 1 : 0;
        int i10 = i9;
        while (i9 < strArr.length) {
            FileReader fileReader = new FileReader(strArr[i9]);
            Parser parser = new Parser(fileReader);
            parser.setRetainComments(true);
            while (!parser.Line()) {
                if (i10 != 0) {
                    System.out.println(parser.popNode());
                }
            }
            fileReader.close();
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AdditiveExpression() throws Throwable {
        Token tokenJj_consume_token;
        MultiplicativeExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 104 && iJj_ntk_f != 105) {
                this.jj_la1[57] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 104) {
                tokenJj_consume_token = jj_consume_token(104);
            } else {
                if (iJj_ntk_f2 != 105) {
                    this.jj_la1[58] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(105);
            }
            MultiplicativeExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void AllocationExpression() throws Throwable {
        boolean z9;
        BSHAllocationExpression bSHAllocationExpression = new BSHAllocationExpression(28);
        this.jjtree.openNodeScope(bSHAllocationExpression);
        jjtreeOpenNodeScope(bSHAllocationExpression);
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 41) {
                if (iJj_ntk_f != 78 && iJj_ntk_f != 80) {
                    this.jj_la1[94] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                ArrayDimensions();
            } else {
                jj_consume_token(41);
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                switch (iJj_ntk_f2) {
                    case 12:
                    case 15:
                    case 18:
                    case 23:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                        PrimitiveType();
                        ArrayDimensions();
                        break;
                    case 73:
                        AmbiguousName();
                        int iJj_ntk_f3 = this.jj_ntk;
                        if (iJj_ntk_f3 == -1) {
                            iJj_ntk_f3 = jj_ntk_f();
                        }
                        if (iJj_ntk_f3 == 76) {
                            Arguments();
                            if (jj_2_22(2)) {
                                Block();
                            }
                        } else {
                            if (iJj_ntk_f3 != 78 && iJj_ntk_f3 != 80) {
                                this.jj_la1[92] = this.jj_gen;
                                jj_consume_token(-1);
                                throw new ParseException();
                            }
                            ArrayDimensions();
                        }
                        break;
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        ArrayDimensions();
                        break;
                    default:
                        this.jj_la1[93] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                }
            }
            this.jjtree.closeNodeScope((Node) bSHAllocationExpression, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHAllocationExpression);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHAllocationExpression);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHAllocationExpression, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHAllocationExpression);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AmbiguousName() throws Throwable {
        boolean z9;
        StringBuilder sb2;
        BSHAmbiguousName bSHAmbiguousName = new BSHAmbiguousName(14);
        this.jjtree.openNodeScope(bSHAmbiguousName);
        jjtreeOpenNodeScope(bSHAmbiguousName);
        try {
            sb2 = new StringBuilder(jj_consume_token(73).image);
            while (jj_2_9(2)) {
                jj_consume_token(84);
                sb2.append("." + jj_consume_token(73).image);
            }
            this.jjtree.closeNodeScope((Node) bSHAmbiguousName, true);
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHAmbiguousName);
            }
            bSHAmbiguousName.text = sb2.toString();
        } catch (Throwable th3) {
            z9 = false;
            th = th3;
            if (z9) {
                this.jjtree.closeNodeScope((Node) bSHAmbiguousName, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHAmbiguousName);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AndExpression() throws Throwable {
        Token tokenJj_consume_token;
        EqualityExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 108 && iJj_ntk_f != 109) {
                this.jj_la1[48] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 108) {
                tokenJj_consume_token = jj_consume_token(108);
            } else {
                if (iJj_ntk_f2 != 109) {
                    this.jj_la1[49] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(109);
            }
            EqualityExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ArgumentList() throws Throwable {
        Expression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 83) {
                this.jj_la1[91] = this.jj_gen;
                return;
            } else {
                jj_consume_token(83);
                Expression();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x001f, FALL_THROUGH, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0012, B:5:0x001a, B:16:0x0031, B:17:0x0034, B:18:0x0037, B:19:0x003a, B:21:0x0044, B:20:0x0041), top: B:50:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Arguments() throws Throwable {
        boolean z9;
        BSHArguments bSHArguments = new BSHArguments(27);
        this.jjtree.openNodeScope(bSHArguments);
        jjtreeOpenNodeScope(bSHArguments);
        try {
            jj_consume_token(76);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 41 && iJj_ntk_f != 42 && iJj_ntk_f != 90 && iJj_ntk_f != 91) {
                switch (iJj_ntk_f) {
                    default:
                        switch (iJj_ntk_f) {
                            default:
                                switch (iJj_ntk_f) {
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                        break;
                                    default:
                                        this.jj_la1[90] = this.jj_gen;
                                        break;
                                }
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                break;
                        }
                    case 12:
                    case 15:
                    case 18:
                    case 23:
                    case 27:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                    case 56:
                    case 58:
                    case ParserConstants.WHEN /* 60 */:
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                    case 67:
                    case ParserConstants.LPAREN /* 76 */:
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        break;
                }
            } else {
                ArgumentList();
            }
            jj_consume_token(77);
            this.jjtree.closeNodeScope((Node) bSHArguments, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHArguments);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHArguments);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHArguments, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHArguments);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ArrayDimensions() throws Throwable {
        boolean z9;
        int iJj_ntk_f;
        BSHArrayDimensions bSHArrayDimensions = new BSHArrayDimensions(29);
        this.jjtree.openNodeScope(bSHArrayDimensions);
        jjtreeOpenNodeScope(bSHArrayDimensions);
        boolean z10 = false;
        try {
            if (jj_2_25(2)) {
                do {
                    jj_consume_token(80);
                    Expression();
                    jj_consume_token(81);
                    bSHArrayDimensions.addDefinedDimension();
                } while (jj_2_23(2));
                while (jj_2_24(2)) {
                    jj_consume_token(80);
                    jj_consume_token(81);
                    bSHArrayDimensions.addUndefinedDimension();
                }
            } else {
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 == 78) {
                    ArrayInitializer();
                    this.jjtree.closeNodeScope((Node) bSHArrayDimensions, true);
                    try {
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHArrayDimensions);
                        }
                        bSHArrayDimensions.numUndefinedDims = -1;
                        if (z10) {
                            return;
                        }
                        this.jjtree.closeNodeScope((Node) bSHArrayDimensions, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHArrayDimensions);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = false;
                        JJTParserState jJTParserState = this.jjtree;
                        try {
                            if (z9) {
                                jJTParserState.clearNodeScope(bSHArrayDimensions);
                            } else {
                                jJTParserState.popNode();
                                z10 = z9;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            z9 = th instanceof ParseException;
                            if (z9) {
                                throw ((ParseException) th);
                            }
                            if (!(th instanceof RuntimeException)) {
                                throw ((Error) th);
                            }
                            throw ((RuntimeException) th);
                        } catch (Throwable th4) {
                            z9 = z10;
                            th = th4;
                            if (z9) {
                                this.jjtree.closeNodeScope((Node) bSHArrayDimensions, true);
                                if (this.jjtree.nodeCreated()) {
                                    jjtreeCloseNodeScope(bSHArrayDimensions);
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (iJj_ntk_f2 != 80) {
                    this.jj_la1[96] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                do {
                    jj_consume_token(80);
                    jj_consume_token(81);
                    bSHArrayDimensions.addUndefinedDimension();
                    iJj_ntk_f = this.jj_ntk;
                    if (iJj_ntk_f == -1) {
                        iJj_ntk_f = jj_ntk_f();
                    }
                } while (iJj_ntk_f == 80);
                this.jj_la1[95] = this.jj_gen;
                ArrayInitializer();
            }
            z10 = true;
            if (z10) {
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[Catch: all -> 0x001f, FALL_THROUGH, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0012, B:5:0x001a, B:16:0x0033, B:17:0x0036, B:18:0x0039, B:19:0x003c, B:24:0x0056, B:26:0x005a, B:28:0x0060, B:30:0x006c, B:29:0x0069, B:20:0x0045, B:21:0x0048, B:23:0x004f), top: B:59:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ArrayInitializer() throws Throwable {
        boolean z9;
        BSHArrayInitializer bSHArrayInitializer = new BSHArrayInitializer(8);
        this.jjtree.openNodeScope(bSHArrayInitializer);
        jjtreeOpenNodeScope(bSHArrayInitializer);
        try {
            jj_consume_token(78);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 41 && iJj_ntk_f != 42 && iJj_ntk_f != 90 && iJj_ntk_f != 91) {
                switch (iJj_ntk_f) {
                    default:
                        switch (iJj_ntk_f) {
                            default:
                                switch (iJj_ntk_f) {
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                        break;
                                    default:
                                        this.jj_la1[23] = this.jj_gen;
                                        break;
                                }
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                break;
                        }
                    case 12:
                    case 15:
                    case 18:
                    case 23:
                    case 27:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                    case 56:
                    case 58:
                    case ParserConstants.WHEN /* 60 */:
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                    case 67:
                    case ParserConstants.LPAREN /* 76 */:
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        break;
                }
            } else {
                VariableInitializer();
                while (jj_2_6(2)) {
                    jj_consume_token(83);
                    VariableInitializer();
                }
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 83) {
                this.jj_la1[24] = this.jj_gen;
            } else {
                jj_consume_token(83);
            }
            jj_consume_token(79);
            this.jjtree.closeNodeScope((Node) bSHArrayInitializer, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHArrayInitializer);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHArrayInitializer);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHArrayInitializer, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHArrayInitializer);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int AssignmentOperator() throws ParseException {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f == 85) {
            jj_consume_token(85);
        } else if (iJj_ntk_f != 146) {
            switch (iJj_ntk_f) {
                case 124:
                    jj_consume_token(124);
                    break;
                case 125:
                    jj_consume_token(125);
                    break;
                case 126:
                    jj_consume_token(126);
                    break;
                case 127:
                    jj_consume_token(127);
                    break;
                case 128:
                    jj_consume_token(128);
                    break;
                case 129:
                    jj_consume_token(129);
                    break;
                case 130:
                    jj_consume_token(130);
                    break;
                case 131:
                    jj_consume_token(131);
                    break;
                case 132:
                    jj_consume_token(132);
                    break;
                case 133:
                    jj_consume_token(133);
                    break;
                case 134:
                    jj_consume_token(134);
                    break;
                case 135:
                    jj_consume_token(135);
                    break;
                case 136:
                    jj_consume_token(136);
                    break;
                case 137:
                    jj_consume_token(137);
                    break;
                case 138:
                    jj_consume_token(138);
                    break;
                case 139:
                    jj_consume_token(139);
                    break;
                case 140:
                    jj_consume_token(140);
                    break;
                case 141:
                    jj_consume_token(141);
                    break;
                case 142:
                    jj_consume_token(142);
                    break;
                case 143:
                    jj_consume_token(143);
                    break;
                default:
                    this.jj_la1[36] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return 0;
            }
        } else {
            jj_consume_token(146);
        }
        return getToken(0).kind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void AutoCloseable() throws Throwable {
        boolean z9;
        BSHAutoCloseable bSHAutoCloseable = new BSHAutoCloseable(44);
        this.jjtree.openNodeScope(bSHAutoCloseable);
        jjtreeOpenNodeScope(bSHAutoCloseable);
        try {
            if (jj_2_41(2)) {
                Type();
                VariableDeclarator();
            } else {
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 73) {
                    this.jj_la1[122] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                VariableDeclarator();
            }
            this.jjtree.closeNodeScope((Node) bSHAutoCloseable, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHAutoCloseable);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHAutoCloseable);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHAutoCloseable, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHAutoCloseable);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Block() throws Throwable {
        boolean z9;
        Token tokenJj_consume_token;
        BSHBlock bSHBlock = new BSHBlock(3);
        this.jjtree.openNodeScope(bSHBlock);
        jjtreeOpenNodeScope(bSHBlock);
        boolean z10 = false;
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 49) {
                this.jj_la1[99] = this.jj_gen;
                tokenJj_consume_token = null;
            } else {
                tokenJj_consume_token = jj_consume_token(49);
            }
            jj_consume_token(78);
            while (jj_2_28(1)) {
                BlockStatement();
            }
            jj_consume_token(79);
            this.jjtree.closeNodeScope((Node) bSHBlock, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBlock);
                }
                if (tokenJj_consume_token != null) {
                    bSHBlock.isStatic = true;
                }
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHBlock);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    z9 = z10;
                    th = th4;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHBlock, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHBlock);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void BlockStatement() throws Throwable {
        if (jj_2_29(Integer.MAX_VALUE)) {
            ClassDeclaration();
            return;
        }
        if (jj_2_30(Integer.MAX_VALUE)) {
            MethodDeclaration();
            return;
        }
        if (jj_2_31(Integer.MAX_VALUE)) {
            MethodDeclaration();
            return;
        }
        if (jj_2_32(Integer.MAX_VALUE)) {
            TypedVariableDeclaration();
            StatementTerminator();
            return;
        }
        if (jj_2_33(1)) {
            Statement();
            return;
        }
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f == 35) {
            ImportDeclaration();
        } else {
            if (iJj_ntk_f == 43) {
                PackageDeclaration();
                return;
            }
            this.jj_la1[100] = this.jj_gen;
            jj_consume_token(-1);
            C0353j.m1303a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean BooleanLiteral() throws ParseException {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f == 27) {
            jj_consume_token(27);
            return false;
        }
        if (iJj_ntk_f == 56) {
            jj_consume_token(56);
            return true;
        }
        this.jj_la1[89] = this.jj_gen;
        jj_consume_token(-1);
        C0353j.m1303a();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void BreakStatement() throws Throwable {
        boolean z9;
        BSHReturnStatement bSHReturnStatement = new BSHReturnStatement(39);
        this.jjtree.openNodeScope(bSHReturnStatement);
        jjtreeOpenNodeScope(bSHReturnStatement);
        boolean z10 = false;
        try {
            jj_consume_token(13);
            if (jj_2_38(2)) {
                Token tokenJj_consume_token = jj_consume_token(73);
                jj_consume_token(82);
                bSHReturnStatement.label = tokenJj_consume_token.image;
            } else {
                StatementTerminator();
            }
            this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHReturnStatement);
                }
                bSHReturnStatement.kind = 13;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHReturnStatement);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    z9 = z10;
                    th = th4;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHReturnStatement);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void CastExpression() throws Throwable {
        boolean z9;
        BSHCastExpression bSHCastExpression = new BSHCastExpression(19);
        this.jjtree.openNodeScope(bSHCastExpression);
        jjtreeOpenNodeScope(bSHCastExpression);
        try {
            jj_consume_token(76);
            Type();
            jj_consume_token(77);
            UnaryExpression();
            this.jjtree.closeNodeScope((Node) bSHCastExpression, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHCastExpression);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHCastExpression);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHCastExpression, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHCastExpression);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x001d, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x000f, B:5:0x0018, B:14:0x0032, B:15:0x0042, B:16:0x0043, B:18:0x0052, B:20:0x0058, B:22:0x0069, B:50:0x00f6, B:21:0x0060, B:23:0x006e, B:25:0x0072, B:29:0x007c, B:31:0x008b, B:33:0x0091, B:49:0x00f3, B:34:0x0099, B:35:0x00a3, B:36:0x00b2, B:37:0x00b3, B:39:0x00c2, B:41:0x00c8, B:43:0x00d8, B:45:0x00dc, B:47:0x00e2, B:48:0x00ea, B:42:0x00d0), top: B:89:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[Catch: all -> 0x001d, TryCatch #3 {all -> 0x001d, blocks: (B:3:0x000f, B:5:0x0018, B:14:0x0032, B:15:0x0042, B:16:0x0043, B:18:0x0052, B:20:0x0058, B:22:0x0069, B:50:0x00f6, B:21:0x0060, B:23:0x006e, B:25:0x0072, B:29:0x007c, B:31:0x008b, B:33:0x0091, B:49:0x00f3, B:34:0x0099, B:35:0x00a3, B:36:0x00b2, B:37:0x00b3, B:39:0x00c2, B:41:0x00c8, B:43:0x00d8, B:45:0x00dc, B:47:0x00e2, B:48:0x00ea, B:42:0x00d0), top: B:89:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:51:0x00fb, B:53:0x0103, B:57:0x010c, B:58:0x010e), top: B:84:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:51:0x00fb, B:53:0x0103, B:57:0x010c, B:58:0x010e), top: B:84:0x00fb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ClassDeclaration() throws Throwable {
        boolean z9;
        int iJj_ntk_f;
        Token tokenJj_consume_token;
        BSHClassDeclaration bSHClassDeclaration = new BSHClassDeclaration(1);
        this.jjtree.openNodeScope(bSHClassDeclaration);
        jjtreeOpenNodeScope(bSHClassDeclaration);
        boolean z10 = false;
        try {
            Modifiers Modifiers = Modifiers(0, false);
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 14) {
                if (iJj_ntk_f2 != 25) {
                    if (iJj_ntk_f2 != 38) {
                        this.jj_la1[8] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                    }
                    iJj_ntk_f = this.jj_ntk;
                    if (iJj_ntk_f == -1) {
                    }
                    if (iJj_ntk_f != 14) {
                    }
                    Block();
                    this.jjtree.closeNodeScope((Node) bSHClassDeclaration, true);
                    if (this.jjtree.nodeCreated()) {
                    }
                    if (Modifiers != null) {
                    }
                    bSHClassDeclaration.name = tokenJj_consume_token.image;
                    return;
                }
                jj_consume_token(25);
                bSHClassDeclaration.type = ClassGenerator.Type.ENUM;
                tokenJj_consume_token = jj_consume_token(73);
                int iJj_ntk_f3 = this.jj_ntk;
                if (iJj_ntk_f3 == -1) {
                    iJj_ntk_f3 = jj_ntk_f();
                }
                if (iJj_ntk_f3 != 34) {
                    this.jj_la1[7] = this.jj_gen;
                } else {
                    jj_consume_token(34);
                    bSHClassDeclaration.numInterfaces = NameList();
                }
                EnumBlock();
                this.jjtree.closeNodeScope((Node) bSHClassDeclaration, true);
                if (this.jjtree.nodeCreated()) {
                }
                if (Modifiers != null) {
                }
                bSHClassDeclaration.name = tokenJj_consume_token.image;
                return;
            }
            iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 14) {
                jj_consume_token(14);
                bSHClassDeclaration.type = ClassGenerator.Type.CLASS;
                tokenJj_consume_token = jj_consume_token(73);
                int iJj_ntk_f4 = this.jj_ntk;
                if (iJj_ntk_f4 == -1) {
                    iJj_ntk_f4 = jj_ntk_f();
                }
                if (iJj_ntk_f4 != 26) {
                    this.jj_la1[3] = this.jj_gen;
                } else {
                    jj_consume_token(26);
                    AmbiguousName();
                    bSHClassDeclaration.extend = true;
                }
                int iJj_ntk_f5 = this.jj_ntk;
                if (iJj_ntk_f5 == -1) {
                    iJj_ntk_f5 = jj_ntk_f();
                }
                if (iJj_ntk_f5 != 34) {
                    this.jj_la1[4] = this.jj_gen;
                } else {
                    jj_consume_token(34);
                    bSHClassDeclaration.numInterfaces = NameList();
                }
            } else {
                if (iJj_ntk_f != 38) {
                    this.jj_la1[6] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                jj_consume_token(38);
                bSHClassDeclaration.type = ClassGenerator.Type.INTERFACE;
                tokenJj_consume_token = jj_consume_token(73);
                int iJj_ntk_f6 = this.jj_ntk;
                if (iJj_ntk_f6 == -1) {
                    iJj_ntk_f6 = jj_ntk_f();
                }
                if (iJj_ntk_f6 != 26) {
                    this.jj_la1[5] = this.jj_gen;
                } else {
                    jj_consume_token(26);
                    bSHClassDeclaration.numInterfaces = NameList();
                }
            }
            Block();
            this.jjtree.closeNodeScope((Node) bSHClassDeclaration, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHClassDeclaration);
                }
                if (Modifiers != null) {
                    bSHClassDeclaration.modifiers = Modifiers;
                }
                bSHClassDeclaration.name = tokenJj_consume_token.image;
                return;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
            }
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
        }
        JJTParserState jJTParserState = this.jjtree;
        try {
            if (z9) {
                jJTParserState.clearNodeScope(bSHClassDeclaration);
            } else {
                jJTParserState.popNode();
                z10 = z9;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            z9 = th instanceof ParseException;
            if (z9) {
                throw ((ParseException) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw ((Error) th);
            }
            throw ((RuntimeException) th);
        } catch (Throwable th5) {
            z9 = z10;
            th = th5;
            if (z9) {
                this.jjtree.closeNodeScope((Node) bSHClassDeclaration, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHClassDeclaration);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ConditionalAndExpression() throws Throwable {
        Token tokenJj_consume_token;
        InclusiveOrExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 100 && iJj_ntk_f != 101) {
                this.jj_la1[42] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 100) {
                tokenJj_consume_token = jj_consume_token(100);
            } else {
                if (iJj_ntk_f2 != 101) {
                    this.jj_la1[43] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(101);
            }
            InclusiveOrExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void ConditionalExpression() throws Throwable {
        NullCoalesceElvisSpaceShipExpression();
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 149) {
            this.jj_la1[37] = this.jj_gen;
            return;
        }
        jj_consume_token(149);
        Expression();
        jj_consume_token(150);
        BSHTernaryExpression bSHTernaryExpression = new BSHTernaryExpression(16);
        this.jjtree.openNodeScope(bSHTernaryExpression);
        jjtreeOpenNodeScope(bSHTernaryExpression);
        try {
            ConditionalExpression();
            this.jjtree.closeNodeScope(bSHTernaryExpression, 3);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHTernaryExpression);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHTernaryExpression);
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th3) {
                if (1 != 0) {
                    this.jjtree.closeNodeScope(bSHTernaryExpression, 3);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHTernaryExpression);
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ConditionalOrExpression() throws Throwable {
        Token tokenJj_consume_token;
        ConditionalAndExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 98 && iJj_ntk_f != 99) {
                this.jj_la1[40] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 98) {
                tokenJj_consume_token = jj_consume_token(98);
            } else {
                if (iJj_ntk_f2 != 99) {
                    this.jj_la1[41] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(99);
            }
            ConditionalAndExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ContinueStatement() throws Throwable {
        boolean z9;
        BSHReturnStatement bSHReturnStatement = new BSHReturnStatement(39);
        this.jjtree.openNodeScope(bSHReturnStatement);
        jjtreeOpenNodeScope(bSHReturnStatement);
        boolean z10 = false;
        try {
            jj_consume_token(20);
            if (jj_2_39(2)) {
                Token tokenJj_consume_token = jj_consume_token(73);
                jj_consume_token(82);
                bSHReturnStatement.label = tokenJj_consume_token.image;
            } else {
                StatementTerminator();
            }
            this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHReturnStatement);
                }
                bSHReturnStatement.kind = 20;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHReturnStatement);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    z9 = z10;
                    th = th4;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHReturnStatement);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void DoStatement() throws Throwable {
        boolean z9;
        BSHWhileStatement bSHWhileStatement = new BSHWhileStatement(34);
        this.jjtree.openNodeScope(bSHWhileStatement);
        jjtreeOpenNodeScope(bSHWhileStatement);
        boolean z10 = false;
        try {
            jj_consume_token(22);
            Statement();
            jj_consume_token(61);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            StatementTerminator();
            this.jjtree.closeNodeScope((Node) bSHWhileStatement, true);
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHWhileStatement);
            }
            bSHWhileStatement.isDoStatement = true;
        } catch (Throwable th3) {
            th = th3;
            z9 = false;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHWhileStatement);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    th = th4;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHWhileStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHWhileStatement);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void EmptyStatement() throws ParseException {
        jj_consume_token(82);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void EnhancedForStatement() throws Throwable {
        boolean z9;
        BSHEnhancedForStatement bSHEnhancedForStatement = new BSHEnhancedForStatement(36);
        this.jjtree.openNodeScope(bSHEnhancedForStatement);
        jjtreeOpenNodeScope(bSHEnhancedForStatement);
        boolean z10 = false;
        try {
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        try {
            if (jj_2_36(4)) {
                jj_consume_token(31);
                jj_consume_token(76);
                Token tokenJj_consume_token = jj_consume_token(73);
                jj_consume_token(150);
                Expression();
                jj_consume_token(77);
                Statement();
                this.jjtree.closeNodeScope((Node) bSHEnhancedForStatement, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHEnhancedForStatement);
                }
                bSHEnhancedForStatement.varName = tokenJj_consume_token.image;
                return;
            }
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 31) {
                this.jj_la1[111] = this.jj_gen;
                jj_consume_token(-1);
                throw new ParseException();
            }
            jj_consume_token(31);
            jj_consume_token(76);
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 28) {
                this.jj_la1[110] = this.jj_gen;
            } else {
                jj_consume_token(28);
                bSHEnhancedForStatement.isFinal = true;
            }
            Type();
            Token tokenJj_consume_token2 = jj_consume_token(73);
            jj_consume_token(150);
            Expression();
            jj_consume_token(77);
            Statement();
            this.jjtree.closeNodeScope((Node) bSHEnhancedForStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHEnhancedForStatement);
            }
            bSHEnhancedForStatement.varName = tokenJj_consume_token2.image;
        } catch (Throwable th3) {
            th = th3;
            z9 = false;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHEnhancedForStatement);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                z9 = th instanceof ParseException;
                if (z9) {
                    throw ((ParseException) th);
                }
                if (!(th instanceof RuntimeException)) {
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            } catch (Throwable th5) {
                th = th5;
                z9 = z10;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHEnhancedForStatement, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHEnhancedForStatement);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void EnumBlock() throws Throwable {
        boolean z9;
        BSHBlock bSHBlock = new BSHBlock(3);
        this.jjtree.openNodeScope(bSHBlock);
        jjtreeOpenNodeScope(bSHBlock);
        try {
            jj_consume_token(78);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 73) {
                this.jj_la1[11] = this.jj_gen;
            } else {
                EnumConstant();
            }
            while (true) {
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 != 83) {
                    break;
                }
                jj_consume_token(83);
                EnumConstant();
            }
            this.jj_la1[12] = this.jj_gen;
            int iJj_ntk_f3 = this.jj_ntk;
            if (iJj_ntk_f3 == -1) {
                iJj_ntk_f3 = jj_ntk_f();
            }
            if (iJj_ntk_f3 != 82) {
                this.jj_la1[13] = this.jj_gen;
            } else {
                jj_consume_token(82);
                while (jj_2_2(1)) {
                    BlockStatement();
                }
            }
            jj_consume_token(79);
            this.jjtree.closeNodeScope((Node) bSHBlock, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHBlock);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHBlock);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHBlock, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHBlock);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void EnumConstant() throws Throwable {
        boolean z9;
        BSHEnumConstant bSHEnumConstant = new BSHEnumConstant(2);
        this.jjtree.openNodeScope(bSHEnumConstant);
        jjtreeOpenNodeScope(bSHEnumConstant);
        boolean z10 = false;
        try {
            Token tokenJj_consume_token = jj_consume_token(73);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 76) {
                this.jj_la1[9] = this.jj_gen;
            } else {
                Arguments();
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 49 || iJj_ntk_f2 == 78) {
                Block();
            } else {
                this.jj_la1[10] = this.jj_gen;
            }
            this.jjtree.closeNodeScope((Node) bSHEnumConstant, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHEnumConstant);
                }
                bSHEnumConstant.name = tokenJj_consume_token.image;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHEnumConstant);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    th = th4;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHEnumConstant, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHEnumConstant);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void EqualityExpression() throws Throwable {
        Token tokenJj_consume_token;
        InstanceOfExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 92 && iJj_ntk_f != 97) {
                this.jj_la1[50] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 92) {
                tokenJj_consume_token = jj_consume_token(92);
            } else {
                if (iJj_ntk_f2 != 97) {
                    this.jj_la1[51] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(97);
            }
            InstanceOfExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ExclusiveOrExpression() throws Throwable {
        Token tokenJj_consume_token;
        AndExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 112 && iJj_ntk_f != 113) {
                this.jj_la1[46] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 112) {
                tokenJj_consume_token = jj_consume_token(112);
            } else {
                if (iJj_ntk_f2 != 113) {
                    this.jj_la1[47] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(113);
            }
            AndExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0010, B:5:0x0018, B:12:0x0027, B:13:0x002a, B:14:0x0033), top: B:43:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Expression() throws Throwable {
        boolean z9;
        BSHAssignment bSHAssignment = new BSHAssignment(15);
        this.jjtree.openNodeScope(bSHAssignment);
        jjtreeOpenNodeScope(bSHAssignment);
        try {
            ConditionalExpression();
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 85 && iJj_ntk_f != 146) {
                switch (iJj_ntk_f) {
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                        break;
                    default:
                        this.jj_la1[35] = this.jj_gen;
                        break;
                }
            } else {
                bSHAssignment.operator = Integer.valueOf(AssignmentOperator());
                Expression();
            }
            this.jjtree.closeNodeScope((Node) bSHAssignment, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHAssignment);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHAssignment);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHAssignment, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHAssignment);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ExtensionName() throws Throwable {
        boolean z9;
        Token tokenJj_consume_token;
        BSHAmbiguousName bSHAmbiguousName = new BSHAmbiguousName(14);
        this.jjtree.openNodeScope(bSHAmbiguousName);
        jjtreeOpenNodeScope(bSHAmbiguousName);
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f == 12) {
                tokenJj_consume_token = jj_consume_token(12);
            } else if (iJj_ntk_f == 15) {
                tokenJj_consume_token = jj_consume_token(15);
            } else if (iJj_ntk_f == 18) {
                tokenJj_consume_token = jj_consume_token(18);
            } else if (iJj_ntk_f == 23) {
                tokenJj_consume_token = jj_consume_token(23);
            } else if (iJj_ntk_f == 30) {
                tokenJj_consume_token = jj_consume_token(30);
            } else if (iJj_ntk_f == 37) {
                tokenJj_consume_token = jj_consume_token(37);
            } else if (iJj_ntk_f == 39) {
                tokenJj_consume_token = jj_consume_token(39);
            } else if (iJj_ntk_f == 48) {
                tokenJj_consume_token = jj_consume_token(48);
            } else {
                if (iJj_ntk_f != 73) {
                    this.jj_la1[33] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                tokenJj_consume_token = jj_consume_token(73);
            }
            StringBuilder sb2 = new StringBuilder(tokenJj_consume_token.image);
            while (jj_2_10(2)) {
                jj_consume_token(80);
                jj_consume_token(81);
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            while (jj_2_11(2)) {
                jj_consume_token(84);
                sb2.append("." + jj_consume_token(73).image);
                while (jj_2_12(2)) {
                    jj_consume_token(80);
                    jj_consume_token(81);
                    sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
            }
            this.jjtree.closeNodeScope((Node) bSHAmbiguousName, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHAmbiguousName);
                }
                bSHAmbiguousName.text = sb2.toString();
            } catch (Throwable th2) {
                z9 = false;
                th = th2;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHAmbiguousName, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHAmbiguousName);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ForInit() throws Throwable {
        if (jj_2_37(Integer.MAX_VALUE)) {
            TypedVariableDeclaration();
            return;
        }
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 41 && iJj_ntk_f != 42 && iJj_ntk_f != 90 && iJj_ntk_f != 91) {
            switch (iJj_ntk_f) {
                case 12:
                case 15:
                case 18:
                case 23:
                case 27:
                case 30:
                case 37:
                case 39:
                case 48:
                case 56:
                case 58:
                case ParserConstants.WHEN /* 60 */:
                case ParserConstants.INTEGER_LITERAL /* 62 */:
                case 67:
                case ParserConstants.LPAREN /* 76 */:
                case ParserConstants.LBRACE /* 78 */:
                case 80:
                    break;
                default:
                    switch (iJj_ntk_f) {
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                            break;
                        default:
                            switch (iJj_ntk_f) {
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                    break;
                                default:
                                    this.jj_la1[112] = this.jj_gen;
                                    jj_consume_token(-1);
                                    C0353j.m1303a();
                                    break;
                            }
                            return;
                    }
                    break;
            }
        }
        StatementExpressionList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0024, FALL_THROUGH, TryCatch #1 {all -> 0x0024, blocks: (B:3:0x0012, B:5:0x001f, B:8:0x0027, B:9:0x002a, B:11:0x0038, B:13:0x0041, B:19:0x0055, B:20:0x0058, B:21:0x005b, B:22:0x005e, B:24:0x006c, B:26:0x0073, B:31:0x007f, B:32:0x0082, B:33:0x0085, B:34:0x0088, B:36:0x0096, B:35:0x0091, B:23:0x0067, B:10:0x0033), top: B:63:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: all -> 0x0024, FALL_THROUGH, TryCatch #1 {all -> 0x0024, blocks: (B:3:0x0012, B:5:0x001f, B:8:0x0027, B:9:0x002a, B:11:0x0038, B:13:0x0041, B:19:0x0055, B:20:0x0058, B:21:0x005b, B:22:0x005e, B:24:0x006c, B:26:0x0073, B:31:0x007f, B:32:0x0082, B:33:0x0085, B:34:0x0088, B:36:0x0096, B:35:0x0091, B:23:0x0067, B:10:0x0033), top: B:63:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ForStatement() throws Throwable {
        boolean z9;
        BSHForStatement bSHForStatement = new BSHForStatement(35);
        this.jjtree.openNodeScope(bSHForStatement);
        jjtreeOpenNodeScope(bSHForStatement);
        try {
            jj_consume_token(31);
            jj_consume_token(76);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            switch (iJj_ntk_f) {
                case 11:
                case 12:
                case 15:
                case 18:
                case 21:
                case 23:
                case 27:
                case 28:
                case 30:
                case 37:
                case 39:
                case 40:
                case 41:
                case 42:
                case 44:
                case ParserConstants.PROTECTED /* 45 */:
                case 46:
                case 48:
                case 49:
                case 50:
                case 52:
                case 53:
                case 56:
                case 58:
                case ParserConstants.VOLATILE /* 59 */:
                case ParserConstants.WHEN /* 60 */:
                case ParserConstants.INTEGER_LITERAL /* 62 */:
                case 67:
                case 70:
                case 71:
                case 72:
                case 73:
                case ParserConstants.LPAREN /* 76 */:
                case ParserConstants.LBRACE /* 78 */:
                case 80:
                case 90:
                case 91:
                case 102:
                case 103:
                case 104:
                case 105:
                    ForInit();
                    bSHForStatement.hasForInit = true;
                    break;
                default:
                    this.jj_la1[107] = this.jj_gen;
                    break;
            }
            jj_consume_token(82);
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 41 && iJj_ntk_f2 != 42 && iJj_ntk_f2 != 90 && iJj_ntk_f2 != 91) {
                switch (iJj_ntk_f2) {
                    default:
                        switch (iJj_ntk_f2) {
                            default:
                                switch (iJj_ntk_f2) {
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                        break;
                                    default:
                                        this.jj_la1[108] = this.jj_gen;
                                        break;
                                }
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                break;
                        }
                    case 12:
                    case 15:
                    case 18:
                    case 23:
                    case 27:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                    case 56:
                    case 58:
                    case ParserConstants.WHEN /* 60 */:
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                    case 67:
                    case ParserConstants.LPAREN /* 76 */:
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        break;
                }
            } else {
                Expression();
                bSHForStatement.hasExpression = true;
            }
            jj_consume_token(82);
            int iJj_ntk_f3 = this.jj_ntk;
            if (iJj_ntk_f3 == -1) {
                iJj_ntk_f3 = jj_ntk_f();
            }
            if (iJj_ntk_f3 != 41 && iJj_ntk_f3 != 42 && iJj_ntk_f3 != 90 && iJj_ntk_f3 != 91) {
                switch (iJj_ntk_f3) {
                    default:
                        switch (iJj_ntk_f3) {
                            default:
                                switch (iJj_ntk_f3) {
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                        break;
                                    default:
                                        this.jj_la1[109] = this.jj_gen;
                                        break;
                                }
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                break;
                        }
                    case 12:
                    case 15:
                    case 18:
                    case 23:
                    case 27:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                    case 56:
                    case 58:
                    case ParserConstants.WHEN /* 60 */:
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                    case 67:
                    case ParserConstants.LPAREN /* 76 */:
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        break;
                }
            } else {
                ForUpdate();
                bSHForStatement.hasForUpdate = true;
            }
            jj_consume_token(77);
            Statement();
            this.jjtree.closeNodeScope((Node) bSHForStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHForStatement);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHForStatement);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHForStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHForStatement);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ForUpdate() throws Throwable {
        StatementExpressionList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void FormalParameter() throws Throwable {
        boolean z9;
        BSHFormalParameter bSHFormalParameter = new BSHFormalParameter(10);
        this.jjtree.openNodeScope(bSHFormalParameter);
        jjtreeOpenNodeScope(bSHFormalParameter);
        try {
            boolean zJj_2_7 = jj_2_7(2);
            int iJj_ntk_f = this.jj_ntk;
            if (zJj_2_7) {
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 28) {
                    this.jj_la1[27] = this.jj_gen;
                } else {
                    jj_consume_token(28);
                    bSHFormalParameter.isFinal = true;
                }
                Type();
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 != 152) {
                    this.jj_la1[28] = this.jj_gen;
                } else {
                    jj_consume_token(152);
                    bSHFormalParameter.isVarArgs = true;
                }
                bSHFormalParameter.name = jj_consume_token(73).image;
            } else {
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 73) {
                    this.jj_la1[29] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                bSHFormalParameter.name = jj_consume_token(73).image;
            }
            while (isFormalParameterDimensions()) {
                jj_consume_token(80);
                jj_consume_token(81);
                bSHFormalParameter.dimensions++;
            }
            this.jjtree.closeNodeScope((Node) bSHFormalParameter, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHFormalParameter);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHFormalParameter);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHFormalParameter, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHFormalParameter);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void FormalParameters() throws Throwable {
        boolean z9;
        BSHFormalParameters bSHFormalParameters = new BSHFormalParameters(9);
        this.jjtree.openNodeScope(bSHFormalParameters);
        jjtreeOpenNodeScope(bSHFormalParameters);
        try {
            jj_consume_token(76);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f == 12 || iJj_ntk_f == 15 || iJj_ntk_f == 18 || iJj_ntk_f == 23 || iJj_ntk_f == 28 || iJj_ntk_f == 30 || iJj_ntk_f == 37 || iJj_ntk_f == 39 || iJj_ntk_f == 48 || iJj_ntk_f == 73) {
                FormalParameter();
                while (true) {
                    int iJj_ntk_f2 = this.jj_ntk;
                    if (iJj_ntk_f2 == -1) {
                        iJj_ntk_f2 = jj_ntk_f();
                    }
                    if (iJj_ntk_f2 != 83) {
                        break;
                    }
                    jj_consume_token(83);
                    FormalParameter();
                }
                this.jj_la1[25] = this.jj_gen;
            } else {
                this.jj_la1[26] = this.jj_gen;
            }
            jj_consume_token(77);
            this.jjtree.closeNodeScope((Node) bSHFormalParameters, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHFormalParameters);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHFormalParameters);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHFormalParameters, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHFormalParameters);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void IfStatement() throws Throwable {
        boolean z9;
        BSHIfStatement bSHIfStatement = new BSHIfStatement(33);
        this.jjtree.openNodeScope(bSHIfStatement);
        jjtreeOpenNodeScope(bSHIfStatement);
        try {
            jj_consume_token(33);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 82) {
                this.jj_la1[105] = this.jj_gen;
                if (!jj_2_35(1)) {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                Statement();
            } else {
                jj_consume_token(82);
                bSHIfStatement.isClosed = true;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 24) {
                this.jj_la1[106] = this.jj_gen;
            } else {
                jj_consume_token(24);
                Statement();
            }
            this.jjtree.closeNodeScope((Node) bSHIfStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHIfStatement);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHIfStatement);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHIfStatement, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHIfStatement);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ImportDeclaration() throws Throwable {
        boolean z9;
        BSHImportDeclaration bSHImportDeclaration = new BSHImportDeclaration(6);
        this.jjtree.openNodeScope(bSHImportDeclaration);
        jjtreeOpenNodeScope(bSHImportDeclaration);
        boolean z10 = false;
        try {
            if (jj_2_4(3)) {
                jj_consume_token(35);
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 49) {
                    this.jj_la1[17] = this.jj_gen;
                } else {
                    jj_consume_token(49);
                    bSHImportDeclaration.staticImport = true;
                }
                AmbiguousName();
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 != 84) {
                    this.jj_la1[18] = this.jj_gen;
                } else {
                    jj_consume_token(84);
                    jj_consume_token(106);
                    bSHImportDeclaration.importPackage = true;
                }
                StatementTerminator();
                z10 = true;
            } else {
                int iJj_ntk_f3 = this.jj_ntk;
                if (iJj_ntk_f3 == -1) {
                    iJj_ntk_f3 = jj_ntk_f();
                }
                if (iJj_ntk_f3 != 35) {
                    this.jj_la1[19] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                jj_consume_token(35);
                jj_consume_token(106);
                StatementTerminator();
                this.jjtree.closeNodeScope((Node) bSHImportDeclaration, true);
                try {
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHImportDeclaration);
                    }
                    bSHImportDeclaration.superImport = true;
                } catch (Throwable th2) {
                    th = th2;
                    z9 = false;
                    JJTParserState jJTParserState = this.jjtree;
                    try {
                        if (z9) {
                            jJTParserState.clearNodeScope(bSHImportDeclaration);
                        } else {
                            jJTParserState.popNode();
                            z10 = z9;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        z9 = th instanceof ParseException;
                        if (z9) {
                            throw ((ParseException) th);
                        }
                        if (!(th instanceof RuntimeException)) {
                            throw ((Error) th);
                        }
                        throw ((RuntimeException) th);
                    } catch (Throwable th4) {
                        th = th4;
                        z9 = z10;
                        if (z9) {
                            this.jjtree.closeNodeScope((Node) bSHImportDeclaration, true);
                            if (this.jjtree.nodeCreated()) {
                                jjtreeCloseNodeScope(bSHImportDeclaration);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (z10) {
                this.jjtree.closeNodeScope((Node) bSHImportDeclaration, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHImportDeclaration);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void InclusiveOrExpression() throws Throwable {
        Token tokenJj_consume_token;
        ExclusiveOrExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 110 && iJj_ntk_f != 111) {
                this.jj_la1[44] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 110) {
                tokenJj_consume_token = jj_consume_token(110);
            } else {
                if (iJj_ntk_f2 != 111) {
                    this.jj_la1[45] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(111);
            }
            ExclusiveOrExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void InstanceOfExpression() throws Throwable {
        RelationalExpression();
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 36) {
            this.jj_la1[52] = this.jj_gen;
            return;
        }
        Token tokenJj_consume_token = jj_consume_token(36);
        Type();
        BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
        this.jjtree.openNodeScope(bSHBinaryExpression);
        jjtreeOpenNodeScope(bSHBinaryExpression);
        boolean z9 = true;
        try {
            this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
            z9 = false;
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHBinaryExpression);
            }
            bSHBinaryExpression.kind = tokenJj_consume_token.kind;
        } catch (Throwable th2) {
            if (z9) {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void LabeledStatement() throws Throwable {
        boolean z9;
        BSHLabeledStatement bSHLabeledStatement = new BSHLabeledStatement(30);
        this.jjtree.openNodeScope(bSHLabeledStatement);
        jjtreeOpenNodeScope(bSHLabeledStatement);
        boolean z10 = false;
        try {
            Token tokenJj_consume_token = jj_consume_token(73);
            jj_consume_token(150);
            Statement();
            this.jjtree.closeNodeScope((Node) bSHLabeledStatement, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHLabeledStatement);
                }
                bSHLabeledStatement.label = tokenJj_consume_token.image;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHLabeledStatement);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    th = th4;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHLabeledStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHLabeledStatement);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x001b, FALL_THROUGH, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0011, B:5:0x0016, B:12:0x0028, B:16:0x0042, B:18:0x004b, B:31:0x0067, B:32:0x006a, B:33:0x006d, B:34:0x0070, B:35:0x0080, B:36:0x0081, B:38:0x0088, B:37:0x0085, B:13:0x002d, B:14:0x003d, B:15:0x003e), top: B:76:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:39:0x008d, B:41:0x0095, B:45:0x009e, B:46:0x00a0), top: B:72:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:39:0x008d, B:41:0x0095, B:45:0x009e, B:46:0x00a0), top: B:72:0x008d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void LambdaExpression() throws Throwable {
        boolean z9;
        Token tokenJj_consume_token;
        BSHLambdaExpression bSHLambdaExpression = new BSHLambdaExpression(22);
        this.jjtree.openNodeScope(bSHLambdaExpression);
        jjtreeOpenNodeScope(bSHLambdaExpression);
        boolean z10 = false;
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f == 73) {
                tokenJj_consume_token = jj_consume_token(73);
            } else {
                if (iJj_ntk_f != 76) {
                    this.jj_la1[69] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                FormalParameters();
                tokenJj_consume_token = null;
            }
            jj_consume_token(144);
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 41 && iJj_ntk_f2 != 42 && iJj_ntk_f2 != 48) {
                if (iJj_ntk_f2 != 49) {
                    if (iJj_ntk_f2 != 90 && iJj_ntk_f2 != 91) {
                        switch (iJj_ntk_f2) {
                            case 12:
                            case 15:
                            case 18:
                            case 23:
                            case 27:
                            case 30:
                            case 37:
                            case 39:
                            case 56:
                            case 58:
                            case ParserConstants.WHEN /* 60 */:
                            case ParserConstants.INTEGER_LITERAL /* 62 */:
                            case 67:
                            case ParserConstants.LPAREN /* 76 */:
                            case 80:
                                break;
                            case ParserConstants.LBRACE /* 78 */:
                                break;
                            default:
                                switch (iJj_ntk_f2) {
                                    default:
                                        switch (iJj_ntk_f2) {
                                            case 102:
                                            case 103:
                                            case 104:
                                            case 105:
                                                break;
                                            default:
                                                this.jj_la1[70] = this.jj_gen;
                                                jj_consume_token(-1);
                                                throw new ParseException();
                                        }
                                        this.jjtree.closeNodeScope((Node) bSHLambdaExpression, true);
                                        if (this.jjtree.nodeCreated()) {
                                        }
                                        bSHLambdaExpression.singleParamName = tokenJj_consume_token != null ? tokenJj_consume_token.image : null;
                                        return;
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                        break;
                                }
                                break;
                        }
                    }
                    Expression();
                    this.jjtree.closeNodeScope((Node) bSHLambdaExpression, true);
                    if (this.jjtree.nodeCreated()) {
                    }
                    bSHLambdaExpression.singleParamName = tokenJj_consume_token != null ? tokenJj_consume_token.image : null;
                    return;
                }
                Block();
                this.jjtree.closeNodeScope((Node) bSHLambdaExpression, true);
                if (this.jjtree.nodeCreated()) {
                }
                bSHLambdaExpression.singleParamName = tokenJj_consume_token != null ? tokenJj_consume_token.image : null;
                return;
            }
            Expression();
            this.jjtree.closeNodeScope((Node) bSHLambdaExpression, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHLambdaExpression);
                }
                bSHLambdaExpression.singleParamName = tokenJj_consume_token != null ? tokenJj_consume_token.image : null;
                return;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
            }
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
        }
        JJTParserState jJTParserState = this.jjtree;
        try {
            if (z9) {
                jJTParserState.clearNodeScope(bSHLambdaExpression);
            } else {
                jJTParserState.popNode();
                z10 = z9;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            z9 = th instanceof ParseException;
            if (z9) {
                throw ((ParseException) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw ((Error) th);
            }
            throw ((RuntimeException) th);
        } catch (Throwable th5) {
            z9 = z10;
            th = th5;
            if (z9) {
                this.jjtree.closeNodeScope((Node) bSHLambdaExpression, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHLambdaExpression);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Line() throws Throwable {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f == 0) {
            jj_consume_token(0);
            Interpreter.debug("End of File!");
            return true;
        }
        this.jj_la1[0] = this.jj_gen;
        if (jj_2_1(1)) {
            BlockStatement();
            return false;
        }
        jj_consume_token(-1);
        C0353j.m1303a();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Literal() throws Throwable {
        boolean z9;
        int iJj_ntk_f;
        BSHLiteral bSHLiteral = new BSHLiteral(26);
        this.jjtree.openNodeScope(bSHLiteral);
        jjtreeOpenNodeScope(bSHLiteral);
        boolean z10 = false;
        try {
            iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
            }
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
        }
        if (iJj_ntk_f != 27) {
            if (iJj_ntk_f == 42) {
                NullLiteral();
                this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHLiteral);
                }
                bSHLiteral.value = Primitive.NULL;
                return;
            }
            if (iJj_ntk_f != 56) {
                if (iJj_ntk_f == 58) {
                    VoidLiteral();
                    this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHLiteral);
                    }
                    bSHLiteral.value = Primitive.VOID;
                    return;
                }
                if (iJj_ntk_f == 62) {
                    Token tokenJj_consume_token = jj_consume_token(62);
                    this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHLiteral);
                    }
                    String strReplaceAll = tokenJj_consume_token.image.replaceAll("_", HttpUrl.FRAGMENT_ENCODE_SET);
                    int length = strReplaceAll.length() - 1;
                    char cCharAt = strReplaceAll.charAt(length);
                    try {
                        if (Types.Suffix.isIntegral(Character.valueOf(cCharAt))) {
                            bSHLiteral.value = parseIntegral(strReplaceAll.substring(0, length)).castToType(Types.Suffix.getIntegralType(Character.valueOf(cCharAt)), 0);
                            return;
                        } else {
                            bSHLiteral.value = Primitive.shrinkWrap(parseIntegral(strReplaceAll).getValue());
                            return;
                        }
                    } catch (NumberFormatException e6) {
                        throw createParseException(e6.getMessage(), e6);
                    }
                }
                if (iJj_ntk_f == 67) {
                    Token tokenJj_consume_token2 = jj_consume_token(67);
                    this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHLiteral);
                    }
                    String str = tokenJj_consume_token2.image;
                    int length2 = str.length() - 1;
                    char cCharAt2 = str.charAt(length2);
                    try {
                        if (Types.Suffix.isFloatingPoint(Character.valueOf(cCharAt2))) {
                            bSHLiteral.value = new Primitive(new BigDecimal(str.substring(0, length2))).castToType(Types.Suffix.getFloatingPointType(Character.valueOf(cCharAt2)), 0);
                            return;
                        } else {
                            bSHLiteral.value = Primitive.shrinkWrap(new BigDecimal(str));
                            return;
                        }
                    } catch (NumberFormatException e7) {
                        throw createParseException(e7.getMessage(), e7);
                    }
                }
                switch (iJj_ntk_f) {
                    case 70:
                        Token tokenJj_consume_token3 = jj_consume_token(70);
                        this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHLiteral);
                        }
                        try {
                            String str2 = tokenJj_consume_token3.image;
                            bSHLiteral.charSetup(str2.substring(1, str2.length() - 1));
                            return;
                        } catch (Exception e10) {
                            throw createParseException("Error parsing character: " + tokenJj_consume_token3.image, e10);
                        }
                    case 71:
                        Token tokenJj_consume_token4 = jj_consume_token(71);
                        this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHLiteral);
                        }
                        try {
                            String str3 = tokenJj_consume_token4.image;
                            bSHLiteral.stringSetup(str3.substring(1, str3.length() - 1));
                            return;
                        } catch (Exception e11) {
                            throw createParseException("Error parsing string: " + tokenJj_consume_token4.image, e11);
                        }
                    case 72:
                        Token tokenJj_consume_token5 = jj_consume_token(72);
                        this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHLiteral);
                        }
                        try {
                            String str4 = tokenJj_consume_token5.image;
                            bSHLiteral.value = str4.substring(3, str4.length() - 3);
                            return;
                        } catch (Exception e12) {
                            throw createParseException("Error parsing long string: " + tokenJj_consume_token5.image, e12);
                        }
                    default:
                        this.jj_la1[88] = this.jj_gen;
                        jj_consume_token(-1);
                        throw new ParseException();
                }
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHLiteral);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th5) {
                    th = th5;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHLiteral, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHLiteral);
                        }
                    }
                    throw th;
                }
            }
        }
        boolean zBooleanLiteral = BooleanLiteral();
        this.jjtree.closeNodeScope((Node) bSHLiteral, true);
        if (this.jjtree.nodeCreated()) {
            jjtreeCloseNodeScope(bSHLiteral);
        }
        bSHLiteral.value = zBooleanLiteral ? Primitive.TRUE : Primitive.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void MethodDeclTerminator() throws ParseException {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f == 82) {
            jj_consume_token(82);
            return;
        }
        this.jj_la1[101] = this.jj_gen;
        if (isImplicitMethodTerminator()) {
            return;
        }
        jj_consume_token(-1);
        C0353j.m1303a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void MethodDeclaration() throws Throwable {
        BSHMethodDeclaration bSHMethodDeclaration = new BSHMethodDeclaration(4);
        this.jjtree.openNodeScope(bSHMethodDeclaration);
        jjtreeOpenNodeScope(bSHMethodDeclaration);
        boolean z9 = false;
        try {
            Modifiers Modifiers = Modifiers(2, false);
            if (Modifiers != null) {
                bSHMethodDeclaration.modifiers = Modifiers;
            }
            if (jj_2_3(Integer.MAX_VALUE)) {
                ReturnType();
                ExtensionName();
            } else {
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 12 && iJj_ntk_f != 15 && iJj_ntk_f != 18 && iJj_ntk_f != 23 && iJj_ntk_f != 30 && iJj_ntk_f != 37 && iJj_ntk_f != 39 && iJj_ntk_f != 48 && iJj_ntk_f != 73) {
                    this.jj_la1[14] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                ExtensionName();
            }
            FormalParameters();
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 55) {
                this.jj_la1[15] = this.jj_gen;
            } else {
                jj_consume_token(55);
                bSHMethodDeclaration.numThrows = NameList();
            }
            int iJj_ntk_f3 = this.jj_ntk;
            if (iJj_ntk_f3 == -1) {
                iJj_ntk_f3 = jj_ntk_f();
            }
            if (iJj_ntk_f3 == 49 || iJj_ntk_f3 == 78) {
                Block();
            } else {
                this.jj_la1[16] = this.jj_gen;
                MethodDeclTerminator();
            }
            this.jjtree.closeNodeScope((Node) bSHMethodDeclaration, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHMethodDeclaration);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHMethodDeclaration);
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHMethodDeclaration, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHMethodDeclaration);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void MethodInvocation() throws Throwable {
        boolean z9;
        BSHMethodInvocation bSHMethodInvocation = new BSHMethodInvocation(21);
        this.jjtree.openNodeScope(bSHMethodInvocation);
        jjtreeOpenNodeScope(bSHMethodInvocation);
        try {
            AmbiguousName();
            Arguments();
            this.jjtree.closeNodeScope((Node) bSHMethodInvocation, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHMethodInvocation);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHMethodInvocation);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHMethodInvocation, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHMethodInvocation);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final bsh.Modifiers Modifiers(int r13, boolean r14) {
        /*
            r12 = this;
            r0 = 0
        L1:
            int r1 = r12.jj_ntk
            r2 = -1
            if (r1 != r2) goto La
            int r1 = r12.jj_ntk_f()
        La:
            r3 = 53
            r4 = 52
            r5 = 50
            r6 = 49
            r7 = 59
            r8 = 40
            r9 = 28
            r10 = 21
            r11 = 11
            if (r1 == r11) goto L39
            if (r1 == r10) goto L39
            if (r1 == r9) goto L39
            if (r1 == r8) goto L39
            if (r1 == r7) goto L39
            if (r1 == r6) goto L39
            if (r1 == r5) goto L39
            if (r1 == r4) goto L39
            if (r1 == r3) goto L39
            switch(r1) {
                case 44: goto L39;
                case 45: goto L39;
                case 46: goto L39;
                default: goto L31;
            }
        L31:
            int[] r13 = r12.jj_la1
            r14 = 1
            int r1 = r12.jj_gen
            r13[r14] = r1
            return r0
        L39:
            int r1 = r12.jj_ntk
            if (r1 != r2) goto L41
            int r1 = r12.jj_ntk_f()
        L41:
            if (r1 == r11) goto L97
            if (r1 == r10) goto L93
            if (r1 == r9) goto L8f
            if (r1 == r8) goto L8b
            if (r1 == r7) goto L87
            if (r1 == r6) goto L83
            if (r1 == r5) goto L7f
            if (r1 == r4) goto L7b
            if (r1 == r3) goto L77
            switch(r1) {
                case 44: goto L71;
                case 45: goto L6b;
                case 46: goto L65;
                default: goto L56;
            }
        L56:
            int[] r13 = r12.jj_la1
            r14 = 2
            int r0 = r12.jj_gen
            r13[r14] = r0
            r12.jj_consume_token(r2)
            bsh.C0353j.m1303a()
            r13 = 0
            return r13
        L65:
            r1 = 46
            r12.jj_consume_token(r1)
            goto L9a
        L6b:
            r1 = 45
            r12.jj_consume_token(r1)
            goto L9a
        L71:
            r1 = 44
            r12.jj_consume_token(r1)
            goto L9a
        L77:
            r12.jj_consume_token(r3)
            goto L9a
        L7b:
            r12.jj_consume_token(r4)
            goto L9a
        L7f:
            r12.jj_consume_token(r5)
            goto L9a
        L83:
            r12.jj_consume_token(r6)
            goto L9a
        L87:
            r12.jj_consume_token(r7)
            goto L9a
        L8b:
            r12.jj_consume_token(r8)
            goto L9a
        L8f:
            r12.jj_consume_token(r9)
            goto L9a
        L93:
            r12.jj_consume_token(r10)
            goto L9a
        L97:
            r12.jj_consume_token(r11)
        L9a:
            if (r14 != 0) goto L1
            if (r0 != 0) goto La6
            bsh.Modifiers r0 = new bsh.Modifiers     // Catch: java.lang.IllegalStateException -> La4
            r0.<init>(r13)     // Catch: java.lang.IllegalStateException -> La4
            goto La6
        La4:
            r13 = move-exception
            goto Lb2
        La6:
            r1 = 0
            bsh.Token r1 = r12.getToken(r1)     // Catch: java.lang.IllegalStateException -> La4
            java.lang.String r1 = r1.image     // Catch: java.lang.IllegalStateException -> La4
            r0.addModifier(r1)     // Catch: java.lang.IllegalStateException -> La4
            goto L1
        Lb2:
            java.lang.String r14 = r13.getMessage()
            bsh.ParseException r13 = r12.createParseException(r14, r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Modifiers(int, boolean):bsh.Modifiers");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void MultiCatch() throws Throwable {
        boolean z9;
        boolean zJj_2_40;
        int iJj_ntk_f;
        BSHMultiCatch bSHMultiCatch = new BSHMultiCatch(42);
        this.jjtree.openNodeScope(bSHMultiCatch);
        jjtreeOpenNodeScope(bSHMultiCatch);
        boolean z10 = false;
        try {
            zJj_2_40 = jj_2_40(2);
            iJj_ntk_f = this.jj_ntk;
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        try {
            if (!zJj_2_40) {
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 73) {
                    this.jj_la1[120] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                Token tokenJj_consume_token = jj_consume_token(73);
                this.jjtree.closeNodeScope((Node) bSHMultiCatch, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHMultiCatch);
                }
                bSHMultiCatch.name = tokenJj_consume_token.image;
                return;
            }
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 28) {
                this.jj_la1[118] = this.jj_gen;
            } else {
                jj_consume_token(28);
                bSHMultiCatch.isFinal = true;
            }
            Type();
            while (true) {
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 != 110) {
                    break;
                }
                jj_consume_token(110);
                Type();
            }
            this.jj_la1[119] = this.jj_gen;
            Token tokenJj_consume_token2 = jj_consume_token(73);
            this.jjtree.closeNodeScope((Node) bSHMultiCatch, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHMultiCatch);
            }
            bSHMultiCatch.name = tokenJj_consume_token2.image;
        } catch (Throwable th3) {
            th = th3;
            z9 = false;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHMultiCatch);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    th = th4;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHMultiCatch, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHMultiCatch);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void MultiplicativeExpression() throws Throwable {
        Token tokenJj_consume_token;
        PowerExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 106 && iJj_ntk_f != 107 && iJj_ntk_f != 114 && iJj_ntk_f != 115) {
                this.jj_la1[59] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 106) {
                tokenJj_consume_token = jj_consume_token(106);
            } else if (iJj_ntk_f2 == 107) {
                tokenJj_consume_token = jj_consume_token(107);
            } else if (iJj_ntk_f2 == 114) {
                tokenJj_consume_token = jj_consume_token(114);
            } else {
                if (iJj_ntk_f2 != 115) {
                    this.jj_la1[60] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(115);
            }
            PowerExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int NameList() throws Throwable {
        AmbiguousName();
        int i9 = 1;
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 83) {
                this.jj_la1[34] = this.jj_gen;
                return i9;
            }
            jj_consume_token(83);
            AmbiguousName();
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void NullCoalesceElvisSpaceShipExpression() throws Throwable {
        Token tokenJj_consume_token;
        ConditionalOrExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 145 && iJj_ntk_f != 147 && iJj_ntk_f != 148) {
                this.jj_la1[38] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 145) {
                tokenJj_consume_token = jj_consume_token(145);
            } else if (iJj_ntk_f2 == 147) {
                tokenJj_consume_token = jj_consume_token(147);
            } else {
                if (iJj_ntk_f2 != 148) {
                    this.jj_la1[39] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(148);
            }
            ConditionalOrExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void NullLiteral() throws ParseException {
        jj_consume_token(42);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void PackageDeclaration() throws Throwable {
        boolean z9;
        BSHPackageDeclaration bSHPackageDeclaration = new BSHPackageDeclaration(5);
        this.jjtree.openNodeScope(bSHPackageDeclaration);
        jjtreeOpenNodeScope(bSHPackageDeclaration);
        try {
            jj_consume_token(43);
            AmbiguousName();
            this.jjtree.closeNodeScope((Node) bSHPackageDeclaration, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHPackageDeclaration);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHPackageDeclaration);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHPackageDeclaration, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPackageDeclaration);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void PowerExpression() throws Throwable {
        Token tokenJj_consume_token;
        UnaryExpression();
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 116 && iJj_ntk_f != 117) {
                this.jj_la1[61] = this.jj_gen;
                return;
            }
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 == 116) {
                tokenJj_consume_token = jj_consume_token(116);
            } else {
                if (iJj_ntk_f2 != 117) {
                    this.jj_la1[62] = this.jj_gen;
                    jj_consume_token(-1);
                    C0353j.m1303a();
                    return;
                }
                tokenJj_consume_token = jj_consume_token(117);
            }
            UnaryExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(17);
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            boolean z9 = true;
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z9 = false;
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                bSHBinaryExpression.kind = tokenJj_consume_token.kind;
            } catch (Throwable th2) {
                if (z9) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void PrimaryExpression() throws Throwable {
        boolean z9;
        BSHPrimaryExpression bSHPrimaryExpression = new BSHPrimaryExpression(20);
        this.jjtree.openNodeScope(bSHPrimaryExpression);
        jjtreeOpenNodeScope(bSHPrimaryExpression);
        try {
            PrimaryPrefix();
            while (jj_2_15(1)) {
                PrimarySuffix();
            }
            this.jjtree.closeNodeScope((Node) bSHPrimaryExpression, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHPrimaryExpression);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHPrimaryExpression);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHPrimaryExpression, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimaryExpression);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void PrimaryPrefix() throws Throwable {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 27 && iJj_ntk_f != 56 && iJj_ntk_f != 58) {
            if (iJj_ntk_f == 60) {
                WhenExpression();
                return;
            }
            if (iJj_ntk_f != 62 && iJj_ntk_f != 67) {
                if (iJj_ntk_f == 76) {
                    jj_consume_token(76);
                    Expression();
                    jj_consume_token(77);
                    return;
                }
                if (iJj_ntk_f == 78 || iJj_ntk_f == 80 || iJj_ntk_f == 41) {
                    AllocationExpression();
                    return;
                }
                if (iJj_ntk_f != 42) {
                    switch (iJj_ntk_f) {
                        case 70:
                        case 71:
                        case 72:
                            break;
                        default:
                            this.jj_la1[74] = this.jj_gen;
                            if (jj_2_16(Integer.MAX_VALUE)) {
                                MethodInvocation();
                            } else if (!jj_2_17(Integer.MAX_VALUE)) {
                                int iJj_ntk_f2 = this.jj_ntk;
                                if (iJj_ntk_f2 == -1) {
                                    iJj_ntk_f2 = jj_ntk_f();
                                }
                                if (iJj_ntk_f2 != 73) {
                                    this.jj_la1[75] = this.jj_gen;
                                    jj_consume_token(-1);
                                    C0353j.m1303a();
                                } else {
                                    AmbiguousName();
                                }
                            } else {
                                Type();
                            }
                            break;
                    }
                    return;
                }
            }
        }
        Literal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c1 A[Catch: all -> 0x003d, FALL_THROUGH, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020f A[Catch: all -> 0x003d, FALL_THROUGH, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024c A[Catch: all -> 0x003d, FALL_THROUGH, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0255 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025b A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0287 A[Catch: all -> 0x003d, FALL_THROUGH, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0013, B:5:0x001b, B:15:0x0041, B:17:0x0046, B:20:0x005a, B:22:0x006d, B:24:0x0075, B:26:0x007d, B:28:0x0085, B:30:0x008c, B:33:0x0094, B:37:0x00ae, B:34:0x0099, B:35:0x00a9, B:36:0x00aa, B:43:0x00c7, B:45:0x00cd, B:47:0x00da, B:49:0x00e0, B:51:0x00ea, B:50:0x00e7, B:57:0x0104, B:59:0x010a, B:61:0x0115, B:63:0x011b, B:65:0x0127, B:64:0x0124, B:71:0x013f, B:73:0x0143, B:75:0x0149, B:77:0x0157, B:83:0x0172, B:84:0x017a, B:85:0x017b, B:91:0x0198, B:93:0x019f, B:99:0x01b1, B:100:0x01b4, B:101:0x01b7, B:102:0x01ba, B:104:0x01c6, B:106:0x01ca, B:110:0x01d4, B:160:0x028a, B:111:0x01de, B:113:0x01e2, B:116:0x01ea, B:118:0x01f1, B:123:0x01fd, B:124:0x0200, B:125:0x0203, B:126:0x0206, B:128:0x0212, B:127:0x020f, B:129:0x0218, B:130:0x0226, B:131:0x0227, B:133:0x0230, B:138:0x023c, B:139:0x023f, B:140:0x0242, B:141:0x0245, B:143:0x0251, B:145:0x0255, B:147:0x025b, B:148:0x0262, B:150:0x026b, B:155:0x0277, B:156:0x027a, B:157:0x027d, B:158:0x0280, B:159:0x0287, B:142:0x024c, B:103:0x01c1), top: B:189:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PrimarySuffix() {
        boolean z9;
        int iJj_ntk_f;
        Token tokenJj_consume_token;
        BSHPrimarySuffix bSHPrimarySuffix = new BSHPrimarySuffix(25);
        this.jjtree.openNodeScope(bSHPrimarySuffix);
        jjtreeOpenNodeScope(bSHPrimarySuffix);
        try {
            try {
                if (jj_2_18(2)) {
                    jj_consume_token(84);
                    jj_consume_token(14);
                    this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimarySuffix);
                    }
                    bSHPrimarySuffix.operation = 6;
                    return;
                }
                int iJj_ntk_f2 = this.jj_ntk;
                if (iJj_ntk_f2 == -1) {
                    iJj_ntk_f2 = jj_ntk_f();
                }
                if (iJj_ntk_f2 != 80) {
                    this.jj_la1[86] = this.jj_gen;
                    if (getToken(1).kind == 151 && ((getToken(2).kind == 73 || getToken(2).kind == 41) && getToken(3).kind != 81)) {
                        jj_consume_token(151);
                        int iJj_ntk_f3 = this.jj_ntk;
                        if (iJj_ntk_f3 == -1) {
                            iJj_ntk_f3 = jj_ntk_f();
                        }
                        if (iJj_ntk_f3 == 41) {
                            tokenJj_consume_token = jj_consume_token(41);
                        } else {
                            if (iJj_ntk_f3 != 73) {
                                this.jj_la1[83] = this.jj_gen;
                                jj_consume_token(-1);
                                throw new ParseException();
                            }
                            tokenJj_consume_token = jj_consume_token(73);
                        }
                        this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimarySuffix);
                        }
                        bSHPrimarySuffix.operation = 5;
                        bSHPrimarySuffix.field = tokenJj_consume_token.image;
                        return;
                    }
                    if (jj_2_19(2)) {
                        jj_consume_token(Opcodes.IFEQ);
                        Token tokenJj_consume_token2 = jj_consume_token(73);
                        int iJj_ntk_f4 = this.jj_ntk;
                        if (iJj_ntk_f4 == -1) {
                            iJj_ntk_f4 = jj_ntk_f();
                        }
                        if (iJj_ntk_f4 != 76) {
                            this.jj_la1[84] = this.jj_gen;
                        } else {
                            Arguments();
                        }
                        this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimarySuffix);
                        }
                        bSHPrimarySuffix.operation = 2;
                        bSHPrimarySuffix.field = tokenJj_consume_token2.image;
                        bSHPrimarySuffix.safeNavigate = true;
                        return;
                    }
                    if (jj_2_20(2)) {
                        jj_consume_token(84);
                        Token tokenJj_consume_token3 = jj_consume_token(73);
                        int iJj_ntk_f5 = this.jj_ntk;
                        if (iJj_ntk_f5 == -1) {
                            iJj_ntk_f5 = jj_ntk_f();
                        }
                        if (iJj_ntk_f5 != 76) {
                            this.jj_la1[85] = this.jj_gen;
                        } else {
                            Arguments();
                        }
                        this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimarySuffix);
                        }
                        bSHPrimarySuffix.operation = 2;
                        bSHPrimarySuffix.field = tokenJj_consume_token3.image;
                        return;
                    }
                    int iJj_ntk_f6 = this.jj_ntk;
                    if (iJj_ntk_f6 == -1) {
                        iJj_ntk_f6 = jj_ntk_f();
                    }
                    if (iJj_ntk_f6 == 78) {
                        jj_consume_token(78);
                        Expression();
                        jj_consume_token(79);
                        this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimarySuffix);
                        }
                        bSHPrimarySuffix.operation = 3;
                        return;
                    }
                    this.jj_la1[87] = this.jj_gen;
                    if (!jj_2_21(2)) {
                        jj_consume_token(-1);
                        throw new ParseException();
                    }
                    jj_consume_token(84);
                    AllocationExpression();
                    this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimarySuffix);
                    }
                    bSHPrimarySuffix.operation = 4;
                    return;
                }
                jj_consume_token(80);
                int iJj_ntk_f7 = this.jj_ntk;
                if (iJj_ntk_f7 == -1) {
                    iJj_ntk_f7 = jj_ntk_f();
                }
                if (iJj_ntk_f7 != 41 && iJj_ntk_f7 != 42 && iJj_ntk_f7 != 90 && iJj_ntk_f7 != 91) {
                    switch (iJj_ntk_f7) {
                        default:
                            switch (iJj_ntk_f7) {
                                default:
                                    switch (iJj_ntk_f7) {
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                            break;
                                        default:
                                            this.jj_la1[76] = this.jj_gen;
                                            break;
                                    }
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                    break;
                            }
                        case 12:
                        case 15:
                        case 18:
                        case 23:
                        case 27:
                        case 30:
                        case 37:
                        case 39:
                        case 48:
                        case 56:
                        case 58:
                        case ParserConstants.WHEN /* 60 */:
                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                        case 67:
                        case ParserConstants.LPAREN /* 76 */:
                        case ParserConstants.LBRACE /* 78 */:
                        case 80:
                            break;
                    }
                } else {
                    Expression();
                    bSHPrimarySuffix.hasLeftIndex = true;
                }
                int iJj_ntk_f8 = this.jj_ntk;
                if (iJj_ntk_f8 == -1) {
                    iJj_ntk_f8 = jj_ntk_f();
                }
                if (iJj_ntk_f8 == 150 || iJj_ntk_f8 == 151) {
                    int iJj_ntk_f9 = this.jj_ntk;
                    if (iJj_ntk_f9 == -1) {
                        iJj_ntk_f9 = jj_ntk_f();
                    }
                    if (iJj_ntk_f9 == 150) {
                        jj_consume_token(150);
                        bSHPrimarySuffix.slice = true;
                        int iJj_ntk_f10 = this.jj_ntk;
                        if (iJj_ntk_f10 == -1) {
                            iJj_ntk_f10 = jj_ntk_f();
                        }
                        if (iJj_ntk_f10 == 41 || iJj_ntk_f10 == 42 || iJj_ntk_f10 == 90 || iJj_ntk_f10 == 91) {
                            Expression();
                            bSHPrimarySuffix.hasRightIndex = true;
                            iJj_ntk_f = this.jj_ntk;
                            if (iJj_ntk_f == -1) {
                                iJj_ntk_f = jj_ntk_f();
                            }
                            if (iJj_ntk_f != 150) {
                                jj_consume_token(150);
                                bSHPrimarySuffix.step = true;
                                int iJj_ntk_f11 = this.jj_ntk;
                                if (iJj_ntk_f11 == -1) {
                                    iJj_ntk_f11 = jj_ntk_f();
                                }
                                if (iJj_ntk_f11 != 41 && iJj_ntk_f11 != 42 && iJj_ntk_f11 != 90 && iJj_ntk_f11 != 91) {
                                    switch (iJj_ntk_f11) {
                                        default:
                                            switch (iJj_ntk_f11) {
                                                default:
                                                    switch (iJj_ntk_f11) {
                                                        case 102:
                                                        case 103:
                                                        case 104:
                                                        case 105:
                                                            break;
                                                        default:
                                                            this.jj_la1[79] = this.jj_gen;
                                                            break;
                                                    }
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                    break;
                                            }
                                        case 12:
                                        case 15:
                                        case 18:
                                        case 23:
                                        case 27:
                                        case 30:
                                        case 37:
                                        case 39:
                                        case 48:
                                        case 56:
                                        case 58:
                                        case ParserConstants.WHEN /* 60 */:
                                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                                        case 67:
                                        case ParserConstants.LPAREN /* 76 */:
                                        case ParserConstants.LBRACE /* 78 */:
                                        case 80:
                                            break;
                                    }
                                } else {
                                    Expression();
                                }
                            } else {
                                this.jj_la1[80] = this.jj_gen;
                            }
                        } else {
                            switch (iJj_ntk_f10) {
                                default:
                                    switch (iJj_ntk_f10) {
                                        default:
                                            switch (iJj_ntk_f10) {
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                    break;
                                                default:
                                                    this.jj_la1[78] = this.jj_gen;
                                                    break;
                                            }
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                            break;
                                    }
                                case 12:
                                case 15:
                                case 18:
                                case 23:
                                case 27:
                                case 30:
                                case 37:
                                case 39:
                                case 48:
                                case 56:
                                case 58:
                                case ParserConstants.WHEN /* 60 */:
                                case ParserConstants.INTEGER_LITERAL /* 62 */:
                                case 67:
                                case ParserConstants.LPAREN /* 76 */:
                                case ParserConstants.LBRACE /* 78 */:
                                case 80:
                                    break;
                            }
                            iJj_ntk_f = this.jj_ntk;
                            if (iJj_ntk_f == -1) {
                            }
                            if (iJj_ntk_f != 150) {
                            }
                        }
                    } else {
                        if (iJj_ntk_f9 != 151) {
                            this.jj_la1[81] = this.jj_gen;
                            jj_consume_token(-1);
                            throw new ParseException();
                        }
                        jj_consume_token(151);
                        int iJj_ntk_f12 = this.jj_ntk;
                        if (iJj_ntk_f12 == -1) {
                            iJj_ntk_f12 = jj_ntk_f();
                        }
                        if (iJj_ntk_f12 == 41 || iJj_ntk_f12 == 42 || iJj_ntk_f12 == 90 || iJj_ntk_f12 == 91) {
                            Expression();
                            bSHPrimarySuffix.slice = true;
                            bSHPrimarySuffix.step = true;
                        } else {
                            switch (iJj_ntk_f12) {
                                default:
                                    switch (iJj_ntk_f12) {
                                        default:
                                            switch (iJj_ntk_f12) {
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                    break;
                                                default:
                                                    this.jj_la1[77] = this.jj_gen;
                                                    break;
                                            }
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                            break;
                                    }
                                case 12:
                                case 15:
                                case 18:
                                case 23:
                                case 27:
                                case 30:
                                case 37:
                                case 39:
                                case 48:
                                case 56:
                                case 58:
                                case ParserConstants.WHEN /* 60 */:
                                case ParserConstants.INTEGER_LITERAL /* 62 */:
                                case 67:
                                case ParserConstants.LPAREN /* 76 */:
                                case ParserConstants.LBRACE /* 78 */:
                                case 80:
                                    break;
                            }
                            bSHPrimarySuffix.slice = true;
                            bSHPrimarySuffix.step = true;
                        }
                    }
                } else {
                    this.jj_la1[82] = this.jj_gen;
                }
                jj_consume_token(81);
                this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHPrimarySuffix);
                }
                bSHPrimarySuffix.operation = 1;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHPrimarySuffix);
                    } else {
                        jJTParserState.popNode();
                    }
                    if (th instanceof ParseException) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th3) {
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHPrimarySuffix, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHPrimarySuffix);
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void PrimitiveType() throws Throwable {
        boolean z9;
        BSHPrimitiveType bSHPrimitiveType = new BSHPrimitiveType(13);
        this.jjtree.openNodeScope(bSHPrimitiveType);
        jjtreeOpenNodeScope(bSHPrimitiveType);
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            z9 = false;
            try {
                if (iJj_ntk_f == 12) {
                    jj_consume_token(12);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Boolean.TYPE;
                    return;
                }
                if (iJj_ntk_f == 15) {
                    jj_consume_token(15);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Byte.TYPE;
                    return;
                }
                if (iJj_ntk_f == 18) {
                    jj_consume_token(18);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Character.TYPE;
                    return;
                }
                if (iJj_ntk_f == 23) {
                    jj_consume_token(23);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Double.TYPE;
                    return;
                }
                if (iJj_ntk_f == 30) {
                    jj_consume_token(30);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Float.TYPE;
                    return;
                }
                if (iJj_ntk_f == 37) {
                    jj_consume_token(37);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Integer.TYPE;
                    return;
                }
                if (iJj_ntk_f == 39) {
                    jj_consume_token(39);
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                    bSHPrimitiveType.type = Long.TYPE;
                    return;
                }
                if (iJj_ntk_f != 48) {
                    this.jj_la1[32] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                jj_consume_token(48);
                this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHPrimitiveType);
                }
                bSHPrimitiveType.type = Short.TYPE;
            } catch (Throwable th2) {
                th = th2;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHPrimitiveType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHPrimitiveType);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void ReInit(Reader reader) {
        JavaCharStream javaCharStream = this.jj_input_stream;
        if (javaCharStream == null) {
            this.jj_input_stream = new JavaCharStream(reader, 1, 1);
        } else {
            javaCharStream.reInit(reader, 1, 1);
        }
        if (this.token_source == null) {
            this.token_source = new ParserTokenManager(this.jj_input_stream);
        }
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        int i9 = 0;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void RelationalExpression() throws java.lang.Throwable {
        /*
            r5 = this;
            r5.ShiftExpression()
        L3:
            int r0 = r5.jj_ntk
            r1 = -1
            if (r0 != r1) goto Lc
            int r0 = r5.jj_ntk_f()
        Lc:
            switch(r0) {
                case 86: goto L18;
                case 87: goto L18;
                case 88: goto L18;
                case 89: goto L18;
                case 90: goto Lf;
                case 91: goto Lf;
                case 92: goto Lf;
                case 93: goto L18;
                case 94: goto L18;
                case 95: goto L18;
                case 96: goto L18;
                default: goto Lf;
            }
        Lf:
            int[] r0 = r5.jj_la1
            r1 = 53
            int r2 = r5.jj_gen
            r0[r1] = r2
            return
        L18:
            int r0 = r5.jj_ntk
            if (r0 != r1) goto L20
            int r0 = r5.jj_ntk_f()
        L20:
            switch(r0) {
                case 86: goto L63;
                case 87: goto L5c;
                case 88: goto L55;
                case 89: goto L4e;
                case 90: goto L23;
                case 91: goto L23;
                case 92: goto L23;
                case 93: goto L47;
                case 94: goto L40;
                case 95: goto L39;
                case 96: goto L32;
                default: goto L23;
            }
        L23:
            int[] r0 = r5.jj_la1
            r2 = 54
            int r3 = r5.jj_gen
            r0[r2] = r3
            r5.jj_consume_token(r1)
            bsh.C0353j.m1303a()
            return
        L32:
            r0 = 96
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L39:
            r0 = 95
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L40:
            r0 = 94
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L47:
            r0 = 93
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L4e:
            r0 = 89
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L55:
            r0 = 88
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L5c:
            r0 = 87
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L69
        L63:
            r0 = 86
            bsh.Token r0 = r5.jj_consume_token(r0)
        L69:
            r5.ShiftExpression()
            bsh.BSHBinaryExpression r1 = new bsh.BSHBinaryExpression
            r2 = 17
            r1.<init>(r2)
            bsh.JJTParserState r2 = r5.jjtree
            r2.openNodeScope(r1)
            r5.jjtreeOpenNodeScope(r1)
            r2 = 2
            r3 = 1
            bsh.JJTParserState r4 = r5.jjtree     // Catch: java.lang.Throwable -> L8f
            r4.closeNodeScope(r1, r2)     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            bsh.JJTParserState r4 = r5.jjtree     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r4.nodeCreated()     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L91
            r5.jjtreeCloseNodeScope(r1)     // Catch: java.lang.Throwable -> L8f
            goto L91
        L8f:
            r0 = move-exception
            goto L97
        L91:
            int r0 = r0.kind     // Catch: java.lang.Throwable -> L8f
            r1.kind = r0     // Catch: java.lang.Throwable -> L8f
            goto L3
        L97:
            if (r3 == 0) goto La9
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r1, r2)
            bsh.JJTParserState r2 = r5.jjtree
            boolean r2 = r2.nodeCreated()
            if (r2 == 0) goto La9
            r5.jjtreeCloseNodeScope(r1)
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.RelationalExpression():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ReturnStatement() throws Throwable {
        boolean z9;
        BSHReturnStatement bSHReturnStatement = new BSHReturnStatement(39);
        this.jjtree.openNodeScope(bSHReturnStatement);
        jjtreeOpenNodeScope(bSHReturnStatement);
        boolean z10 = false;
        try {
            jj_consume_token(47);
            if (isSameLineReturnExpression()) {
                Expression();
            }
            StatementTerminator();
            this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHReturnStatement);
            }
            bSHReturnStatement.kind = 47;
        } catch (Throwable th3) {
            th = th3;
            z9 = false;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHReturnStatement);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                z9 = th instanceof ParseException;
                if (z9) {
                    throw ((ParseException) th);
                }
                if (!(th instanceof RuntimeException)) {
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            } catch (Throwable th5) {
                z9 = z10;
                th = th5;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHReturnStatement, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHReturnStatement);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void ReturnType() throws Throwable {
        boolean z9;
        BSHReturnType bSHReturnType = new BSHReturnType(12);
        this.jjtree.openNodeScope(bSHReturnType);
        jjtreeOpenNodeScope(bSHReturnType);
        boolean z10 = false;
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 12 && iJj_ntk_f != 15 && iJj_ntk_f != 18 && iJj_ntk_f != 23 && iJj_ntk_f != 30 && iJj_ntk_f != 37 && iJj_ntk_f != 39 && iJj_ntk_f != 48) {
                if (iJj_ntk_f == 58) {
                    jj_consume_token(58);
                    this.jjtree.closeNodeScope((Node) bSHReturnType, true);
                    try {
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHReturnType);
                        }
                        bSHReturnType.isVoid = true;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = false;
                        JJTParserState jJTParserState = this.jjtree;
                        try {
                            if (z9) {
                                jJTParserState.clearNodeScope(bSHReturnType);
                            } else {
                                jJTParserState.popNode();
                                z10 = z9;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            z9 = th instanceof ParseException;
                            if (z9) {
                                throw ((ParseException) th);
                            }
                            if (!(th instanceof RuntimeException)) {
                                throw ((Error) th);
                            }
                            throw ((RuntimeException) th);
                        } catch (Throwable th4) {
                            th = th4;
                            z9 = z10;
                            if (z9) {
                                this.jjtree.closeNodeScope((Node) bSHReturnType, true);
                                if (this.jjtree.nodeCreated()) {
                                    jjtreeCloseNodeScope(bSHReturnType);
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (iJj_ntk_f != 73) {
                    this.jj_la1[31] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
            }
            Type();
            this.jjtree.closeNodeScope((Node) bSHReturnType, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHReturnType);
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void ShiftExpression() throws java.lang.Throwable {
        /*
            r5 = this;
            r5.AdditiveExpression()
        L3:
            int r0 = r5.jj_ntk
            r1 = -1
            if (r0 != r1) goto Lc
            int r0 = r5.jj_ntk_f()
        Lc:
            switch(r0) {
                case 118: goto L18;
                case 119: goto L18;
                case 120: goto L18;
                case 121: goto L18;
                case 122: goto L18;
                case 123: goto L18;
                default: goto Lf;
            }
        Lf:
            int[] r0 = r5.jj_la1
            r1 = 55
            int r2 = r5.jj_gen
            r0[r1] = r2
            return
        L18:
            int r0 = r5.jj_ntk
            if (r0 != r1) goto L20
            int r0 = r5.jj_ntk_f()
        L20:
            switch(r0) {
                case 118: goto L55;
                case 119: goto L4e;
                case 120: goto L47;
                case 121: goto L40;
                case 122: goto L39;
                case 123: goto L32;
                default: goto L23;
            }
        L23:
            int[] r0 = r5.jj_la1
            r2 = 56
            int r3 = r5.jj_gen
            r0[r2] = r3
            r5.jj_consume_token(r1)
            bsh.C0353j.m1303a()
            return
        L32:
            r0 = 123(0x7b, float:1.72E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L5b
        L39:
            r0 = 122(0x7a, float:1.71E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L5b
        L40:
            r0 = 121(0x79, float:1.7E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L5b
        L47:
            r0 = 120(0x78, float:1.68E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L5b
        L4e:
            r0 = 119(0x77, float:1.67E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
            goto L5b
        L55:
            r0 = 118(0x76, float:1.65E-43)
            bsh.Token r0 = r5.jj_consume_token(r0)
        L5b:
            r5.AdditiveExpression()
            bsh.BSHBinaryExpression r1 = new bsh.BSHBinaryExpression
            r2 = 17
            r1.<init>(r2)
            bsh.JJTParserState r2 = r5.jjtree
            r2.openNodeScope(r1)
            r5.jjtreeOpenNodeScope(r1)
            r2 = 2
            r3 = 1
            bsh.JJTParserState r4 = r5.jjtree     // Catch: java.lang.Throwable -> L81
            r4.closeNodeScope(r1, r2)     // Catch: java.lang.Throwable -> L81
            r3 = 0
            bsh.JJTParserState r4 = r5.jjtree     // Catch: java.lang.Throwable -> L81
            boolean r4 = r4.nodeCreated()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L83
            r5.jjtreeCloseNodeScope(r1)     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r0 = move-exception
            goto L89
        L83:
            int r0 = r0.kind     // Catch: java.lang.Throwable -> L81
            r1.kind = r0     // Catch: java.lang.Throwable -> L81
            goto L3
        L89:
            if (r3 == 0) goto L9b
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r1, r2)
            bsh.JJTParserState r2 = r5.jjtree
            boolean r2 = r2.nodeCreated()
            if (r2 == 0) goto L9b
            r5.jjtreeCloseNodeScope(r1)
        L9b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ShiftExpression():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Statement() throws Throwable {
        if (jj_2_26(2)) {
            LabeledStatement();
        }
        if (jj_2_27(3)) {
            Block();
            return;
        }
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        switch (iJj_ntk_f) {
            case 12:
            case 15:
            case 18:
            case 23:
            case 27:
            case 30:
            case 37:
            case 39:
            case 41:
            case 42:
            case 48:
            case 56:
            case 58:
            case ParserConstants.WHEN /* 60 */:
            case ParserConstants.INTEGER_LITERAL /* 62 */:
            case 67:
            case 70:
            case 71:
            case 72:
            case 73:
            case ParserConstants.LPAREN /* 76 */:
            case ParserConstants.LBRACE /* 78 */:
            case 80:
            case 90:
            case 91:
            case 102:
            case 103:
            case 104:
            case 105:
                StatementExpression();
                StatementTerminator();
                break;
            case 22:
                DoStatement();
                break;
            case 33:
                IfStatement();
                break;
            case 51:
                SwitchStatement();
                break;
            case ParserConstants.WHILE /* 61 */:
                WhileStatement();
                break;
            case 82:
                EmptyStatement();
                break;
            default:
                this.jj_la1[97] = this.jj_gen;
                if (!isRegularForStatement()) {
                    int iJj_ntk_f2 = this.jj_ntk;
                    if (iJj_ntk_f2 == -1) {
                        iJj_ntk_f2 = jj_ntk_f();
                    }
                    if (iJj_ntk_f2 == 13) {
                        BreakStatement();
                    } else if (iJj_ntk_f2 == 20) {
                        ContinueStatement();
                    } else if (iJj_ntk_f2 == 31) {
                        EnhancedForStatement();
                    } else if (iJj_ntk_f2 == 47) {
                        ReturnStatement();
                    } else if (iJj_ntk_f2 == 52) {
                        SynchronizedStatement();
                    } else if (iJj_ntk_f2 == 54) {
                        ThrowStatement();
                    } else if (iJj_ntk_f2 != 57) {
                        this.jj_la1[98] = this.jj_gen;
                        jj_consume_token(-1);
                        C0353j.m1303a();
                    } else {
                        TryStatement();
                    }
                } else {
                    ForStatement();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void StatementExpression() throws Throwable {
        Expression();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void StatementExpressionList() throws Throwable {
        boolean z9;
        BSHStatementExpressionList bSHStatementExpressionList = new BSHStatementExpressionList(38);
        this.jjtree.openNodeScope(bSHStatementExpressionList);
        jjtreeOpenNodeScope(bSHStatementExpressionList);
        try {
            StatementExpression();
            while (true) {
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 83) {
                    break;
                }
                jj_consume_token(83);
                StatementExpression();
            }
            this.jj_la1[114] = this.jj_gen;
            this.jjtree.closeNodeScope((Node) bSHStatementExpressionList, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHStatementExpressionList);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHStatementExpressionList);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHStatementExpressionList, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHStatementExpressionList);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void StatementTerminator() throws ParseException {
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 82) {
            this.jj_la1[102] = this.jj_gen;
        } else {
            jj_consume_token(82);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void SwitchLabel() throws Throwable {
        boolean z9;
        BSHSwitchLabel bSHSwitchLabel = new BSHSwitchLabel(32);
        this.jjtree.openNodeScope(bSHSwitchLabel);
        jjtreeOpenNodeScope(bSHSwitchLabel);
        boolean z10 = false;
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f == 16) {
                jj_consume_token(16);
                Expression();
                jj_consume_token(150);
                this.jjtree.closeNodeScope((Node) bSHSwitchLabel, true);
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHSwitchLabel);
                    return;
                }
                return;
            }
            if (iJj_ntk_f != 154) {
                this.jj_la1[104] = this.jj_gen;
                jj_consume_token(-1);
                throw new ParseException();
            }
            jj_consume_token(Opcodes.IFNE);
            this.jjtree.closeNodeScope((Node) bSHSwitchLabel, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHSwitchLabel);
                }
                bSHSwitchLabel.isDefault = true;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHSwitchLabel);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    z9 = z10;
                    th = th4;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHSwitchLabel, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHSwitchLabel);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void SwitchStatement() throws Throwable {
        boolean z9;
        BSHSwitchStatement bSHSwitchStatement = new BSHSwitchStatement(31);
        this.jjtree.openNodeScope(bSHSwitchStatement);
        jjtreeOpenNodeScope(bSHSwitchStatement);
        try {
            jj_consume_token(51);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            jj_consume_token(78);
            while (true) {
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 16 && iJj_ntk_f != 154) {
                    break;
                }
                SwitchLabel();
                while (jj_2_34(1)) {
                    BlockStatement();
                }
            }
            this.jj_la1[103] = this.jj_gen;
            jj_consume_token(79);
            this.jjtree.closeNodeScope((Node) bSHSwitchStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHSwitchStatement);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHSwitchStatement);
                z9 = false;
                try {
                    if (th2 instanceof ParseException) {
                        throw ((ParseException) th2);
                    }
                    if (!(th2 instanceof RuntimeException)) {
                        throw ((Error) th2);
                    }
                    throw ((RuntimeException) th2);
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHSwitchStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHSwitchStatement);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void SynchronizedStatement() throws Throwable {
        boolean z9;
        BSHBlock bSHBlock = new BSHBlock(3);
        this.jjtree.openNodeScope(bSHBlock);
        jjtreeOpenNodeScope(bSHBlock);
        boolean z10 = false;
        try {
            jj_consume_token(52);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            Block();
            this.jjtree.closeNodeScope((Node) bSHBlock, true);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHBlock);
                }
                bSHBlock.isSynchronized = true;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
                JJTParserState jJTParserState = this.jjtree;
                try {
                    if (z9) {
                        jJTParserState.clearNodeScope(bSHBlock);
                    } else {
                        jJTParserState.popNode();
                        z10 = z9;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th4) {
                    th = th4;
                    z9 = z10;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHBlock, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHBlock);
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void ThrowStatement() throws Throwable {
        boolean z9;
        BSHThrowStatement bSHThrowStatement = new BSHThrowStatement(40);
        this.jjtree.openNodeScope(bSHThrowStatement);
        jjtreeOpenNodeScope(bSHThrowStatement);
        try {
            jj_consume_token(54);
            Expression();
            StatementTerminator();
            this.jjtree.closeNodeScope((Node) bSHThrowStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHThrowStatement);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHThrowStatement);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHThrowStatement, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHThrowStatement);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void TryStatement() throws Throwable {
        boolean z9;
        boolean z10;
        BSHTryStatement bSHTryStatement = new BSHTryStatement(41);
        this.jjtree.openNodeScope(bSHTryStatement);
        jjtreeOpenNodeScope(bSHTryStatement);
        boolean z11 = false;
        try {
            jj_consume_token(57);
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 76) {
                this.jj_la1[115] = this.jj_gen;
            } else {
                TryWithResources();
            }
            Block();
            z10 = false;
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        while (true) {
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 17) {
                break;
            }
            jj_consume_token(17);
            jj_consume_token(76);
            MultiCatch();
            jj_consume_token(77);
            Block();
            z10 = true;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHTryStatement);
                } else {
                    jJTParserState.popNode();
                    z11 = z9;
                }
                try {
                    z9 = th instanceof ParseException;
                    if (z9) {
                        throw ((ParseException) th);
                    }
                    if (!(th instanceof RuntimeException)) {
                        throw ((Error) th);
                    }
                    throw ((RuntimeException) th);
                } catch (Throwable th3) {
                    th = th3;
                    z9 = z11;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHTryStatement, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHTryStatement);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.jj_la1[116] = this.jj_gen;
        int iJj_ntk_f3 = this.jj_ntk;
        if (iJj_ntk_f3 == -1) {
            iJj_ntk_f3 = jj_ntk_f();
        }
        if (iJj_ntk_f3 != 29) {
            this.jj_la1[117] = this.jj_gen;
        } else {
            jj_consume_token(29);
            Block();
            z10 = true;
        }
        this.jjtree.closeNodeScope((Node) bSHTryStatement, true);
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHTryStatement);
            }
            if (z10) {
            } else {
                throw generateParseException();
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void TryWithResources() throws Throwable {
        boolean z9;
        BSHTryWithResources bSHTryWithResources = new BSHTryWithResources(43);
        this.jjtree.openNodeScope(bSHTryWithResources);
        jjtreeOpenNodeScope(bSHTryWithResources);
        try {
            jj_consume_token(76);
            AutoCloseable();
            while (true) {
                int iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                    iJj_ntk_f = jj_ntk_f();
                }
                if (iJj_ntk_f != 82) {
                    break;
                }
                jj_consume_token(82);
                AutoCloseable();
            }
            this.jj_la1[121] = this.jj_gen;
            jj_consume_token(77);
            this.jjtree.closeNodeScope((Node) bSHTryWithResources, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHTryWithResources);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHTryWithResources);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHTryWithResources, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHTryWithResources);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void Type() throws Throwable {
        boolean z9;
        BSHType bSHType = new BSHType(11);
        this.jjtree.openNodeScope(bSHType);
        jjtreeOpenNodeScope(bSHType);
        try {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f == 12 || iJj_ntk_f == 15 || iJj_ntk_f == 18 || iJj_ntk_f == 23 || iJj_ntk_f == 30 || iJj_ntk_f == 37 || iJj_ntk_f == 39 || iJj_ntk_f == 48) {
                PrimitiveType();
            } else {
                if (iJj_ntk_f != 73) {
                    this.jj_la1[30] = this.jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                AmbiguousName();
            }
            while (jj_2_8(2)) {
                jj_consume_token(80);
                jj_consume_token(81);
                bSHType.addArrayDimension();
            }
            this.jjtree.closeNodeScope((Node) bSHType, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHType);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHType);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHType, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHType);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void TypedVariableDeclaration() throws Throwable {
        boolean z9;
        Modifiers Modifiers;
        BSHTypedVariableDeclaration bSHTypedVariableDeclaration = new BSHTypedVariableDeclaration(37);
        this.jjtree.openNodeScope(bSHTypedVariableDeclaration);
        jjtreeOpenNodeScope(bSHTypedVariableDeclaration);
        boolean z10 = false;
        try {
            Modifiers = Modifiers(3, false);
            Type();
            VariableDeclarator();
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 83) {
                break;
            }
            jj_consume_token(83);
            VariableDeclarator();
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHTypedVariableDeclaration);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                z9 = th instanceof ParseException;
                if (z9) {
                    throw ((ParseException) th);
                }
                if (!(th instanceof RuntimeException)) {
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            } catch (Throwable th4) {
                th = th4;
                z9 = z10;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHTypedVariableDeclaration, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHTypedVariableDeclaration);
                    }
                }
                throw th;
            }
        }
        this.jj_la1[113] = this.jj_gen;
        this.jjtree.closeNodeScope((Node) bSHTypedVariableDeclaration, true);
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHTypedVariableDeclaration);
            }
            if (Modifiers != null) {
                bSHTypedVariableDeclaration.modifiers = Modifiers;
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void UnaryExpression() throws Throwable {
        Token tokenJj_consume_token;
        Token tokenJj_consume_token2;
        Token tokenJj_consume_token3;
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        boolean z9 = false;
        if (iJj_ntk_f != 90 && iJj_ntk_f != 91) {
            switch (iJj_ntk_f) {
                case 102:
                case 103:
                    int iJj_ntk_f2 = this.jj_ntk;
                    if (iJj_ntk_f2 == -1) {
                        iJj_ntk_f2 = jj_ntk_f();
                    }
                    if (iJj_ntk_f2 == 102) {
                        tokenJj_consume_token2 = jj_consume_token(102);
                    } else {
                        if (iJj_ntk_f2 != 103) {
                            this.jj_la1[64] = this.jj_gen;
                            jj_consume_token(-1);
                            C0353j.m1303a();
                            return;
                        }
                        tokenJj_consume_token2 = jj_consume_token(103);
                    }
                    PrimaryExpression();
                    BSHUnaryExpression bSHUnaryExpression = new BSHUnaryExpression(18);
                    this.jjtree.openNodeScope(bSHUnaryExpression);
                    jjtreeOpenNodeScope(bSHUnaryExpression);
                    try {
                        this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                        try {
                            if (this.jjtree.nodeCreated()) {
                                jjtreeCloseNodeScope(bSHUnaryExpression);
                            }
                            bSHUnaryExpression.kind = tokenJj_consume_token2.kind;
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            if (z9) {
                                this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                                if (this.jjtree.nodeCreated()) {
                                    jjtreeCloseNodeScope(bSHUnaryExpression);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z9 = true;
                    }
                    break;
                case 104:
                case 105:
                    break;
                default:
                    this.jj_la1[67] = this.jj_gen;
                    if (jj_2_13(Integer.MAX_VALUE)) {
                        LambdaExpression();
                        return;
                    }
                    if (jj_2_14(Integer.MAX_VALUE)) {
                        CastExpression();
                        return;
                    }
                    int iJj_ntk_f3 = this.jj_ntk;
                    if (iJj_ntk_f3 == -1) {
                        iJj_ntk_f3 = jj_ntk_f();
                    }
                    switch (iJj_ntk_f3) {
                        case 12:
                        case 15:
                        case 18:
                        case 23:
                        case 27:
                        case 30:
                        case 37:
                        case 39:
                        case 41:
                        case 42:
                        case 48:
                        case 56:
                        case 58:
                        case ParserConstants.WHEN /* 60 */:
                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                        case 67:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case ParserConstants.LPAREN /* 76 */:
                        case ParserConstants.LBRACE /* 78 */:
                        case 80:
                            PrimaryExpression();
                            int iJj_ntk_f4 = this.jj_ntk;
                            if (iJj_ntk_f4 == -1) {
                                iJj_ntk_f4 = jj_ntk_f();
                            }
                            if (iJj_ntk_f4 != 102 && iJj_ntk_f4 != 103) {
                                this.jj_la1[66] = this.jj_gen;
                                return;
                            }
                            int iJj_ntk_f5 = this.jj_ntk;
                            if (iJj_ntk_f5 == -1) {
                                iJj_ntk_f5 = jj_ntk_f();
                            }
                            if (iJj_ntk_f5 == 102) {
                                tokenJj_consume_token3 = jj_consume_token(102);
                            } else {
                                if (iJj_ntk_f5 != 103) {
                                    this.jj_la1[65] = this.jj_gen;
                                    jj_consume_token(-1);
                                    C0353j.m1303a();
                                    return;
                                }
                                tokenJj_consume_token3 = jj_consume_token(103);
                            }
                            BSHUnaryExpression bSHUnaryExpression2 = new BSHUnaryExpression(18);
                            this.jjtree.openNodeScope(bSHUnaryExpression2);
                            jjtreeOpenNodeScope(bSHUnaryExpression2);
                            try {
                                this.jjtree.closeNodeScope(bSHUnaryExpression2, 1);
                            } catch (Throwable th4) {
                                th = th4;
                                z9 = true;
                            }
                            try {
                                if (this.jjtree.nodeCreated()) {
                                    jjtreeCloseNodeScope(bSHUnaryExpression2);
                                }
                                bSHUnaryExpression2.kind = tokenJj_consume_token3.kind;
                                bSHUnaryExpression2.postfix = true;
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                if (z9) {
                                    this.jjtree.closeNodeScope(bSHUnaryExpression2, 1);
                                    if (this.jjtree.nodeCreated()) {
                                        jjtreeCloseNodeScope(bSHUnaryExpression2);
                                    }
                                }
                                throw th;
                            }
                        default:
                            this.jj_la1[68] = this.jj_gen;
                            jj_consume_token(-1);
                            C0353j.m1303a();
                            return;
                    }
            }
        }
        int iJj_ntk_f6 = this.jj_ntk;
        if (iJj_ntk_f6 == -1) {
            iJj_ntk_f6 = jj_ntk_f();
        }
        if (iJj_ntk_f6 == 90) {
            tokenJj_consume_token = jj_consume_token(90);
        } else if (iJj_ntk_f6 == 91) {
            tokenJj_consume_token = jj_consume_token(91);
        } else if (iJj_ntk_f6 == 104) {
            tokenJj_consume_token = jj_consume_token(104);
        } else {
            if (iJj_ntk_f6 != 105) {
                this.jj_la1[63] = this.jj_gen;
                jj_consume_token(-1);
                C0353j.m1303a();
                return;
            }
            tokenJj_consume_token = jj_consume_token(105);
        }
        UnaryExpression();
        BSHUnaryExpression bSHUnaryExpression3 = new BSHUnaryExpression(18);
        this.jjtree.openNodeScope(bSHUnaryExpression3);
        jjtreeOpenNodeScope(bSHUnaryExpression3);
        try {
            this.jjtree.closeNodeScope(bSHUnaryExpression3, 1);
            try {
                if (this.jjtree.nodeCreated()) {
                    jjtreeCloseNodeScope(bSHUnaryExpression3);
                }
                bSHUnaryExpression3.kind = tokenJj_consume_token.kind;
            } catch (Throwable th6) {
                th = th6;
                if (z9) {
                    this.jjtree.closeNodeScope(bSHUnaryExpression3, 1);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHUnaryExpression3);
                    }
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void VariableDeclarator() throws Throwable {
        boolean z9;
        Token tokenJj_consume_token;
        BSHVariableDeclarator bSHVariableDeclarator = new BSHVariableDeclarator(7);
        this.jjtree.openNodeScope(bSHVariableDeclarator);
        jjtreeOpenNodeScope(bSHVariableDeclarator);
        boolean z10 = false;
        try {
            tokenJj_consume_token = jj_consume_token(73);
        } catch (Throwable th2) {
            th = th2;
            z9 = true;
        }
        while (true) {
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 80) {
                break;
            }
            jj_consume_token(80);
            jj_consume_token(81);
            bSHVariableDeclarator.dimensions++;
            JJTParserState jJTParserState = this.jjtree;
            try {
                if (z9) {
                    jJTParserState.clearNodeScope(bSHVariableDeclarator);
                } else {
                    jJTParserState.popNode();
                    z10 = z9;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                z9 = th instanceof ParseException;
                if (z9) {
                    throw ((ParseException) th);
                }
                if (!(th instanceof RuntimeException)) {
                    throw ((Error) th);
                }
                throw ((RuntimeException) th);
            } catch (Throwable th4) {
                th = th4;
                z9 = z10;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHVariableDeclarator, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHVariableDeclarator);
                    }
                }
                throw th;
            }
        }
        this.jj_la1[20] = this.jj_gen;
        int iJj_ntk_f2 = this.jj_ntk;
        if (iJj_ntk_f2 == -1) {
            iJj_ntk_f2 = jj_ntk_f();
        }
        if (iJj_ntk_f2 != 85) {
            this.jj_la1[21] = this.jj_gen;
        } else {
            jj_consume_token(85);
            VariableInitializer();
        }
        this.jjtree.closeNodeScope((Node) bSHVariableDeclarator, true);
        try {
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHVariableDeclarator);
            }
            bSHVariableDeclarator.name = tokenJj_consume_token.image;
        } catch (Throwable th5) {
            th = th5;
            z9 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void VariableInitializer() throws Throwable {
        if (jj_2_5(3)) {
            ArrayInitializer();
            return;
        }
        int iJj_ntk_f = this.jj_ntk;
        if (iJj_ntk_f == -1) {
            iJj_ntk_f = jj_ntk_f();
        }
        if (iJj_ntk_f != 41 && iJj_ntk_f != 42 && iJj_ntk_f != 90 && iJj_ntk_f != 91) {
            switch (iJj_ntk_f) {
                case 12:
                case 15:
                case 18:
                case 23:
                case 27:
                case 30:
                case 37:
                case 39:
                case 48:
                case 56:
                case 58:
                case ParserConstants.WHEN /* 60 */:
                case ParserConstants.INTEGER_LITERAL /* 62 */:
                case 67:
                case ParserConstants.LPAREN /* 76 */:
                case ParserConstants.LBRACE /* 78 */:
                case 80:
                    break;
                default:
                    switch (iJj_ntk_f) {
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                            break;
                        default:
                            switch (iJj_ntk_f) {
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                    break;
                                default:
                                    this.jj_la1[22] = this.jj_gen;
                                    jj_consume_token(-1);
                                    C0353j.m1303a();
                                    break;
                            }
                            return;
                    }
                    break;
            }
        }
        Expression();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void VoidLiteral() throws ParseException {
        jj_consume_token(58);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x001b, FALL_THROUGH, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0011, B:5:0x0016, B:19:0x0037, B:20:0x003a, B:21:0x003d, B:22:0x0040, B:23:0x0050, B:24:0x0051, B:25:0x005e, B:26:0x0062, B:28:0x0066, B:31:0x006e, B:43:0x00a5), top: B:72:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0011, B:5:0x0016, B:19:0x0037, B:20:0x003a, B:21:0x003d, B:22:0x0040, B:23:0x0050, B:24:0x0051, B:25:0x005e, B:26:0x0062, B:28:0x0066, B:31:0x006e, B:43:0x00a5), top: B:72:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5 A[Catch: all -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:3:0x0011, B:5:0x0016, B:19:0x0037, B:20:0x003a, B:21:0x003d, B:22:0x0040, B:23:0x0050, B:24:0x0051, B:25:0x005e, B:26:0x0062, B:28:0x0066, B:31:0x006e, B:43:0x00a5), top: B:72:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WhenEntry() throws Throwable {
        boolean z9;
        int i9;
        int iJj_ntk_f;
        BSHWhenEntry bSHWhenEntry = new BSHWhenEntry(24);
        this.jjtree.openNodeScope(bSHWhenEntry);
        jjtreeOpenNodeScope(bSHWhenEntry);
        boolean z10 = false;
        try {
            int iJj_ntk_f2 = this.jj_ntk;
            if (iJj_ntk_f2 == -1) {
                iJj_ntk_f2 = jj_ntk_f();
            }
            if (iJj_ntk_f2 != 23) {
                if (iJj_ntk_f2 == 24) {
                    jj_consume_token(24);
                    bSHWhenEntry.isElse = true;
                    jj_consume_token(144);
                    Expression();
                    z10 = true;
                    if (z10) {
                    }
                } else if (iJj_ntk_f2 != 41 && iJj_ntk_f2 != 42 && iJj_ntk_f2 != 90 && iJj_ntk_f2 != 91) {
                    switch (iJj_ntk_f2) {
                        default:
                            switch (iJj_ntk_f2) {
                                default:
                                    switch (iJj_ntk_f2) {
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                            break;
                                        default:
                                            this.jj_la1[73] = this.jj_gen;
                                            jj_consume_token(-1);
                                            throw new ParseException();
                                    }
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                    Expression();
                                    i9 = 1;
                                    while (true) {
                                        iJj_ntk_f = this.jj_ntk;
                                        if (iJj_ntk_f == -1) {
                                            iJj_ntk_f = jj_ntk_f();
                                        }
                                        if (iJj_ntk_f == 83) {
                                            this.jj_la1[72] = this.jj_gen;
                                            jj_consume_token(144);
                                            Expression();
                                            this.jjtree.closeNodeScope((Node) bSHWhenEntry, true);
                                            try {
                                                if (this.jjtree.nodeCreated()) {
                                                    jjtreeCloseNodeScope(bSHWhenEntry);
                                                }
                                                bSHWhenEntry.numConditions = i9;
                                                if (z10) {
                                                    return;
                                                }
                                                this.jjtree.closeNodeScope((Node) bSHWhenEntry, true);
                                                if (this.jjtree.nodeCreated()) {
                                                    jjtreeCloseNodeScope(bSHWhenEntry);
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z9 = false;
                                                JJTParserState jJTParserState = this.jjtree;
                                                try {
                                                    if (z9) {
                                                        jJTParserState.clearNodeScope(bSHWhenEntry);
                                                    } else {
                                                        jJTParserState.popNode();
                                                        z10 = z9;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                                try {
                                                    z9 = th instanceof ParseException;
                                                    if (z9) {
                                                        throw ((ParseException) th);
                                                    }
                                                    if (!(th instanceof RuntimeException)) {
                                                        throw ((Error) th);
                                                    }
                                                    throw ((RuntimeException) th);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z9 = z10;
                                                    if (z9) {
                                                        this.jjtree.closeNodeScope((Node) bSHWhenEntry, true);
                                                        if (this.jjtree.nodeCreated()) {
                                                            jjtreeCloseNodeScope(bSHWhenEntry);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        jj_consume_token(83);
                                        Expression();
                                        i9++;
                                    }
                                    break;
                            }
                        case 12:
                        case 15:
                        case 18:
                        case 27:
                        case 30:
                        case 37:
                        case 39:
                        case 48:
                        case 56:
                        case 58:
                        case ParserConstants.WHEN /* 60 */:
                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                        case 67:
                        case ParserConstants.LPAREN /* 76 */:
                        case ParserConstants.LBRACE /* 78 */:
                        case 80:
                            break;
                    }
                }
            }
            Expression();
            i9 = 1;
            while (true) {
                iJj_ntk_f = this.jj_ntk;
                if (iJj_ntk_f == -1) {
                }
                if (iJj_ntk_f == 83) {
                }
                i9++;
            }
        } catch (Throwable th5) {
            th = th5;
            z9 = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:30:0x0079, B:32:0x007d, B:34:0x0081, B:35:0x0083, B:38:0x0086, B:39:0x0088, B:40:0x0089, B:41:0x008b), top: B:49:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:30:0x0079, B:32:0x007d, B:34:0x0081, B:35:0x0083, B:38:0x0086, B:39:0x0088, B:40:0x0089, B:41:0x008b), top: B:49:0x0079 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WhenExpression() throws Throwable {
        boolean z9;
        BSHWhenExpression bSHWhenExpression = new BSHWhenExpression(23);
        this.jjtree.openNodeScope(bSHWhenExpression);
        jjtreeOpenNodeScope(bSHWhenExpression);
        try {
            jj_consume_token(60);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            jj_consume_token(78);
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHWhenExpression);
                z9 = false;
                try {
                    if (!(th2 instanceof ParseException)) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (z9) {
                        this.jjtree.closeNodeScope((Node) bSHWhenExpression, true);
                        if (this.jjtree.nodeCreated()) {
                            jjtreeCloseNodeScope(bSHWhenExpression);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z9 = true;
            }
        }
        while (true) {
            WhenEntry();
            int iJj_ntk_f = this.jj_ntk;
            if (iJj_ntk_f == -1) {
                iJj_ntk_f = jj_ntk_f();
            }
            if (iJj_ntk_f != 23 && iJj_ntk_f != 24 && iJj_ntk_f != 41 && iJj_ntk_f != 42 && iJj_ntk_f != 90 && iJj_ntk_f != 91) {
                switch (iJj_ntk_f) {
                    case 12:
                    case 15:
                    case 18:
                    case 27:
                    case 30:
                    case 37:
                    case 39:
                    case 48:
                    case 56:
                    case 58:
                    case ParserConstants.WHEN /* 60 */:
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                    case 67:
                    case ParserConstants.LPAREN /* 76 */:
                    case ParserConstants.LBRACE /* 78 */:
                    case 80:
                        continue;
                    default:
                        switch (iJj_ntk_f) {
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                                continue;
                            default:
                                switch (iJj_ntk_f) {
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                        continue;
                                }
                                this.jj_la1[71] = this.jj_gen;
                                jj_consume_token(79);
                                this.jjtree.closeNodeScope((Node) bSHWhenExpression, true);
                                if (this.jjtree.nodeCreated()) {
                                    jjtreeCloseNodeScope(bSHWhenExpression);
                                    return;
                                }
                                return;
                        }
                        break;
                }
                this.jjtree.clearNodeScope(bSHWhenExpression);
                z9 = false;
                if (!(th2 instanceof ParseException)) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void WhileStatement() throws Throwable {
        boolean z9;
        BSHWhileStatement bSHWhileStatement = new BSHWhileStatement(34);
        this.jjtree.openNodeScope(bSHWhileStatement);
        jjtreeOpenNodeScope(bSHWhileStatement);
        try {
            jj_consume_token(61);
            jj_consume_token(76);
            Expression();
            jj_consume_token(77);
            Statement();
            this.jjtree.closeNodeScope((Node) bSHWhileStatement, true);
            if (this.jjtree.nodeCreated()) {
                jjtreeCloseNodeScope(bSHWhileStatement);
            }
        } catch (Throwable th2) {
            try {
                this.jjtree.clearNodeScope(bSHWhileStatement);
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
            }
            try {
                if (th2 instanceof ParseException) {
                    throw ((ParseException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            } catch (Throwable th4) {
                th = th4;
                if (z9) {
                    this.jjtree.closeNodeScope((Node) bSHWhileStatement, true);
                    if (this.jjtree.nodeCreated()) {
                        jjtreeCloseNodeScope(bSHWhileStatement);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParseException createParseException(String str, Exception exc) {
        Token token = this.token;
        int i9 = token.beginLine;
        int i10 = token.beginColumn;
        if (token.kind == 0) {
            String str2 = ParserConstants.tokenImage[0];
        }
        StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, i10, "Parse error at line ", ", column ", " : ");
        sbM2256s.append(str);
        return new ParseException(sbM2256s.toString(), exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParseException generateParseException() {
        this.jj_expentries.clear();
        boolean[] zArr = new boolean[Opcodes.IFLT];
        int i9 = this.jj_kind;
        if (i9 >= 0) {
            zArr[i9] = true;
            this.jj_kind = -1;
        }
        for (int i10 = 0; i10 < 123; i10++) {
            if (this.jj_la1[i10] == this.jj_gen) {
                for (int i11 = 0; i11 < 32; i11++) {
                    int i12 = 1 << i11;
                    if ((jj_la1_0[i10] & i12) != 0) {
                        zArr[i11] = true;
                    }
                    if ((jj_la1_1[i10] & i12) != 0) {
                        zArr[i11 + 32] = true;
                    }
                    if ((jj_la1_2[i10] & i12) != 0) {
                        zArr[i11 + 64] = true;
                    }
                    if ((jj_la1_3[i10] & i12) != 0) {
                        zArr[i11 + 96] = true;
                    }
                    if ((jj_la1_4[i10] & i12) != 0) {
                        zArr[i11 + 128] = true;
                    }
                }
            }
        }
        for (int i13 = 0; i13 < 155; i13++) {
            if (zArr[i13]) {
                int[] iArr = {i13};
                this.jj_expentry = iArr;
                this.jj_expentries.add(iArr);
            }
        }
        this.jj_endpos = 0;
        jj_rescan_token();
        jj_add_error_token(0, 0);
        int[][] iArr2 = new int[this.jj_expentries.size()][];
        for (int i14 = 0; i14 < this.jj_expentries.size(); i14++) {
            iArr2[i14] = this.jj_expentries.get(i14);
        }
        return new ParseException(this.token, iArr2, ParserConstants.tokenImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Token getNextToken() {
        Token token = this.token;
        Token token2 = token.next;
        if (token2 != null) {
            this.token = token2;
        } else {
            Token nextToken = this.token_source.getNextToken();
            token.next = nextToken;
            this.token = nextToken;
        }
        this.jj_ntk = -1;
        this.jj_gen++;
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Token getToken(int i9) {
        Token token = this.jj_lookingAhead ? this.jj_scanpos : this.token;
        for (int i10 = 0; i10 < i9; i10++) {
            if (token.next == null) {
                token.next = this.token_source.getNextToken();
            }
            token = token.next;
        }
        return token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isFormalParameterDimensions() {
        if (getToken(1).kind != 80 || getToken(2).kind != 81) {
            return false;
        }
        int i9 = 3;
        while (true) {
            int i10 = i9 + 1;
            int i11 = getToken(i9).kind;
            if (i11 != 0 && i11 != 85) {
                if (i11 != 77) {
                    if (i11 != 78 && i11 != 82) {
                        if (i11 == 83) {
                            break;
                        }
                        i9 = i10;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isImplicitMethodTerminator() {
        int i9;
        Token token = getToken(1);
        return this.token.endLine < token.beginLine || (i9 = token.kind) == 79 || i9 == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isRegularForStatement() {
        if (getToken(1).kind != 31 || getToken(2).kind != 76) {
            return false;
        }
        int i9 = 3;
        while (true) {
            int i10 = i9 + 1;
            int i11 = getToken(i9).kind;
            if (i11 == 0) {
                return false;
            }
            if (i11 == 82) {
                return true;
            }
            if (i11 == 150) {
                return false;
            }
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isSameLineReturnExpression() {
        /*
            r5 = this;
            r0 = 1
            bsh.Token r1 = r5.getToken(r0)
            bsh.Token r2 = r5.token
            int r2 = r2.endLine
            int r3 = r1.beginLine
            r4 = 0
            if (r2 >= r3) goto Lf
            return r4
        Lf:
            int r1 = r1.kind
            r2 = 41
            if (r1 == r2) goto L2b
            r2 = 42
            if (r1 == r2) goto L2b
            r2 = 90
            if (r1 == r2) goto L2b
            r2 = 91
            if (r1 == r2) goto L2b
            switch(r1) {
                case 12: goto L2b;
                case 15: goto L2b;
                case 18: goto L2b;
                case 23: goto L2b;
                case 27: goto L2b;
                case 30: goto L2b;
                case 37: goto L2b;
                case 39: goto L2b;
                case 48: goto L2b;
                case 56: goto L2b;
                case 58: goto L2b;
                case 60: goto L2b;
                case 62: goto L2b;
                case 67: goto L2b;
                case 76: goto L2b;
                case 78: goto L2b;
                case 80: goto L2b;
                default: goto L24;
            }
        L24:
            switch(r1) {
                case 70: goto L2b;
                case 71: goto L2b;
                case 72: goto L2b;
                case 73: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r1) {
                case 102: goto L2b;
                case 103: goto L2b;
                case 104: goto L2b;
                case 105: goto L2b;
                default: goto L2a;
            }
        L2a:
            return r4
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.isSameLineReturnExpression():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void jjtreeCloseNodeScope(Node node) {
        ((SimpleNode) node).lastToken = getToken(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void jjtreeOpenNodeScope(Node node) {
        ((SimpleNode) node).firstToken = getToken(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Primitive parseIntegral(String str) {
        int radix = getRadix(str);
        return new Primitive(new BigInteger(str.substring(getStartIdx(radix)), radix));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SimpleNode popNode() {
        if (this.jjtree.nodeArity() > 0) {
            return (SimpleNode) this.jjtree.popNode();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reInitInput(Reader reader) {
        ReInit(reader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reInitTokenInput(Reader reader) {
        JavaCharStream javaCharStream = this.jj_input_stream;
        javaCharStream.reInit(reader, javaCharStream.getEndLine(), this.jj_input_stream.getEndColumn());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRetainComments(boolean z9) {
        this.retainComments = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean trace_enabled() {
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class LookaheadSuccess extends IllegalStateException {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: bsh.Parser.LookaheadSuccess.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ LookaheadSuccess(int i9) {
            this();
        }

        private LookaheadSuccess() {
        }
    }

    public final void disable_tracing() {
    }

    public final void enable_tracing() {
    }

    public void ReInit(InputStream inputStream, Charset charset) {
        this.jj_input_stream.reInit(inputStream, charset, 1, 1);
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        int i9 = 0;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }

    public void ReInit(ParserTokenManager parserTokenManager) {
        this.token_source = parserTokenManager;
        this.token = new Token();
        this.jj_ntk = -1;
        int i9 = 0;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }

    public Parser(Reader reader) {
        this.jjtree = new JJTParserState();
        int i9 = 0;
        this.retainComments = false;
        this.jj_lookingAhead = false;
        this.jj_la1 = new int[123];
        this.jj_2_rtns = new JJCalls[41];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess(i9);
        this.jj_expentries = new ArrayList();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        JavaCharStream javaCharStream = new JavaCharStream(reader, 1, 1);
        this.jj_input_stream = javaCharStream;
        this.token_source = new ParserTokenManager(javaCharStream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }

    public Parser(ParserTokenManager parserTokenManager) {
        this.jjtree = new JJTParserState();
        int i9 = 0;
        this.retainComments = false;
        this.jj_lookingAhead = false;
        this.jj_la1 = new int[123];
        this.jj_2_rtns = new JJCalls[41];
        this.jj_rescan = false;
        this.jj_gc = 0;
        this.jj_ls = new LookaheadSuccess(i9);
        this.jj_expentries = new ArrayList();
        this.jj_kind = -1;
        this.jj_lasttokens = new int[100];
        this.token_source = parserTokenManager;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jj_gen = 0;
        for (int i10 = 0; i10 < 123; i10++) {
            this.jj_la1[i10] = -1;
        }
        while (true) {
            JJCalls[] jJCallsArr = this.jj_2_rtns;
            if (i9 >= jJCallsArr.length) {
                return;
            }
            jJCallsArr[i9] = new JJCalls();
            i9++;
        }
    }
}
