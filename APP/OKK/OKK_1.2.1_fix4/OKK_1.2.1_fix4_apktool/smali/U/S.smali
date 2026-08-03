.class public abstract LU/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:J = 0x0L

.field public static b:Ljava/lang/reflect/Method; = null

.field public static c:Z = true

.field public static d:Z = true

.field public static e:Ljava/lang/reflect/Field;

.field public static f:Z

.field public static volatile g:Lb0/a;

.field public static volatile h:Z

.field public static volatile i:Z

.field public static volatile j:Z

.field public static volatile k:LP0/l;

.field public static volatile l:LP0/l;

.field public static volatile m:LP0/l;

.field public static volatile n:LP0/l;

.field public static volatile o:LP0/l;

.field public static volatile p:Landroid/widget/FrameLayout;

.field public static volatile q:Landroid/widget/LinearLayout;

.field public static volatile r:Landroid/view/View;

.field public static volatile s:Z

.field public static volatile t:LP0/l;

.field public static volatile u:LP0/a;

.field public static volatile v:Z

.field public static volatile w:Z

.field public static volatile x:F

.field public static volatile y:F


# direct methods
.method public static A(BBBB[CI)V
    .locals 2

    invoke-static {p1}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_0

    shl-int/lit8 v0, p0, 0x1c

    add-int/lit8 v1, p1, 0x70

    add-int/2addr v1, v0

    shr-int/lit8 v0, v1, 0x1e

    if-nez v0, :cond_0

    invoke-static {p2}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_0

    and-int/lit8 p0, p0, 0x7

    shl-int/lit8 p0, p0, 0x12

    and-int/lit8 p1, p1, 0x3f

    shl-int/lit8 p1, p1, 0xc

    or-int/2addr p0, p1

    and-int/lit8 p1, p2, 0x3f

    shl-int/lit8 p1, p1, 0x6

    or-int/2addr p0, p1

    and-int/lit8 p1, p3, 0x3f

    or-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0xa

    const p2, 0xd7c0

    add-int/2addr p1, p2

    int-to-char p1, p1

    aput-char p1, p4, p5

    add-int/lit8 p5, p5, 0x1

    and-int/lit16 p0, p0, 0x3ff

    const p1, 0xdc00

    add-int/2addr p0, p1

    int-to-char p0, p0

    aput-char p0, p4, p5

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid UTF-8"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static B(BBB[CI)V
    .locals 2

    invoke-static {p1}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, -0x20

    const/16 v1, -0x60

    if-ne p0, v0, :cond_0

    if-lt p1, v1, :cond_2

    :cond_0
    const/16 v0, -0x13

    if-ne p0, v0, :cond_1

    if-ge p1, v1, :cond_2

    :cond_1
    invoke-static {p2}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_2

    and-int/lit8 p0, p0, 0xf

    shl-int/lit8 p0, p0, 0xc

    and-int/lit8 p1, p1, 0x3f

    shl-int/lit8 p1, p1, 0x6

    or-int/2addr p0, p1

    and-int/lit8 p1, p2, 0x3f

    or-int/2addr p0, p1

    int-to-char p0, p0

    aput-char p0, p3, p4

    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid UTF-8"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static C(BB[CI)V
    .locals 1

    const/16 v0, -0x3e

    if-lt p0, v0, :cond_1

    invoke-static {p1}, LU/S;->F(B)Z

    move-result v0

    if-nez v0, :cond_0

    and-int/lit8 p0, p0, 0x1f

    shl-int/lit8 p0, p0, 0x6

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p0, p1

    int-to-char p0, p0

    aput-char p0, p2, p3

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid UTF-8: Illegal leading byte in 2 bytes utf"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static D([B)[B
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_4

    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_0
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_1

    const/4 v1, 0x0

    :cond_1
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "[\u5df2\u5220\u9664]"

    invoke-static {v1, v2, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p0

    :cond_2
    array-length v0, p0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    :try_start_1
    invoke-static {p0}, LU/S;->Z([B)[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p0, v0

    :goto_2
    check-cast p0, [B

    :goto_3
    return-object p0

    :cond_5
    :goto_4
    if-nez p0, :cond_6

    new-array p0, v0, [B

    :cond_6
    return-object p0
.end method

.method public static E(Ljava/lang/String;)Z
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    const-string v0, "SnsComment"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const-string v0, "commentflag"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lx0/e;->b(I)I

    move-result v0

    const-string v1, "commentflag\\s*=\\s*[12]\\b"

    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    return p0
.end method

.method public static F(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static G(B)Z
    .locals 0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static H()Z
    .locals 1

    sget-object v0, LU/S;->p:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v0, LU/S;->p:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static I(Ljava/lang/String;)Z
    .locals 11

    const-string v0, "text"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "\u64a4\u56de"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    const-string v3, "patmsg"

    const-string v4, "\u62cd\u4e86\u62cd"

    const/4 v5, 0x1

    if-nez v2, :cond_2

    invoke-static {p0, v4, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "recalled"

    invoke-static {p0, v2, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p0, v3, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :cond_2
    :goto_1
    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v6, "replaceAll(...)"

    const-string v7, ""

    const-string v8, "compile(...)"

    const-string v9, "\\s+"

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "\u4f60\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    invoke-static {v2, v10, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v10, "\u4f60\u64a4\u56de\u4e00\u6761\u6d88\u606f"

    invoke-static {v2, v10, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v10, "Yourecalledamessage"

    invoke-static {v2, v10, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v2, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "\u91cd\u65b0\u7f16\u8f91"

    invoke-static {v2, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    invoke-static {p0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v0, v8}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<patmsg"

    invoke-static {p0, v0, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_3

    :cond_9
    invoke-static {p0, v3, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "template"

    invoke-static {p0, v0, v5}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_3

    :cond_a
    invoke-static {p0, v4, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    const-string v0, "\""

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "\u201c"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "\u4f60\u62cd\u4e86\u62cd"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "\u62cd\u4e86\u62cd\u6211"

    invoke-static {p0, v0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_d

    :cond_c
    :goto_3
    move v1, v5

    :cond_d
    :goto_4
    return v1
.end method

.method public static J(C)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static K(LP0/p;)LV0/i;
    .locals 3

    const-string v0, "block"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV0/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "<this>"

    invoke-static {p0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "completion"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p0, LJ0/a;

    if-eqz v1, :cond_0

    check-cast p0, LJ0/a;

    invoke-virtual {p0, v0, v0}, LJ0/a;->d(Ljava/lang/Object;LH0/a;)LH0/a;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LH0/a;->c()LH0/d;

    move-result-object v1

    sget-object v2, LH0/e;->a:LH0/e;

    if-ne v1, v2, :cond_1

    new-instance v1, LI0/b;

    invoke-direct {v1, v0, p0, v0}, LI0/b;-><init>(LH0/a;LP0/p;Ljava/lang/Object;)V

    move-object p0, v1

    goto :goto_0

    :cond_1
    new-instance v2, LI0/c;

    invoke-direct {v2, v0, v1, p0, v0}, LI0/c;-><init>(LH0/a;LH0/d;LP0/p;Ljava/lang/Object;)V

    move-object p0, v2

    :goto_0
    iput-object p0, v0, LV0/i;->d:LH0/a;

    return-object v0
.end method

.method public static L()Lb0/a;
    .locals 14

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    const-string v3, "/sdcard/Android/media/com.tencent.mm/OKK"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v3, "compat_report.json"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    sget-object v3, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v1, v3}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "results"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    :goto_0
    const-string v5, "optString(...)"

    const-string v6, ""

    const-string v7, "getString(...)"

    if-ge v4, v3, :cond_1

    :try_start_1
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    new-instance v10, Lb0/n;

    const-string v11, "id"

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "title"

    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "level"

    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13}, Lb0/m;->valueOf(Ljava/lang/String;)Lb0/m;

    move-result-object v7

    const-string v13, "detail"

    invoke-virtual {v9, v13, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v11, v12, v7, v6}, Lb0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lb0/m;Ljava/lang/String;)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    new-instance v1, Lb0/a;

    const-string v3, "fingerprint"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "wechat"

    invoke-virtual {v2, v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "atMs"

    const-wide/16 v9, 0x0

    invoke-virtual {v2, v3, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v9

    const/4 v2, 0x0

    move-object v3, v1

    move-object v5, v6

    move-wide v6, v9

    move v9, v2

    invoke-direct/range {v3 .. v9}, Lb0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Z)V

    sput-object v1, LU/S;->g:Lb0/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :goto_2
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, v1

    :goto_3
    check-cast v0, Lb0/a;

    return-object v0
.end method

.method public static M()Ljava/util/List;
    .locals 8

    const/4 v0, 0x1

    const-string v1, ""

    :try_start_0
    sget-object v2, Lc0/h1;->a:Lc0/h1;

    const-string v2, "home_drawer_shortcuts"

    invoke-static {v2, v1}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v2

    :goto_0
    instance-of v3, v2, LD0/f;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_1
    check-cast v1, Ljava/lang/String;

    new-array v2, v0, [C

    const/16 v3, 0x2c

    const/4 v4, 0x0

    aput-char v3, v2, v4

    invoke-static {v1, v2}, LW0/j;->X0(Ljava/lang/String;[C)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v4, Lc0/E0;->e:Lc0/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "id"

    invoke-static {v3, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lc0/E0;->h:LK0/a;

    invoke-virtual {v4}, LE0/f;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    move-object v5, v4

    check-cast v5, LE0/c;

    invoke-virtual {v5}, LE0/c;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lc0/E0;

    iget-object v6, v6, Lc0/E0;->a:Ljava/lang/String;

    invoke-static {v3}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, LW0/r;->D0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    check-cast v5, Lc0/E0;

    if-eqz v5, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v2}, LE0/l;->o0(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1, v0}, LE0/l;->u0(ILjava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Lc0/E0;->e:Lc0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc0/E0;->f:Ljava/util/List;

    :cond_5
    return-object v0
.end method

.method public static N()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    const-string v3, "/sdcard/Android/media/com.tencent.mm/OKK"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v3, "compat_dialog_shown.txt"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    sget-object v2, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, LN0/k;->i0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v1

    :cond_1
    :goto_0
    instance-of v2, v1, LD0/f;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static O(Ljava/lang/String;)V
    .locals 3

    const-string v0, "/sdcard/Android/media/com.tencent.mm/OKK"

    const-string v1, "fp"

    invoke-static {p0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    sput-boolean v1, LU/S;->h:Z

    sput-boolean v1, LU/S;->i:Z

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v0, "compat_dialog_shown.txt"

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v1, p0}, LN0/k;->k0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void
.end method

.method public static P(Landroid/widget/LinearLayout;Landroid/content/Context;IIIFLjava/util/List;)V
    .locals 19

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p4

    move/from16 v3, p5

    const/4 v6, 0x2

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v11, 0xe

    invoke-static {v11, v3}, LU/S;->Q(IF)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v9, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v9, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v7, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v6, v3}, LU/S;->Q(IF)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v9}, Landroid/view/View;->setElevation(F)V

    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v12, v10

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const/4 v15, -0x1

    if-eqz v13, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v16, v12, 0x1

    if-ltz v12, :cond_4

    check-cast v13, Ld0/m;

    if-lez v12, :cond_0

    new-instance v14, Landroid/view/View;

    invoke-direct {v14, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v17, "#0F000000"

    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v14, v4}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v15, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v15, 0x34

    invoke-static {v15, v3}, LU/S;->Q(IF)I

    move-result v15

    iput v15, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v7, v14, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v14, 0x10

    invoke-virtual {v4, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v11, v3}, LU/S;->Q(IF)I

    move-result v14

    const/16 v15, 0xd

    invoke-static {v15, v3}, LU/S;->Q(IF)I

    move-result v5

    invoke-static {v11, v3}, LU/S;->Q(IF)I

    move-result v6

    invoke-static {v15, v3}, LU/S;->Q(IF)I

    move-result v15

    invoke-virtual {v4, v14, v5, v6, v15}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v4, v8}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v4, v8}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    if-ne v5, v6, :cond_1

    const-string v5, "#33FFFFFF"

    goto :goto_1

    :cond_1
    const-string v5, "#22000000"

    :goto_1
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-static {v11, v3}, LU/S;->Q(IF)I

    move-result v6

    int-to-float v6, v6

    const/4 v14, 0x0

    if-nez v12, :cond_2

    move v15, v6

    goto :goto_2

    :cond_2
    move v15, v14

    :goto_2
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v18

    add-int/lit8 v11, v18, -0x1

    if-ne v12, v11, :cond_3

    goto :goto_3

    :cond_3
    move v6, v14

    :goto_3
    const/16 v11, 0x8

    new-array v11, v11, [F

    aput v15, v11, v10

    aput v15, v11, v8

    const/4 v12, 0x2

    aput v15, v11, v12

    const/4 v12, 0x3

    aput v15, v11, v12

    const/4 v12, 0x4

    aput v6, v11, v12

    const/4 v12, 0x5

    aput v6, v11, v12

    const/4 v12, 0x6

    aput v6, v11, v12

    const/4 v12, 0x7

    aput v6, v11, v12

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v6, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v6, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    const/4 v12, -0x1

    invoke-virtual {v6, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    new-instance v12, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v12, v10}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v12, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    invoke-virtual {v12, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-direct {v11, v5, v12, v6}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, LA0/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6, v13}, LA0/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v11, v13, Ld0/m;->a:Ljava/lang/String;

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v11, 0x41800000    # 16.0f

    const/4 v12, 0x2

    invoke-virtual {v5, v12, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v11, 0x11

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v12, 0x1c

    invoke-static {v12, v3}, LU/S;->Q(IF)I

    move-result v14

    invoke-static {v12, v3}, LU/S;->Q(IF)I

    move-result v12

    invoke-direct {v11, v14, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v11, 0xa

    invoke-static {v11, v3}, LU/S;->Q(IF)I

    move-result v11

    invoke-virtual {v5, v11, v10, v10, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v12, v13, Ld0/m;->b:Ljava/lang/String;

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move/from16 v12, p3

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v14, 0x41700000    # 15.0f

    const/4 v15, 0x2

    invoke-virtual {v11, v15, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v13, v13, Ld0/m;->c:Ljava/lang/String;

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v13, 0x41300000    # 11.0f

    invoke-virtual {v11, v15, v13}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-static {v15, v3}, LU/S;->Q(IF)I

    move-result v13

    invoke-virtual {v11, v10, v13, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, -0x2

    invoke-direct {v11, v10, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v11, "\u203a"

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v11, 0x41900000    # 18.0f

    const/4 v13, 0x2

    invoke-virtual {v5, v13, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v6, v13

    move/from16 v12, v16

    const/16 v11, 0xe

    goto/16 :goto_0

    :cond_4
    invoke-static {}, LE0/m;->j0()V

    const/4 v0, 0x0

    throw v0

    :cond_5
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x6

    invoke-static {v1, v3}, LU/S;->Q(IF)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static final Q(IF)I
    .locals 0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static R(Landroid/app/Activity;LP0/a;)V
    .locals 5

    sget-boolean v0, LU/S;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LU/S;->q:Landroid/widget/LinearLayout;

    sget-object v1, LU/S;->r:Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    :cond_4
    if-eqz v2, :cond_5

    new-instance v4, LS/a;

    invoke-direct {v4, v0, v1, v3}, LS/a;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;I)V

    const-wide/16 v0, 0x32

    invoke-virtual {v2, v4, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    if-eqz v2, :cond_6

    new-instance v0, LS/h;

    const/4 v1, 0x5

    invoke-direct {v0, p0, p1, v1}, LS/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-wide/16 p0, 0x5a

    invoke-virtual {v2, v0, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_6
    return-void
.end method

.method public static S(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "fp"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LU/S;->N()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static T(Lb0/s;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb0/n;

    iget-object v2, v1, Lb0/n;->c:Lb0/m;

    sget-object v3, Lb0/m;->c:Lb0/m;

    if-ne v2, v3, :cond_0

    goto :goto_4

    :cond_0
    iget v3, p0, Lb0/s;->e:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_1

    iget v3, p0, Lb0/s;->f:I

    if-nez v3, :cond_1

    const/16 v3, 0x45

    iget v4, p0, Lb0/s;->g:I

    if-gt v3, v4, :cond_1

    const/16 v3, 0x4d

    if-ge v4, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x3

    sget-object v6, Lb0/m;->b:Lb0/m;

    iget-object v7, v1, Lb0/n;->d:Ljava/lang/String;

    if-nez v3, :cond_3

    invoke-static {v7}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "\u8d85\u51fa\u4e3b\u9002\u914d\u8303\u56f4\uff0c\u6309\u9759\u6001\u7279\u5f81\u4f30\u8ba1"

    goto :goto_2

    :cond_2
    const-string v2, "\u8d85\u51fa\u4e3b\u9002\u914d\u8303\u56f4\uff0c\u6309\u9759\u6001\u7279\u5f81\u4f30\u8ba1 \u00b7 "

    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-static {v1, v4, v6, v2, v5}, Lb0/n;->a(Lb0/n;Ljava/lang/String;Lb0/m;Ljava/lang/String;I)Lb0/n;

    move-result-object v1

    goto :goto_4

    :cond_3
    sget-object v3, Lb0/r;->c:Lb0/r;

    iget-object v8, p0, Lb0/s;->c:Lb0/r;

    if-ne v8, v3, :cond_5

    sget-object v3, Lb0/m;->a:Lb0/m;

    if-ne v2, v3, :cond_5

    invoke-static {v7}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "\u6e20\u9053\u672a\u8bc6\u522b\uff0c\u9700\u8fd0\u884c\u65f6\u9a8c\u8bc1"

    goto :goto_3

    :cond_4
    const-string v2, "\u6e20\u9053\u672a\u8bc6\u522b\uff0c\u9700\u8fd0\u884c\u65f6\u9a8c\u8bc1 \u00b7 "

    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-static {v1, v4, v6, v2, v5}, Lb0/n;->a(Lb0/n;Ljava/lang/String;Lb0/m;Ljava/lang/String;I)Lb0/n;

    move-result-object v1

    :cond_5
    :goto_4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static W()Ld0/n;
    .locals 5

    sget-object v0, LU/S;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v2, LU/S;->r:Landroid/view/View;

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-lez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v4, v1

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-eqz v3, :cond_4

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    if-gtz v3, :cond_5

    return-object v1

    :cond_5
    new-instance v1, Ld0/n;

    invoke-direct {v1, v0, v2, v3}, Ld0/n;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;I)V

    return-object v1
.end method

.method public static X(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, LE/d;->b()Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v0

    invoke-static {p0, p1, v0}, LE/d;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    :goto_0
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iget-wide p0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_2
    invoke-static {p0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    const-string p0, "na"

    :goto_3
    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static Y(Ljava/lang/String;I)I
    .locals 2

    invoke-static {p0}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    return p1

    :cond_1
    const/4 v0, 0x0

    const-string v1, "#"

    invoke-static {p0, v1, v0}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    :try_start_0
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    instance-of v0, p0, LD0/f;

    if-eqz v0, :cond_3

    move-object p0, p1

    :cond_3
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static Z([B)[B
    .locals 16

    move-object/from16 v1, p0

    const-string v0, "buf"

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "[\u5df2\u5220\u9664] "

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    array-length v0, v1

    sget-object v4, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v5, "getBytes(...)"

    invoke-static {v4, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v4

    add-int/2addr v0, v4

    const/16 v4, 0x8

    add-int/2addr v0, v4

    invoke-direct {v3, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v6, 0x0

    move v0, v6

    move v7, v0

    :goto_0
    array-length v8, v1

    const/16 v9, 0x42

    if-ge v7, v8, :cond_e

    invoke-static {v1, v7}, LU/S;->c0([BI)LD0/e;

    move-result-object v8

    if-nez v8, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v10, v8, LD0/e;->a:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iget-object v8, v8, LD0/e;->b:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    const-wide/16 v12, 0x7

    and-long/2addr v12, v10

    long-to-int v12, v12

    const/4 v13, 0x3

    ushr-long v13, v10, v13

    long-to-int v13, v13

    if-eqz v12, :cond_c

    const/4 v14, 0x1

    if-eq v12, v14, :cond_b

    const/4 v15, 0x2

    if-eq v12, v15, :cond_3

    const/4 v10, 0x5

    if-eq v12, v10, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v10, v8, 0x4

    array-length v11, v1

    if-gt v10, v11, :cond_a

    sub-int/2addr v8, v7

    add-int/lit8 v8, v8, 0x4

    invoke-virtual {v3, v1, v7, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :goto_1
    move v7, v10

    goto :goto_0

    :cond_3
    invoke-static {v1, v8}, LU/S;->c0([BI)LD0/e;

    move-result-object v12

    if-nez v12, :cond_4

    goto/16 :goto_7

    :cond_4
    iget-object v8, v12, LD0/e;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    iget-object v8, v12, LD0/e;->b:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    long-to-int v12, v14

    add-int/2addr v12, v8

    array-length v14, v1

    if-gt v12, v14, :cond_a

    if-nez v0, :cond_9

    if-ne v13, v4, :cond_9

    long-to-int v10, v10

    if-ne v10, v9, :cond_9

    array-length v0, v1

    invoke-static {v12, v0}, LA0/p;->s(II)V

    invoke-static {v1, v8, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    const-string v0, "copyOfRange(...)"

    invoke-static {v8, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/lang/String;

    sget-object v10, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v8, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_2
    instance-of v10, v0, LD0/f;

    if-eqz v10, :cond_5

    const/4 v0, 0x0

    :cond_5
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v10, "[\u5df2\u5220\u9664]"

    invoke-static {v0, v10, v6}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_6

    invoke-static {v0, v10, v6}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_7

    :cond_6
    sub-int v0, v12, v7

    invoke-virtual {v3, v1, v7, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_4

    :cond_7
    if-eqz v0, :cond_8

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v7, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    sget-object v0, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v0

    array-length v10, v8

    add-int v11, v7, v10

    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v8, v6, v0, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    :goto_3
    int-to-long v7, v9

    invoke-static {v3, v7, v8}, LU/S;->w0(Ljava/io/ByteArrayOutputStream;J)V

    array-length v7, v0

    int-to-long v7, v7

    invoke-static {v3, v7, v8}, LU/S;->w0(Ljava/io/ByteArrayOutputStream;J)V

    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_9
    sub-int v8, v12, v7

    invoke-virtual {v3, v1, v7, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :goto_5
    move v7, v12

    goto/16 :goto_0

    :cond_a
    :goto_6
    move v7, v8

    goto :goto_8

    :cond_b
    add-int/lit8 v10, v8, 0x8

    array-length v11, v1

    if-gt v10, v11, :cond_a

    sub-int/2addr v8, v7

    add-int/2addr v8, v4

    invoke-virtual {v3, v1, v7, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto/16 :goto_1

    :cond_c
    invoke-static {v1, v8}, LU/S;->c0([BI)LD0/e;

    move-result-object v10

    if-nez v10, :cond_d

    :goto_7
    goto :goto_6

    :cond_d
    iget-object v8, v10, LD0/e;->b:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v10

    sub-int v8, v10, v7

    invoke-virtual {v3, v1, v7, v8}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto/16 :goto_1

    :cond_e
    :goto_8
    if-nez v0, :cond_f

    int-to-long v8, v9

    invoke-static {v3, v8, v9}, LU/S;->w0(Ljava/io/ByteArrayOutputStream;J)V

    invoke-static {v2}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, LW0/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-static {v2, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v2

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, LU/S;->w0(Ljava/io/ByteArrayOutputStream;J)V

    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V

    :cond_f
    array-length v2, v1

    if-ge v7, v2, :cond_10

    if-nez v0, :cond_10

    return-object v1

    :cond_10
    array-length v0, v1

    if-ge v7, v0, :cond_11

    array-length v0, v1

    sub-int/2addr v0, v7

    invoke-virtual {v3, v1, v7, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    :cond_11
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "toByteArray(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, LW0/d;

    invoke-direct {p1, p0, p2}, LW0/d;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method public static a0(Ljava/lang/String;IZ)I
    .locals 3

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "get"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "is"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "has"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "can"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "should"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "equals"

    invoke-static {p0, v0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "hashcode"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "tostring"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "compareto"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p2, :cond_1

    const/16 p2, 0x32

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    const/4 v0, 0x1

    const/4 v2, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p2, p2, 0xa

    goto :goto_1

    :cond_3
    add-int/lit8 p2, p2, 0x14

    :goto_1
    const-string p1, "quote"

    invoke-static {p0, p1, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "refer"

    invoke-static {p0, p1, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "reply"

    invoke-static {p0, p1, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    add-int/lit8 p2, p2, 0x50

    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/16 v0, 0xe7a

    if-eq p1, v0, :cond_6

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string p1, "d"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :pswitch_1
    const-string p1, "c"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :pswitch_2
    const-string p1, "b"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :pswitch_3
    const-string p1, "a"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_6
    const-string p1, "v0"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    add-int/lit8 p2, p2, 0x1e

    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x3

    if-gt p1, v0, :cond_9

    add-int/lit8 p2, p2, 0xf

    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-gt p0, v2, :cond_a

    add-int/lit8 p2, p2, 0xa

    :cond_a
    return p2

    :cond_b
    :goto_3
    const/16 p0, -0x3e8

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lc0/K0;ILjava/lang/String;)Lc0/K0;
    .locals 13

    const v0, 0xffff

    and-int/2addr p1, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    invoke-static {p2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/2addr v2, v1

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iget v3, p0, Lc0/K0;->b:I

    add-int/lit8 v6, v3, 0x1

    iget v3, p0, Lc0/K0;->c:I

    if-ne p1, v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    move v7, v3

    iget v1, p0, Lc0/K0;->d:I

    add-int v8, v1, v2

    const/16 v1, 0x2f

    iget v2, p0, Lc0/K0;->e:I

    if-ne p1, v1, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    move v9, v2

    const v1, 0x19000031

    iget v2, p0, Lc0/K0;->f:I

    if-eq p1, v1, :cond_4

    const-string v1, "\u5fae\u4fe1\u8f6c\u8d26"

    invoke-static {p2, v1, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move v10, v2

    goto :goto_3

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :goto_3
    const v1, 0x1a000031

    iget v2, p0, Lc0/K0;->g:I

    if-eq p1, v1, :cond_6

    const-string v1, "\u5fae\u4fe1\u7ea2\u5305"

    invoke-static {p2, v1, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move v11, v2

    goto :goto_6

    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :goto_6
    const/4 p2, 0x6

    iget v0, p0, Lc0/K0;->h:I

    if-eq p1, p2, :cond_7

    const p2, 0x41000031    # 8.000047f

    if-eq p1, p2, :cond_7

    :goto_7
    move v12, v0

    goto :goto_8

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :goto_8
    iget-object v5, p0, Lc0/K0;->a:Ljava/lang/String;

    const-string p0, "dateKey"

    invoke-static {v5, p0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lc0/K0;

    move-object v4, p0

    invoke-direct/range {v4 .. v12}, Lc0/K0;-><init>(Ljava/lang/String;IIIIIII)V

    return-object p0
.end method

.method public static b0(Ljava/nio/MappedByteBuffer;)LM/b;
    .locals 13

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    const/16 v1, 0x64

    const-string v2, "Cannot read metadata."

    if-gt v0, v1, :cond_5

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    const-wide v4, 0xffffffffL

    const-wide/16 v6, -0x1

    if-ge v3, v0, :cond_1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v9

    add-int/lit8 v9, v9, 0x4

    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    int-to-long v9, v9

    and-long/2addr v9, v4

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v11

    add-int/lit8 v11, v11, 0x4

    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const v11, 0x6d657461

    if-ne v11, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-wide v9, v6

    :goto_1
    cmp-long v0, v9, v6

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    int-to-long v6, v0

    sub-long v6, v9, v6

    long-to-int v0, v6

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, 0xc

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    int-to-long v6, v0

    and-long/2addr v6, v4

    :goto_2
    int-to-long v11, v1

    cmp-long v0, v11, v6

    if-gez v0, :cond_4

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    int-to-long v11, v3

    and-long/2addr v11, v4

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    const v3, 0x456d6a69

    if-eq v3, v0, :cond_3

    const v3, 0x656d6a69

    if-ne v3, v0, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    add-long/2addr v11, v9

    long-to-int v0, v11

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v0, LM/b;

    invoke-direct {v0}, LD/D;-><init>()V

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p0, v1}, LS/d;->b(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    iput-object p0, v0, LD/D;->d:Ljava/lang/Object;

    iput v2, v0, LD/D;->a:I

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    sub-int/2addr v2, p0

    iput v2, v0, LD/D;->b:I

    iget-object p0, v0, LD/D;->d:Ljava/lang/Object;

    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p0

    iput p0, v0, LD/D;->c:I

    return-object v0

    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/lang/StringBuilder;Ljava/lang/Object;LP0/l;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    :goto_0
    if-eqz p2, :cond_2

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    if-eqz p2, :cond_3

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_1
    return-void
.end method

.method public static c0([BI)LD0/e;
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge p1, v3, :cond_1

    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    aget-byte v3, p0, p1

    add-int/lit8 p1, p1, 0x1

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LD0/e;

    invoke-direct {v0, p0, p1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Landroid/app/Activity;)Ld0/n;
    .locals 32

    move-object/from16 v10, p0

    const/4 v14, 0x1

    const-string v1, "home_drawer_signature_tip_shown"

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v16, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, v16

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object/from16 v9, v16

    :goto_1
    if-nez v9, :cond_2

    return-object v16

    :cond_2
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_2
    const-string v3, "achat_home_side_drawer"

    if-ge v2, v0, :cond_4

    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    goto :goto_3

    :cond_3
    add-int/2addr v2, v14

    goto :goto_2

    :cond_4
    move-object/from16 v0, v16

    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v4, v2, Landroid/view/ViewGroup;

    if-eqz v4, :cond_5

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_4

    :cond_5
    move-object/from16 v2, v16

    :goto_4
    if-eqz v2, :cond_6

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v8, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    const v2, 0x3f47ae14    # 0.78f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    const/16 v2, 0x12c

    int-to-float v2, v2

    mul-float/2addr v2, v8

    const/high16 v17, 0x3f000000    # 0.5f

    add-float v2, v2, v17

    float-to-int v2, v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v7

    new-instance v6, Landroid/widget/FrameLayout;

    invoke-direct {v6, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v0, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6, v14}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v6, v14}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {v6, v14}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    const/16 v4, 0x18

    int-to-float v0, v4

    mul-float/2addr v0, v8

    add-float v0, v0, v17

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setElevation(F)V

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v0, -0x1000000

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    new-instance v0, Ld0/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-ne v0, v2, :cond_7

    move/from16 v18, v14

    goto :goto_5

    :cond_7
    const/16 v18, 0x0

    :goto_5
    if-eqz v18, :cond_8

    const-string v0, "#1A1C1A"

    :goto_6
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move v2, v0

    goto :goto_7

    :cond_8
    const-string v0, "#F7F8F6"

    goto :goto_6

    :goto_7
    if-eqz v18, :cond_9

    const-string v0, "#F2F4F2"

    :goto_8
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move v11, v0

    goto :goto_9

    :cond_9
    const-string v0, "#1C1F1C"

    goto :goto_8

    :goto_9
    if-eqz v18, :cond_a

    const-string v0, "#9AA39A"

    :goto_a
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    goto :goto_b

    :cond_a
    const-string v0, "#6B736C"

    goto :goto_a

    :goto_b
    if-eqz v18, :cond_b

    const-string v0, "#242724"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    move/from16 v21, v0

    goto :goto_c

    :cond_b
    move/from16 v21, v5

    :goto_c
    const-string v0, "#2F8A4E"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    if-eqz v18, :cond_c

    const-string v0, "#22FFFFFF"

    :goto_d
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    goto :goto_e

    :cond_c
    const-string v0, "#0F000000"

    goto :goto_d

    :goto_e
    new-instance v13, Landroid/widget/LinearLayout;

    invoke-direct {v13, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v13, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v0, Ld0/o;

    invoke-direct {v0, v8}, Ld0/o;-><init>(F)V

    invoke-virtual {v13, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {v13, v14}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    const-string v15, "status_bar_height"

    const-string v5, "dimen"

    move/from16 v25, v2

    const-string v2, "android"

    invoke-virtual {v14, v15, v5, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    const/16 v14, 0x1c

    if-lez v2, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :goto_f
    const/4 v5, -0x1

    goto :goto_10

    :cond_d
    int-to-float v2, v14

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v2, v5

    float-to-int v2, v2

    goto :goto_f

    :goto_10
    invoke-direct {v4, v5, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v13, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v15, Landroid/widget/LinearLayout;

    invoke-direct {v15, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v15, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v0, 0x14

    invoke-static {v0, v8}, LU/S;->e(IF)I

    move-result v0

    const/16 v2, 0x12

    invoke-static {v2, v8}, LU/S;->e(IF)I

    move-result v5

    invoke-static {v4, v8}, LU/S;->e(IF)I

    move-result v14

    invoke-static {v2, v8}, LU/S;->e(IF)I

    move-result v4

    invoke-virtual {v15, v0, v5, v14, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v4, 0x16

    invoke-static {v4, v8}, LU/S;->e(IF)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz v18, :cond_e

    const-string v4, "#202A38"

    :goto_11
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    goto :goto_12

    :cond_e
    const-string v4, "#EAF1EA"

    goto :goto_11

    :goto_12
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v15, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, v10}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const-string v14, "#D0D0D0"

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v4, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v4, Lc0/A0;

    invoke-direct {v4, v5}, Lc0/A0;-><init>(I)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x34

    invoke-static {v5, v8}, LU/S;->e(IF)I

    move-result v14

    invoke-static {v5, v8}, LU/S;->e(IF)I

    move-result v5

    invoke-direct {v4, v14, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v4, LU/S;->t:LP0/l;

    if-eqz v4, :cond_f

    invoke-interface {v4, v0}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    new-instance v14, Landroid/widget/LinearLayout;

    invoke-direct {v14, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    invoke-virtual {v14, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0xe

    invoke-static {v5, v8}, LU/S;->e(IF)I

    move-result v0

    const/4 v4, 0x0

    invoke-virtual {v14, v0, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget-object v4, LU/S;->u:LP0/a;

    if-eqz v4, :cond_10

    invoke-interface {v4}, LP0/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_10

    goto :goto_13

    :cond_10
    const-string v4, "\u6211"

    :goto_13
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41980000    # 19.0f

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v4, 0x1

    invoke-static {v2, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    :try_start_0
    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_14

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_14
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v5, v0, LD0/f;

    if-eqz v5, :cond_11

    move-object v0, v2

    :cond_11
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v5, "OKK \u5feb\u6377\u9762\u677f"

    :try_start_1
    const-string v0, "home_drawer_signature"

    invoke-static {v0, v5}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_15
    move-object/from16 v27, v3

    goto :goto_16

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    goto :goto_15

    :goto_16
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_12

    move-object v0, v5

    :cond_12
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_17

    :cond_13
    move-object v5, v0

    :goto_17
    check-cast v5, Ljava/lang/String;

    if-eqz v2, :cond_14

    goto :goto_18

    :cond_14
    const-string v0, "\u70b9\u51fb\u7f16\u8f91\u7b7e\u540d \u00b7 "

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_18
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v2, :cond_15

    const-string v0, "true"

    invoke-static {v1, v0}, Lc0/h1;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    const-string v0, "\u7f16\u8f91\u4fa7\u680f\u7b7e\u540d"

    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    if-eqz v18, :cond_16

    const-string v0, "#9DA9B8"

    :goto_19
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    goto :goto_1a

    :cond_16
    const-string v0, "#6E7D70"

    goto :goto_19

    :goto_1a
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v0, 0x41400000    # 12.0f

    const/4 v1, 0x2

    invoke-virtual {v4, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v1, 0x7

    invoke-static {v1, v8}, LU/S;->e(IF)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v1, v2, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v4, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v4, v1}, Landroid/view/View;->setFocusable(Z)V

    new-instance v5, Ld0/j;

    move-object v1, v5

    const/16 v3, 0x12

    move-object/from16 v2, p0

    move-object/from16 v26, v27

    move-object v3, v4

    move-object v10, v4

    move/from16 v4, v18

    move-object v0, v5

    move v5, v11

    move-object/from16 v28, v6

    move/from16 v6, v20

    move/from16 v29, v7

    move/from16 v7, v21

    move/from16 v24, v11

    move v11, v8

    move v8, v12

    move-object/from16 v30, v9

    move/from16 v9, v25

    invoke-direct/range {v1 .. v9}, Ld0/j;-><init>(Landroid/app/Activity;Landroid/widget/TextView;ZIIIII)V

    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v14, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-direct {v0, v1, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v15, v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v14, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Landroid/widget/TextView;

    if-eqz v2, :cond_17

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    :cond_17
    move-object/from16 v0, v16

    new-instance v2, Ld0/k;

    invoke-direct {v2, v0, v1}, Ld0/k;-><init>(Landroid/widget/TextView;I)V

    invoke-virtual {v13, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v1, Ld0/k;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ld0/k;-><init>(Landroid/widget/TextView;I)V

    const-wide/16 v2, 0x190

    invoke-virtual {v13, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v1, Ld0/k;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Ld0/k;-><init>(Landroid/widget/TextView;I)V

    const-wide/16 v2, 0x4b0

    invoke-virtual {v13, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x1

    invoke-direct {v0, v14, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xc

    invoke-static {v1, v11}, LU/S;->e(IF)I

    move-result v2

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    invoke-static {v1, v11}, LU/S;->e(IF)I

    move-result v2

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/16 v8, 0x8

    invoke-static {v8, v11}, LU/S;->e(IF)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v13, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v15, Landroid/widget/ScrollView;

    move-object/from16 v7, p0

    invoke-direct {v15, v7}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    invoke-virtual {v15, v1}, Landroid/view/View;->setOverScrollMode(I)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x10

    invoke-static {v5, v11}, LU/S;->e(IF)I

    move-result v0

    const/16 v1, 0xe

    invoke-static {v1, v11}, LU/S;->e(IF)I

    move-result v1

    invoke-static {v5, v11}, LU/S;->e(IF)I

    move-result v2

    const/16 v3, 0x1c

    invoke-static {v3, v11}, LU/S;->e(IF)I

    move-result v4

    invoke-virtual {v6, v0, v1, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v0, Ld0/l;

    move-object v1, v0

    move-object/from16 v2, p0

    move/from16 v3, v18

    move/from16 v4, v24

    move v14, v5

    move/from16 v5, v20

    move-object/from16 v31, v6

    move/from16 v6, v21

    move-object v9, v7

    move v7, v12

    move v10, v8

    move/from16 v8, v25

    invoke-direct/range {v1 .. v8}, Ld0/l;-><init>(Landroid/app/Activity;ZIIIII)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v1, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v2, 0x4

    invoke-static {v2, v11}, LU/S;->i0(IF)I

    move-result v2

    const/16 v8, 0xa

    invoke-static {v8, v11}, LU/S;->i0(IF)I

    move-result v3

    const/4 v4, 0x2

    invoke-static {v4, v11}, LU/S;->i0(IF)I

    move-result v5

    invoke-static {v10, v11}, LU/S;->i0(IF)I

    move-result v6

    invoke-virtual {v1, v2, v3, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "\u5feb\u6377"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move/from16 v14, v20

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v3, 0x3d23d70a    # 0.04f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setLetterSpacing(F)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-direct {v3, v6, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v3, "\u270e"

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v3, "\u7f16\u8f91\u5feb\u6377"

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    const/16 v7, 0x11

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v3, 0x41500000    # 13.0f

    const/4 v4, 0x2

    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    move-result v6

    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    const/16 v10, 0x18

    invoke-static {v10, v5, v6, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setFocusable(Z)V

    new-instance v3, Ld0/f;

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v12}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {v12}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    const/16 v7, 0x28

    invoke-static {v7, v4, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-direct {v3, v4, v5, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v3, 0x1c

    invoke-static {v3, v11}, LU/S;->i0(IF)I

    move-result v4

    invoke-static {v3, v11}, LU/S;->i0(IF)I

    move-result v3

    invoke-direct {v0, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v10, v31

    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, LU/S;->M()Ljava/util/List;

    move-result-object v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v8}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/E0;

    new-instance v2, Ld0/m;

    iget-object v3, v1, Lc0/E0;->d:Ljava/lang/String;

    iget-object v4, v1, Lc0/E0;->b:Ljava/lang/String;

    iget-object v5, v1, Lc0/E0;->c:Ljava/lang/String;

    new-instance v6, Ld0/b;

    const/4 v8, 0x0

    invoke-direct {v6, v9, v1, v8}, Ld0/b;-><init>(Landroid/app/Activity;Lc0/E0;I)V

    invoke-direct {v2, v3, v4, v5, v6}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0xa

    goto :goto_1b

    :cond_18
    move-object v1, v10

    move-object/from16 v2, p0

    move/from16 v3, v21

    move/from16 v4, v24

    move v5, v14

    move v6, v11

    const/16 v8, 0x11

    invoke-static/range {v1 .. v7}, LU/S;->P(Landroid/widget/LinearLayout;Landroid/content/Context;IIIFLjava/util/List;)V

    const-string v0, "OKK"

    invoke-static {v10, v9, v0, v14, v11}, LU/S;->h0(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;IF)V

    :try_start_2
    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "virtual_location_enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1c

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1c
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v2, v0, LD0/f;

    if-eqz v2, :cond_19

    move-object v0, v1

    :cond_19
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :try_start_3
    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "bottom_tab_floating"

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1d

    :catchall_3
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_1a

    move-object v0, v2

    :cond_1a
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v2, Ld0/m;

    new-instance v3, Ld0/c;

    const/4 v4, 0x0

    invoke-direct {v3, v9, v4}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v4, "\u5168\u90e8\u529f\u80fd\u5f00\u5173 \u00b7 \u914d\u7f6e"

    const-string v5, "\u2699"

    const-string v6, "\u6a21\u5757\u8bbe\u7f6e"

    invoke-direct {v2, v5, v6, v4, v3}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    new-instance v3, Ld0/m;

    new-instance v4, Ld0/c;

    const/4 v5, 0x1

    invoke-direct {v4, v9, v5}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v5, "\u4e3b\u754c\u9762\u58c1\u7eb8 \u00b7 \u5b9e\u65f6\u900f\u660e\u5ea6"

    const-string v6, "\ud83c\udfa8"

    const-string v7, "\u4e3b\u9898"

    invoke-direct {v3, v6, v7, v5, v4}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    new-instance v4, Ld0/m;

    const-string v5, "\u672a\u5f00\u542f \u00b7 \u70b9\u8fdb\u914d\u7f6e"

    const-string v6, "\u5df2\u5f00\u542f \u00b7 \u70b9\u8fdb\u914d\u7f6e"

    if-eqz v1, :cond_1b

    move-object v1, v6

    goto :goto_1e

    :cond_1b
    move-object v1, v5

    :goto_1e
    new-instance v7, Ld0/c;

    const/4 v8, 0x2

    invoke-direct {v7, v9, v8}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v8, "\ud83d\udccd"

    move-object/from16 v23, v5

    const-string v5, "\u865a\u62df\u5b9a\u4f4d"

    invoke-direct {v4, v8, v5, v1, v7}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    new-instance v1, Ld0/m;

    if-eqz v0, :cond_1c

    move-object v5, v6

    goto :goto_1f

    :cond_1c
    move-object/from16 v5, v23

    :goto_1f
    new-instance v0, Ld0/c;

    const/4 v6, 0x3

    invoke-direct {v0, v9, v6}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v6, "\u25a2"

    const-string v7, "\u60ac\u6d6e\u5e95\u680f"

    invoke-direct {v1, v6, v7, v5, v0}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    filled-new-array {v2, v3, v4, v1}, [Ld0/m;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v1, v10

    move-object/from16 v2, p0

    move/from16 v3, v21

    move/from16 v4, v24

    move v5, v14

    move v6, v11

    invoke-static/range {v1 .. v7}, LU/S;->P(Landroid/widget/LinearLayout;Landroid/content/Context;IIIFLjava/util/List;)V

    const-string v0, "\u5176\u5b83"

    invoke-static {v10, v9, v0, v14, v11}, LU/S;->h0(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;IF)V

    new-instance v0, Ld0/m;

    new-instance v1, Ld0/c;

    const/16 v2, 0xb

    invoke-direct {v1, v9, v2}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v2, "Telegram \u7fa4"

    const-string v3, "\ud83d\udcac"

    const-string v4, "\u5e2e\u52a9\u4e0e\u53cd\u9988"

    invoke-direct {v0, v3, v4, v2, v1}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    new-instance v1, Ld0/m;

    new-instance v2, Ld0/c;

    const/16 v3, 0xc

    invoke-direct {v2, v9, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v3, "\u6a21\u5757\u8bbe\u7f6e \u00b7 \u5173\u4e8e\u9875"

    const-string v4, "\u2139"

    const-string v5, "\u5173\u4e8e"

    invoke-direct {v1, v4, v5, v3, v2}, Ld0/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/a;)V

    filled-new-array {v0, v1}, [Ld0/m;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v1, v10

    move-object/from16 v2, p0

    move/from16 v3, v21

    move/from16 v4, v24

    move v5, v14

    invoke-static/range {v1 .. v7}, LU/S;->P(Landroid/widget/LinearLayout;Landroid/content/Context;IIIFLjava/util/List;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "\u957f\u6309\u65e0 \u00b7 \u5de6\u6ed1\u5173\u95ed\u4fa7\u680f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v1, 0x41300000    # 11.0f

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v1, 0x12

    invoke-static {v1, v11}, LU/S;->e(IF)I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v2, v11}, LU/S;->e(IF)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v10, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v13, v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v12}, Landroid/view/View;->setBackgroundColor(I)V

    const v2, 0x3f59999a    # 0.85f

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, 0x3

    invoke-static {v3, v11}, LU/S;->e(IF)I

    move-result v3

    invoke-direct {v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v13, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v2, v29

    invoke-direct {v0, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v1, 0x800003

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v13, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    int-to-float v0, v2

    neg-float v0, v0

    invoke-virtual {v13, v0}, Landroid/view/View;->setTranslationX(F)V

    const/16 v1, 0xa

    int-to-float v0, v1

    mul-float/2addr v0, v11

    add-float v0, v0, v17

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {v13, v0}, Landroid/view/View;->setElevation(F)V

    new-instance v18, LQ0/k;

    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V

    new-instance v19, LQ0/j;

    invoke-direct/range {v19 .. v19}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld0/g;

    move-object/from16 v17, v0

    move/from16 v20, v2

    move-object/from16 v21, v26

    move/from16 v22, v11

    invoke-direct/range {v17 .. v22}, Ld0/g;-><init>(LQ0/k;LQ0/j;ILandroid/view/View;F)V

    invoke-virtual {v13, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    move-object/from16 v3, v26

    move-object/from16 v1, v28

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v4, v30

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    new-instance v0, Ld0/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    sput-object v1, LU/S;->p:Landroid/widget/FrameLayout;

    sput-object v13, LU/S;->q:Landroid/widget/LinearLayout;

    sput-object v3, LU/S;->r:Landroid/view/View;

    new-instance v0, Ld0/n;

    invoke-direct {v0, v13, v3, v2}, Ld0/n;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;I)V

    return-object v0
.end method

.method public static d0(Landroid/content/Context;)Lb0/s;
    .locals 13

    const-string v0, "context"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb0/s;->h:Lb0/s;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.tencent.mm"

    invoke-static {v1, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    if-nez v1, :cond_2

    move-object v10, v2

    goto :goto_1

    :cond_2
    move-object v10, v1

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt v3, v5, :cond_3

    invoke-static {}, LE/d;->b()Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v3

    invoke-static {v0, v10, v3}, LE/d;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v10, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_3
    instance-of v3, v0, LD0/f;

    if-eqz v3, :cond_4

    move-object v0, v4

    :cond_4
    check-cast v0, Landroid/content/pm/PackageInfo;

    if-eqz v0, :cond_5

    iget-object v3, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-static {v3}, LW0/j;->a1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_5
    move-object v3, v4

    :goto_4
    const-string v5, ""

    if-nez v3, :cond_6

    move-object v3, v5

    :cond_6
    invoke-static {v3}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v3, "unknown"

    :cond_7
    move-object v6, v3

    const-wide/16 v7, 0x0

    if-eqz v0, :cond_9

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x1c

    if-lt v3, v9, :cond_8

    invoke-static {v0}, LB/c;->d(Landroid/content/pm/PackageInfo;)J

    move-result-wide v11

    goto :goto_5

    :cond_8
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    int-to-long v11, v0

    goto :goto_5

    :cond_9
    move-wide v11, v7

    :goto_5
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_a

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-static {p0}, LD/v;->e(Landroid/content/pm/PackageManager;)Landroid/content/pm/InstallSourceInfo;

    move-result-object p0

    invoke-static {p0}, Lq0/b;->a(Landroid/content/pm/InstallSourceInfo;)Ljava/lang/String;

    move-result-object p0

    goto :goto_7

    :catchall_1
    move-exception p0

    goto :goto_6

    :cond_a
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :goto_6
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_7
    instance-of v0, p0, LD0/f;

    if-eqz v0, :cond_b

    goto :goto_8

    :cond_b
    move-object v4, p0

    :goto_8
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_c

    goto :goto_9

    :cond_c
    move-object v5, v4

    :goto_9
    const-string p0, "com.android.vending"

    const/4 v0, 0x1

    invoke-static {v5, p0, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    sget-object v2, Lb0/r;->b:Lb0/r;

    if-nez p0, :cond_e

    const-string p0, "google"

    invoke-static {v5, p0, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_d

    goto :goto_a

    :cond_d
    const-string p0, "8.0."

    invoke-static {v6, p0, v1}, LW0/r;->H0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_f

    cmp-long p0, v11, v7

    if-lez p0, :cond_e

    const/16 p0, 0xa

    int-to-long v0, p0

    rem-long v0, v11, v0

    cmp-long p0, v0, v7

    if-nez p0, :cond_e

    sget-object v2, Lb0/r;->a:Lb0/r;

    :cond_e
    :goto_a
    move-object v9, v2

    goto :goto_b

    :cond_f
    sget-object p0, Lb0/r;->c:Lb0/r;

    move-object v9, p0

    :goto_b
    new-instance p0, Lb0/s;

    move-object v5, p0

    move-wide v7, v11

    invoke-direct/range {v5 .. v10}, Lb0/s;-><init>(Ljava/lang/String;JLb0/r;Ljava/lang/String;)V

    sput-object p0, Lb0/s;->h:Lb0/s;

    invoke-virtual {p0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "resolved "

    invoke-static {v1, v0}, LS/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "[OKK-WxVer] "

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lde/robv/android/xposed/d;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_c
    return-object p0
.end method

.method public static final e(IF)I
    .locals 0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static e0(Landroid/content/Context;Lf0/b;Ljava/lang/ClassLoader;Ljava/lang/String;)Lb0/a;
    .locals 9

    const-string v0, "context"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classLoader"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object v0

    invoke-static {p0, v0, p3}, LU/S;->u(Landroid/content/Context;Lb0/s;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v1, Lb0/k;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "probe start fp="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " needDialog="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " total="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LU/S;->x0(Ljava/lang/String;)V

    sget-object v8, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\u9002\u914d\u68c0\u67e5\u5f00\u59cb \u00b7 \u5171 "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " \u9879 \u00b7 fp="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    sget-boolean v4, LU/S;->j:Z

    const/4 v5, 0x0

    if-nez v4, :cond_1

    new-instance v1, Lb0/d;

    invoke-direct {v1, p0, p1, p2, p3}, Lb0/d;-><init>(Landroid/content/Context;Lf0/b;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    invoke-static {p0, p2, p3, v1}, Lb0/c;->f(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;LP0/l;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    const-string v1, "DexKit unavailable, class-only probes"

    invoke-static {v1}, LU/S;->x0(Ljava/lang/String;)V

    new-instance v1, Lb0/l;

    invoke-direct {v1, p2, v5, p0, p3}, Lb0/l;-><init>(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v1, p1}, LU/S;->f0(Lb0/l;Lf0/b;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_0
    invoke-static {v0, v1}, LU/S;->T(Lb0/s;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance p0, Lb0/a;

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lb0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Z)V

    invoke-static {p0}, LU/S;->g0(Lb0/a;)V

    const/4 p1, 0x1

    sput-boolean p1, LU/S;->j:Z

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "probe done "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LU/S;->x0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "\u9002\u914d\u68c0\u67e5\u5b8c\u6210 \u00b7 "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    return-object p0

    :cond_1
    const-string v4, "re-scan: using cached probe results (bridge unavailable after first use)"

    invoke-static {v4}, LU/S;->x0(Ljava/lang/String;)V

    const-string v4, "\u9002\u914d\u590d\u68c0 \u00b7 \u8df3\u8fc7 DexKit bridge\uff0c\u590d\u7528\u9996\u6b21\u626b\u63cf\u7f13\u5b58"

    invoke-virtual {v8, v4}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    invoke-static {}, LU/S;->L()Lb0/a;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v1, p2, 0x1

    if-ltz p2, :cond_2

    check-cast p3, Lb0/f;

    invoke-static {p3, p2}, Lb0/k;->a(Lb0/f;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p1, p3, v6, p2}, Lf0/b;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    const-wide/16 p2, 0xf

    :try_start_0
    invoke-static {p2, p3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move p2, v1

    goto :goto_0

    :cond_2
    invoke-static {}, LE0/m;->j0()V

    throw v5

    :cond_3
    new-instance p0, Lb0/a;

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-object v6, v4, Lb0/a;->d:Ljava/util/List;

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v1 .. v7}, Lb0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Z)V

    invoke-static {p0}, LU/S;->g0(Lb0/a;)V

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "re-scan done (cached) "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LU/S;->x0(Ljava/lang/String;)V

    sget-object p1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "\u9002\u914d\u590d\u68c0\u5b8c\u6210\uff08\u590d\u7528\u7f13\u5b58\uff09 \u00b7 "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    return-object p0

    :cond_4
    const-string v1, "re-scan but no cached report, doing full scan without bridge"

    invoke-static {v1}, LU/S;->x0(Ljava/lang/String;)V

    :try_start_1
    new-instance v1, Lb0/l;

    invoke-direct {v1, p2, v5, p0, p3}, Lb0/l;-><init>(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v1, p1}, LU/S;->f0(Lb0/l;Lf0/b;)Ljava/util/ArrayList;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_1
    sget-object p1, LE0/u;->a:LE0/u;

    instance-of p2, p0, LD0/f;

    if-eqz p2, :cond_5

    move-object p0, p1

    :cond_5
    check-cast p0, Ljava/util/List;

    invoke-static {v0, p0}, LU/S;->T(Lb0/s;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance p0, Lb0/a;

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lb0/a;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Z)V

    invoke-static {p0}, LU/S;->g0(Lb0/a;)V

    return-object p0
.end method

.method public static final f(Landroid/widget/TextView;)V
    .locals 2

    sget-object v0, LU/S;->u:LP0/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    const-string v0, "\u6211"

    :cond_2
    if-eqz p0, :cond_3

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public static f0(Lb0/l;Lf0/b;)Ljava/util/ArrayList;
    .locals 10

    sget-object v0, Lb0/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    const/4 v6, 0x0

    if-ltz v3, :cond_4

    check-cast v4, Lb0/f;

    invoke-static {v4, v3}, Lb0/k;->a(Lb0/f;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1, v7, v8, v3}, Lf0/b;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v4, p0}, Lb0/f;->a(Lb0/l;)Lb0/n;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v4

    :goto_1
    invoke-static {v4}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    const-string v8, "?"

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    new-instance v4, Lb0/n;

    sget-object v9, Lb0/m;->c:Lb0/m;

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, "error"

    :cond_1
    invoke-direct {v4, v8, v3, v9, v7}, Lb0/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lb0/m;Ljava/lang/String;)V

    :goto_2
    check-cast v4, Lb0/n;

    iget-object v7, v4, Lb0/n;->b:Ljava/lang/String;

    invoke-static {v7}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_2
    const/16 v7, 0xd

    invoke-static {v4, v3, v6, v6, v7}, Lb0/n;->a(Lb0/n;Ljava/lang/String;Lb0/m;Ljava/lang/String;I)Lb0/n;

    move-result-object v4

    :cond_3
    const-string v3, "${fixed.level} ${fixed.id} ${fixed.detail}"

    invoke-static {v3}, LU/S;->x0(Ljava/lang/String;)V

    sget-object v3, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    const-string v6, "\u9002\u914d ${i + 1}/$total ${fixed.title}: ${fixed.level.name} \u00b7 ${fixed.detail}"

    invoke-virtual {v3, v6}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide/16 v3, 0x28

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move v3, v5

    goto :goto_0

    :cond_4
    invoke-static {}, LE0/m;->j0()V

    throw v6

    :cond_5
    return-object v2
.end method

.method public static final varargs g(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, p2, v4

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array v2, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Class;

    invoke-static {v0, p1, v1}, LU/S;->t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    :try_start_0
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, LD0/d;

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p0

    const-string p2, "getTargetException(...)"

    invoke-static {p0, p2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "receiver == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g0(Lb0/a;)V
    .locals 7

    const-string v0, "/sdcard/Android/media/com.tencent.mm/OKK"

    sput-object p0, LU/S;->g:Lb0/a;

    iget-boolean v1, p0, Lb0/a;->e:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lb0/a;->a:Ljava/lang/String;

    invoke-static {v1}, LU/S;->S(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    sput-boolean v1, LU/S;->h:Z

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iget-object v2, p0, Lb0/a;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb0/n;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "id"

    iget-object v6, v3, Lb0/n;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "title"

    iget-object v6, v3, Lb0/n;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "level"

    iget-object v6, v3, Lb0/n;->c:Lb0/m;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "detail"

    iget-object v3, v3, Lb0/n;->d:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "fingerprint"

    iget-object v4, p0, Lb0/a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "wechat"

    iget-object v4, p0, Lb0/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "atMs"

    iget-wide v4, p0, Lb0/a;->c:J

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "summary"

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "results"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "pendingDialog"

    sget-boolean v3, LU/S;->h:Z

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v0, "compat_report.json"

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, LN0/k;->k0(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb0/a;->e()Ljava/lang/String;

    sget-object p0, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p0

    :goto_4
    invoke-static {p0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_3
    return-void
.end method

.method public static h0(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;IF)V
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x2

    const/high16 p2, 0x41400000    # 12.0f

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/4 p1, 0x4

    int-to-float p1, p1

    mul-float/2addr p1, p4

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    const/16 p3, 0xa

    int-to-float p3, p3

    mul-float/2addr p3, p4

    add-float/2addr p3, p2

    float-to-int p3, p3

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v1, p4

    add-float/2addr v1, p2

    float-to-int p2, v1

    invoke-virtual {v0, p1, p3, p1, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    const p1, 0x3d23d70a    # 0.04f

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLetterSpacing(F)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static i(I)V
    .locals 5

    const/4 v0, 0x2

    if-gt v0, p0, :cond_0

    const/16 v1, 0x25

    if-ge p0, v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "radix "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " was not in valid range "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, LT0/c;

    const/4 v3, 0x1

    const/16 v4, 0x24

    invoke-direct {p0, v0, v4, v3}, LT0/a;-><init>(III)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final i0(IF)I
    .locals 0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static j(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I
    .locals 0

    invoke-virtual {p4}, LU/C;->r()I

    move-result p4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, LU/L;->a()I

    move-result p0

    if-eqz p0, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    invoke-static {p2}, LU/C;->D(Landroid/view/View;)I

    move-result p0

    invoke-static {p3}, LU/C;->D(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p1, p3}, LU/u;->b(Landroid/view/View;)I

    move-result p0

    invoke-virtual {p1, p2}, LU/u;->e(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p0, p2

    invoke-virtual {p1}, LU/u;->l()I

    move-result p1

    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final j0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p2}, LU/S;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static k(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;ZZ)I
    .locals 3

    invoke-virtual {p4}, LU/C;->r()I

    move-result p4

    const/4 v0, 0x0

    if-eqz p4, :cond_3

    invoke-virtual {p0}, LU/L;->a()I

    move-result p4

    if-eqz p4, :cond_3

    if-eqz p2, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p2}, LU/C;->D(Landroid/view/View;)I

    move-result p4

    invoke-static {p3}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    invoke-static {p4, v1}, Ljava/lang/Math;->min(II)I

    move-result p4

    invoke-static {p2}, LU/C;->D(Landroid/view/View;)I

    move-result v1

    invoke-static {p3}, LU/C;->D(Landroid/view/View;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz p6, :cond_1

    invoke-virtual {p0}, LU/L;->a()I

    move-result p0

    sub-int/2addr p0, v1

    add-int/lit8 p0, p0, -0x1

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_0

    :cond_1
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p0

    :goto_0
    if-nez p5, :cond_2

    return p0

    :cond_2
    invoke-virtual {p1, p3}, LU/u;->b(Landroid/view/View;)I

    move-result p4

    invoke-virtual {p1, p2}, LU/u;->e(Landroid/view/View;)I

    move-result p5

    sub-int/2addr p4, p5

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p4

    invoke-static {p2}, LU/C;->D(Landroid/view/View;)I

    move-result p5

    invoke-static {p3}, LU/C;->D(Landroid/view/View;)I

    move-result p3

    sub-int/2addr p5, p3

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    int-to-float p4, p4

    int-to-float p3, p3

    div-float/2addr p4, p3

    int-to-float p0, p0

    mul-float/2addr p0, p4

    invoke-virtual {p1}, LU/u;->k()I

    move-result p3

    invoke-virtual {p1, p2}, LU/u;->e(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p3, p1

    int-to-float p1, p3

    add-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static l(LU/L;LU/u;Landroid/view/View;Landroid/view/View;LU/C;Z)I
    .locals 0

    invoke-virtual {p4}, LU/C;->r()I

    move-result p4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, LU/L;->a()I

    move-result p4

    if-eqz p4, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    invoke-virtual {p0}, LU/L;->a()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p1, p3}, LU/u;->b(Landroid/view/View;)I

    move-result p4

    invoke-virtual {p1, p2}, LU/u;->e(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p4, p1

    invoke-static {p2}, LU/C;->D(Landroid/view/View;)I

    move-result p1

    invoke-static {p3}, LU/C;->D(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    int-to-float p2, p4

    int-to-float p1, p1

    div-float/2addr p2, p1

    invoke-virtual {p0}, LU/L;->a()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p2, p0

    float-to-int p0, p2

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static m(Landroid/content/Context;)Landroidx/emoji2/text/r;
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/emoji2/text/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lx0/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "Package manager required to locate emoji font provider"

    invoke-static {v1, v2}, LA0/p;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v4, :cond_1

    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v6, :cond_1

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_1

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_3

    :goto_2
    move-object v1, v5

    goto :goto_4

    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lx0/e;->d(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v0

    :goto_3
    if-ge v3, v6, :cond_4

    aget-object v7, v0, v3

    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LA/f;

    const-string v3, "emojicompat-emoji-font"

    invoke-direct {v1, v2, v4, v3, v0}, LA/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    const-string v1, "emoji2.text.DefaultEmojiConfig"

    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :goto_4
    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v5, Landroidx/emoji2/text/r;

    new-instance v0, Landroidx/emoji2/text/q;

    invoke-direct {v0, p0, v1}, Landroidx/emoji2/text/q;-><init>(Landroid/content/Context;LA/f;)V

    invoke-direct {v5, v0}, Landroidx/emoji2/text/r;-><init>(Landroidx/emoji2/text/i;)V

    :goto_5
    return-object v5
.end method

.method public static m0(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/16 v0, 0x2710

    const/4 v1, 0x0

    if-eq p0, v0, :cond_3

    const/16 v0, 0x2712

    if-eq p0, v0, :cond_3

    const v0, 0x37000031

    if-eq p0, v0, :cond_3

    const v0, 0x13000031

    if-eq p0, v0, :cond_3

    invoke-static {p1}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "<sysmsg"

    invoke-static {p1, p0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "revokemsg"

    invoke-static {p1, p0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "patmsg"

    invoke-static {p1, p0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "sysmsgtemplate"

    invoke-static {p1, p0, v1}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    return v1

    :cond_2
    :goto_0
    invoke-static {p1}, LU/S;->I(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_3

    invoke-static {p2}, LU/S;->I(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public static n(Z)V
    .locals 11

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget-object v3, LU/S;->p:Landroid/widget/FrameLayout;

    if-nez v3, :cond_0

    return-void

    :cond_0
    sget-object v4, LU/S;->q:Landroid/widget/LinearLayout;

    sget-object v5, LU/S;->r:Landroid/view/View;

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    if-lez v7, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v6

    :goto_0
    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    if-eqz v7, :cond_3

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    :cond_3
    move v7, v2

    :goto_1
    if-eqz p0, :cond_5

    if-eqz v4, :cond_5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    sput-boolean v1, LU/S;->s:Z

    invoke-virtual {v4, v0, v6}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    new-instance p0, Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    invoke-virtual {v4}, Landroid/view/View;->getTranslationX()F

    move-result v8

    int-to-float v7, v7

    neg-float v7, v7

    new-array v9, v0, [F

    aput v8, v9, v2

    aput v7, v9, v1

    invoke-static {v4, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    sget-object v7, Landroid/view/View;->ALPHA:Landroid/util/Property;

    invoke-virtual {v5}, Landroid/view/View;->getAlpha()F

    move-result v8

    const/4 v9, 0x0

    new-array v10, v0, [F

    aput v8, v10, v2

    aput v9, v10, v1

    invoke-static {v5, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    new-array v0, v0, [Landroid/animation/Animator;

    aput-object v6, v0, v2

    aput-object v7, v0, v1

    invoke-virtual {p0, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0xb4

    invoke-virtual {p0, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3e19999a    # 0.15f

    const v2, 0x3e99999a    # 0.3f

    const v6, 0x3f4ccccd    # 0.8f

    invoke-direct {v0, v2, v9, v6, v1}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {p0, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, LU/d;

    invoke-direct {v0, v5, v3, v4}, LU/d;-><init>(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_5
    :goto_2
    invoke-static {v5, v3, v4}, LU/S;->o(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V

    return-void
.end method

.method public static n0(Landroid/app/Activity;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v3, "activity"

    invoke-static {p0, v3}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    sget-boolean v3, LU/S;->s:Z

    if-eqz v3, :cond_1

    return-void

    :cond_1
    invoke-static {}, LU/S;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    return-void

    :cond_2
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {p0}, LU/S;->d(Landroid/app/Activity;)Ld0/n;

    move-result-object p0

    if-nez p0, :cond_3

    return-void

    :cond_3
    iget-object v3, p0, Ld0/n;->a:Landroid/view/View;

    iget-object v4, p0, Ld0/n;->b:Landroid/view/View;

    iget p0, p0, Ld0/n;->c:I

    sput-boolean v2, LU/S;->s:Z

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    int-to-float p0, p0

    neg-float p0, p0

    const/4 v7, 0x0

    new-array v8, v1, [F

    aput p0, v8, v0

    aput v7, v8, v2

    invoke-static {v3, v6, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    sget-object v6, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v7, v1, [F

    fill-array-data v7, :array_0

    invoke-static {v4, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v1, v1, [Landroid/animation/Animator;

    aput-object p0, v1, v0

    aput-object v4, v1, v2

    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x118

    invoke-virtual {v5, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance p0, Landroid/view/animation/PathInterpolator;

    const v0, 0x3d4ccccd    # 0.05f

    const v1, 0x3f333333    # 0.7f

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v4, v6}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    invoke-virtual {v5, p0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p0, Ld0/p;

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct {p0, v3, v2}, Ld0/p;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v5, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3ed70a3d    # 0.42f
    .end array-data
.end method

.method public static final o(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;)V
    .locals 1

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_1
    :goto_2
    const/4 p0, 0x0

    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    goto :goto_3

    :catchall_1
    move-exception p2

    goto :goto_4

    :cond_2
    move-object p2, p0

    :goto_3
    if-eqz p2, :cond_3

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :goto_4
    invoke-static {p2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_3
    :goto_5
    sget-object p2, LU/S;->p:Landroid/widget/FrameLayout;

    if-ne p2, p1, :cond_4

    sput-object p0, LU/S;->p:Landroid/widget/FrameLayout;

    sput-object p0, LU/S;->q:Landroid/widget/LinearLayout;

    sput-object p0, LU/S;->r:Landroid/view/View;

    :cond_4
    const/4 p0, 0x0

    sput-boolean p0, LU/S;->s:Z

    return-void
.end method

.method public static final o0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;
    .locals 3

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p0, 0x11

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    const/4 p0, 0x2

    const/high16 p5, 0x41600000    # 14.0f

    invoke-virtual {v0, p0, p5}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 p0, 0x12

    invoke-static {p0, p2}, LU/S;->p0(IF)I

    move-result p5

    const/16 v1, 0xa

    invoke-static {v1, p2}, LU/S;->p0(IF)I

    move-result v2

    invoke-static {p0, p2}, LU/S;->p0(IF)I

    move-result p0

    invoke-static {v1, p2}, LU/S;->p0(IF)I

    move-result v1

    invoke-virtual {v0, p5, v2, p0, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 p5, 0x0

    invoke-virtual {p0, p5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 p5, 0xc

    invoke-static {p5, p2}, LU/S;->p0(IF)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz p6, :cond_0

    invoke-virtual {p0, p3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_2

    :cond_0
    if-eqz p4, :cond_1

    const-string p2, "#22FFFFFF"

    :goto_0
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    goto :goto_1

    :cond_1
    const-string p2, "#0F000000"

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :goto_2
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p6, :cond_2

    const/4 p1, -0x1

    :cond_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setFocusable(Z)V

    new-instance p0, Ld0/f;

    const/4 p1, 0x2

    invoke-direct {p0, p7, p1}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static final p(CCZ)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p2, :cond_1

    return v1

    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    if-eq p0, p1, :cond_3

    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p0

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    if-ne p0, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    return v0
.end method

.method public static final p0(IF)I
    .locals 0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static final varargs q(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lx0/e;
    .locals 10

    const-string v0, "clazz"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterTypesAndCallback"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    array-length v0, p2

    sub-int/2addr v0, v1

    aget-object v0, p2, v0

    :goto_0
    instance-of v3, v0, Lde/robv/android/xposed/c;

    if-eqz v3, :cond_1

    check-cast v0, Lde/robv/android/xposed/c;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_d

    array-length v3, p2

    sub-int/2addr v3, v1

    const/4 v4, 0x0

    if-gez v3, :cond_2

    move v3, v4

    :cond_2
    if-ltz v3, :cond_c

    if-nez v3, :cond_3

    sget-object p2, LE0/u;->a:LE0/u;

    goto :goto_4

    :cond_3
    array-length v5, p2

    if-lt v3, v5, :cond_4

    invoke-static {p2}, LE0/j;->q0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    goto :goto_4

    :cond_4
    if-ne v3, v1, :cond_5

    aget-object p2, p2, v4

    invoke-static {p2}, LA0/p;->F(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    goto :goto_4

    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v6, p2

    move v7, v4

    move v8, v7

    :goto_2
    if-ge v7, v6, :cond_7

    aget-object v9, p2, v7

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v8, v1

    if-ne v8, v3, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    move-object p2, v5

    :goto_4
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p2, v3}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    if-nez v3, :cond_8

    move-object v3, v2

    goto :goto_6

    :cond_8
    instance-of v6, v3, Ljava/lang/Class;

    if-eqz v6, :cond_9

    check-cast v3, Ljava/lang/Class;

    goto :goto_6

    :cond_9
    instance-of v6, v3, Ljava/lang/String;

    if-eqz v6, :cond_a

    check-cast v3, Ljava/lang/String;

    invoke-static {v5, v3}, LU/S;->r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    :goto_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unsupported parameter type spec: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-array p2, v4, [Ljava/lang/Class;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    invoke-static {p0, p1, p2}, LU/S;->t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-static {p0, v0}, Lde/robv/android/xposed/d;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/c;)Lx0/e;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Requested element count "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is less than zero."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "no XC_MethodHook callback supplied"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final q0(IIIZFLandroid/widget/LinearLayout;Z)V
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/16 v1, 0xe

    invoke-static {v1, p4}, LU/S;->p0(IF)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 p2, 0x1

    if-eqz p6, :cond_0

    invoke-static {p2, p4}, LU/S;->p0(IF)I

    move-result p4

    invoke-virtual {v0, p4, p0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto :goto_2

    :cond_0
    invoke-static {p2, p4}, LU/S;->p0(IF)I

    move-result p4

    if-eqz p3, :cond_1

    const-string v1, "#22FFFFFF"

    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_1
    const-string v1, "#0F000000"

    goto :goto_0

    :goto_1
    invoke-virtual {v0, p4, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :goto_2
    invoke-virtual {p5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string p4, "check"

    invoke-virtual {p5, p4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    if-eqz p4, :cond_3

    if-eqz p6, :cond_2

    const-string p5, "\u2713"

    goto :goto_3

    :cond_2
    const-string p5, ""

    :goto_3
    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    if-eqz p4, :cond_5

    if-eqz p6, :cond_4

    move p1, p0

    :cond_4
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_5
    if-eqz p4, :cond_8

    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    if-eqz p6, :cond_6

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result p2

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result p3

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    const/16 p5, 0x1c

    invoke-static {p5, p2, p3, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_6

    :cond_6
    if-eqz p3, :cond_7

    const-string p0, "#18FFFFFF"

    :goto_4
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p0

    goto :goto_5

    :cond_7
    const-string p0, "#0A000000"

    goto :goto_4

    :goto_5
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :goto_6
    invoke-virtual {p4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_8
    return-void
.end method

.method public static final r(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    const-string v0, "className"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    :try_start_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :goto_1
    new-instance p1, LD0/d;

    invoke-direct {p1, p0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final r0(Landroid/app/Activity;IFIZLjava/lang/String;ZLP0/a;)Landroid/widget/TextView;
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p0, 0x11

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setGravity(I)V

    const/4 p0, 0x2

    const/high16 p5, 0x41600000    # 14.0f

    invoke-virtual {v0, p0, p5}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 p0, 0x12

    invoke-static {p0, p2}, LU/S;->s0(IF)I

    move-result p5

    const/16 v1, 0xa

    invoke-static {v1, p2}, LU/S;->s0(IF)I

    move-result v2

    invoke-static {p0, p2}, LU/S;->s0(IF)I

    move-result p0

    invoke-static {v1, p2}, LU/S;->s0(IF)I

    move-result v3

    invoke-virtual {v0, p5, v2, p0, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    if-eqz p6, :cond_0

    const/4 p1, -0x1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-static {v1, p2}, LU/S;->s0(IF)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz p6, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p4, :cond_2

    const-string p1, "#22FFFFFF"

    :goto_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    goto :goto_1

    :cond_2
    const-string p1, "#10000000"

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    new-instance p0, Ld0/f;

    const/4 p1, 0x1

    invoke-direct {p0, p7, p1}, Ld0/f;-><init>(LP0/a;I)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public static final s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    const-string v0, "fieldName"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NoSuchFieldError;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "#"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s0(IF)I
    .locals 0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 11

    const/4 v0, 0x0

    move-object v1, p0

    :goto_0
    const/4 v2, 0x1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3}, LQ0/q;->c([Ljava/lang/Object;)LE0/c;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-virtual {v3}, LE0/c;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v3}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    array-length v6, p2

    if-eq v5, v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getParameterTypes(...)"

    invoke-static {v5, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, LT0/c;

    array-length v8, v5

    sub-int/2addr v8, v2

    const/4 v9, 0x0

    invoke-direct {v7, v9, v8, v2}, LT0/a;-><init>(III)V

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_3

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_3

    :cond_2
    move v5, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, LT0/a;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    move-object v8, v7

    check-cast v8, LT0/b;

    iget-boolean v8, v8, LT0/b;->c:Z

    if-eqz v8, :cond_2

    move-object v8, v7

    check-cast v8, LT0/b;

    invoke-virtual {v8}, LT0/b;->a()I

    move-result v8

    aget-object v10, p2, v8

    if-nez v10, :cond_6

    aget-object v8, v5, v8

    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    move-result v8

    if-nez v8, :cond_5

    move v8, v2

    goto :goto_2

    :cond_5
    move v8, v9

    goto :goto_2

    :cond_6
    aget-object v8, v5, v8

    invoke-static {v8}, LU/S;->v0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v8

    invoke-static {v10}, LU/S;->v0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    :goto_2
    if-nez v8, :cond_4

    move v5, v9

    :goto_3
    if-eqz v5, :cond_7

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object v4

    :cond_7
    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5, v6}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, LT0/c;

    array-length v7, v5

    sub-int/2addr v7, v2

    invoke-direct {v6, v9, v7, v2}, LT0/a;-><init>(III)V

    instance-of v7, v6, Ljava/util/Collection;

    if-eqz v7, :cond_9

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    move v9, v2

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, LT0/a;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    :goto_4
    move-object v7, v6

    check-cast v7, LT0/b;

    iget-boolean v7, v7, LT0/b;->c:Z

    if-eqz v7, :cond_8

    move-object v7, v6

    check-cast v7, LT0/b;

    invoke-virtual {v7}, LT0/b;->a()I

    move-result v7

    aget-object v8, p2, v7

    if-eqz v8, :cond_a

    aget-object v8, v5, v7

    invoke-static {v8}, LU/S;->v0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v8

    aget-object v7, p2, v7

    invoke-static {v7}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v7}, LU/S;->v0(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_4

    :cond_b
    :goto_5
    if-eqz v9, :cond_0

    move-object v0, v4

    goto/16 :goto_1

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto/16 :goto_0

    :cond_d
    if-eqz v0, :cond_e

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-object v0

    :cond_e
    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    array-length p2, p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "#"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static t0(Landroid/view/ViewGroup;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LY/w;->b(Landroid/view/ViewGroup;Z)V

    goto :goto_0

    :cond_0
    sget-boolean v0, LU/S;->c:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p0, p1}, LY/w;->b(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    sput-boolean p0, LU/S;->c:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static u(Landroid/content/Context;Lb0/s;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "context"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "com.tencent.mm"

    invoke-static {p0, v0}, LU/S;->X(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "apk_"

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {p2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    if-eqz p2, :cond_1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-static {p2}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object p2

    goto :goto_3

    :cond_2
    move-object p2, v2

    :goto_3
    instance-of v1, p2, LD0/f;

    if-eqz v1, :cond_3

    goto :goto_4

    :cond_3
    move-object v2, p2

    :goto_4
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-static {v2}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    const-string p2, "com.abc.module"

    invoke-static {p0, p2}, LU/S;->X(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p1, Lb0/s;->b:J

    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, "|"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lb0/s;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|1.2.1|wx="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|mod="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static u0(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p0, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LU/S;->H()Z

    invoke-static {}, LU/S;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    invoke-static {p0}, LU/S;->n(Z)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LU/S;->n0(Landroid/app/Activity;)V

    :goto_0
    return-void
.end method

.method public static v(Ljava/lang/String;Lc0/K0;)Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p1

    const-string v1, "template"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget v1, v0, Lc0/K0;->b:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, LD0/e;

    const-string v5, "totalMsg"

    invoke-direct {v4, v5, v3}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v3, v0, Lc0/K0;->c:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LD0/e;

    const-string v7, "textMsg"

    invoke-direct {v6, v7, v5}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v5, v0, Lc0/K0;->d:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, LD0/e;

    const-string v9, "textWord"

    invoke-direct {v8, v9, v7}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v7, v0, Lc0/K0;->e:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, LD0/e;

    const-string v11, "emojiMsg"

    invoke-direct {v10, v11, v9}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v9, v0, Lc0/K0;->f:I

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    new-instance v12, LD0/e;

    const-string v13, "transferMsg"

    invoke-direct {v12, v13, v11}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v11, v0, Lc0/K0;->g:I

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    new-instance v14, LD0/e;

    const-string v15, "redBagMsg"

    invoke-direct {v14, v15, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, v0, Lc0/K0;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    new-instance v15, LD0/e;

    const-string v2, "fileMsg"

    invoke-direct {v15, v2, v13}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v13, LD0/e;

    move-object/from16 p1, v15

    const-string v15, "tatalmsg"

    invoke-direct {v13, v15, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v15, LD0/e;

    move-object/from16 v16, v13

    const-string v13, "totalmsg"

    invoke-direct {v15, v13, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v13, LD0/e;

    const-string v2, "totmsg"

    invoke-direct {v13, v2, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LD0/e;

    const-string v3, "textmsg"

    invoke-direct {v2, v3, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LD0/e;

    move-object/from16 v17, v2

    const-string v2, "textword"

    invoke-direct {v3, v2, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LD0/e;

    move-object/from16 v18, v3

    const-string v3, "emojimsg"

    invoke-direct {v2, v3, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LD0/e;

    const-string v7, "emoji"

    invoke-direct {v3, v7, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v7, LD0/e;

    move-object/from16 v19, v3

    const-string v3, "transfermsg"

    invoke-direct {v7, v3, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, LD0/e;

    const-string v9, "transfer"

    invoke-direct {v3, v9, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v9, LD0/e;

    move-object/from16 v20, v7

    const-string v7, "redbagmsg"

    invoke-direct {v9, v7, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v11, LD0/e;

    const-string v7, "redbag"

    invoke-direct {v11, v7, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LD0/e;

    const-string v7, "filemsg"

    invoke-direct {v1, v7, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v7, LD0/e;

    const-string v5, "word"

    invoke-direct {v7, v5, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v23, v7

    move-object/from16 v0, v20

    move-object v7, v10

    move-object v8, v12

    move-object/from16 v20, v9

    move-object v9, v14

    move-object/from16 v10, p1

    move-object/from16 v21, v11

    move-object/from16 v11, v16

    move-object v12, v15

    move-object/from16 v14, v17

    move-object/from16 v15, v18

    move-object/from16 v16, v2

    move-object/from16 v17, v19

    move-object/from16 v18, v0

    move-object/from16 v19, v3

    move-object/from16 v22, v1

    filled-new-array/range {v4 .. v23}, [LD0/e;

    move-result-object v0

    invoke-static {v0}, LE0/x;->h0([LD0/e;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v1, p0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "${"

    const-string v5, "}"

    invoke-static {v4, v3, v5}, LS/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v1, v3, v2, v4}, LW0/r;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static v0(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-class p0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-class p0, Ljava/lang/Byte;

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-class p0, Ljava/lang/Character;

    goto :goto_0

    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-class p0, Ljava/lang/Short;

    goto :goto_0

    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-class p0, Ljava/lang/Integer;

    goto :goto_0

    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-class p0, Ljava/lang/Long;

    goto :goto_0

    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-class p0, Ljava/lang/Float;

    goto :goto_0

    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-class p0, Ljava/lang/Double;

    goto :goto_0

    :cond_8
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-class p0, Ljava/lang/Void;

    :cond_9
    :goto_0
    return-object p0
.end method

.method public static w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {}, Lg/v0;->c()Lg/v0;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lg/v0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static w0(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    long-to-int p1, p1

    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    :cond_0
    const-wide/16 v0, 0x7f

    and-long/2addr v0, p1

    const-wide/16 v2, 0x80

    or-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public static x()Ljava/util/Set;
    .locals 3

    :try_start_0
    const-string v0, "android.text.EmojiConsistency"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getEmojiConsistencySet"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, [I

    if-nez v2, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-object v0

    :catchall_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static x0(Ljava/lang/String;)V
    .locals 2

    const-string v0, "[OKK-CompatProbe] "

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lde/robv/android/xposed/d;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void
.end method

.method public static final y(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p1}, LU/S;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "receiver == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract U(Ljava/lang/Throwable;)V
.end method

.method public abstract V(LY/v;)V
.end method

.method public abstract h()V
.end method

.method public k0(Landroid/view/View;F)V
    .locals 1

    sget-boolean v0, LU/S;->d:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LY/y;->b(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, LU/S;->d:Z

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public l0(Landroid/view/View;I)V
    .locals 3

    sget-boolean v0, LU/S;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "mViewFlags"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LU/S;->e:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v0, LU/S;->f:Z

    :cond_0
    sget-object v0, LU/S;->e:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    sget-object v1, LU/S;->e:Ljava/lang/reflect/Field;

    and-int/lit8 v0, v0, -0xd

    or-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method

.method public z(Landroid/view/View;)F
    .locals 1

    sget-boolean v0, LU/S;->d:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1}, LY/y;->a(Landroid/view/View;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 v0, 0x0

    sput-boolean v0, LU/S;->d:Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    return p1
.end method
