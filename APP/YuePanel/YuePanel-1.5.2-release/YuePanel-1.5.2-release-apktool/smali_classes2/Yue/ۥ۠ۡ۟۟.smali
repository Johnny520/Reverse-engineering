.class public LYue/ۥ۠ۡ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۡ۟۟$ۥ۟۟;,
        LYue/ۥ۠ۡ۟۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = -0x1

.field public static final ۥ۟:Ljava/lang/String; = ""

.field public static final ۥ۟۟:I = 0x24

.field public static final ۥ۟۟۟:[C

.field public static final ۥ۟۟۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static ۥ۟۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟:[C

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۟:Ljava/util/HashMap;

    return-void

    :array_0
    .array-data 2
        0x2cs
        0x3bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۥ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;Ljava/lang/String;I)V

    return-void
.end method

.method public static ۥ۟(Ljava/lang/Appendable;LYue/ۥ۠ۡ۟۟$ۥ۟۟;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1, p2}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x3b

    if-nez v0, :cond_0

    const/16 p2, 0x26

    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    const-string p1, "&#x"

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method

.method public static ۥ۟۟(LYue/ۥ۠ۡ۟۟$ۥ۟;CLjava/nio/charset/CharsetEncoder;)Z
    .locals 2

    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    invoke-virtual {p2, p1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result p0

    return p0

    :cond_0
    return v0

    :cond_1
    const/16 p0, 0x80

    if-ge p1, p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;[I)I
    .locals 3

    sget-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۟:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    aput p0, p1, v1

    const/4 p0, 0x2

    return p0

    :cond_0
    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۧ(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    aput p0, p1, v2

    return v1

    :cond_1
    return v2
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠۟ۧۥ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ;

    :cond_0
    sget-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۠:LYue/ۥ۠۟ۧۥ$ۥ;

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;)Ljava/lang/String;
    .locals 8

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-static {}, LYue/ۥۢ۠ۡۤ;->ۥ۟()Ljava/lang/StringBuilder;

    move-result-object v7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    :try_start_0
    invoke-static/range {v0 .. v6}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/Appendable;Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;ZZZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v7}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۠۠(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, LYue/ۥۡۨۢۨ;

    invoke-direct {p1, p0}, LYue/ۥۡۨۢۨ;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/Appendable;Ljava/lang/String;LYue/ۥ۠۟ۧۥ$ۥ;ZZZZ)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۟ۡ()Ljava/nio/charset/CharsetEncoder;

    move-result-object v2

    move-object/from16 v3, p2

    iget-object v4, v3, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۡ۟۟$ۥ۟;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    move v8, v7

    move v9, v8

    move v10, v9

    :goto_0
    if-ge v7, v5, :cond_15

    move-object/from16 v11, p1

    invoke-virtual {v11, v7}, Ljava/lang/String;->codePointAt(I)I

    move-result v12

    const/16 v13, 0x20

    if-eqz p4, :cond_5

    invoke-static {v12}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۟ۤ(I)Z

    move-result v14

    const/4 v15, 0x1

    if-eqz v14, :cond_3

    if-eqz p5, :cond_0

    if-nez v9, :cond_0

    goto/16 :goto_5

    :cond_0
    if-eqz v10, :cond_1

    goto/16 :goto_5

    :cond_1
    if-eqz p6, :cond_2

    move v8, v15

    goto/16 :goto_5

    :cond_2
    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move v10, v15

    goto/16 :goto_5

    :cond_3
    if-eqz v8, :cond_4

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move v8, v6

    move v10, v8

    :goto_1
    move v9, v15

    goto :goto_2

    :cond_4
    move v10, v6

    goto :goto_1

    :cond_5
    :goto_2
    const/high16 v14, 0x10000

    if-ge v12, v14, :cond_13

    int-to-char v14, v12

    const/16 v15, 0x9

    if-eq v14, v15, :cond_12

    const/16 v15, 0xa

    if-eq v14, v15, :cond_12

    const/16 v15, 0xd

    if-eq v14, v15, :cond_12

    const/16 v15, 0x22

    if-eq v14, v15, :cond_10

    const/16 v15, 0x26

    if-eq v14, v15, :cond_f

    const/16 v15, 0x3c

    if-eq v14, v15, :cond_c

    const/16 v15, 0x3e

    if-eq v14, v15, :cond_a

    const/16 v15, 0xa0

    if-eq v14, v15, :cond_8

    if-lt v14, v13, :cond_7

    invoke-static {v4, v14, v2}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟(LYue/ۥ۠ۡ۟۟$ۥ۟;CLjava/nio/charset/CharsetEncoder;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto/16 :goto_5

    :cond_7
    :goto_3
    invoke-static {v0, v1, v12}, LYue/ۥ۠ۡ۟۟;->ۥ۟(Ljava/lang/Appendable;LYue/ۥ۠ۡ۟۟$ۥ۟۟;I)V

    goto/16 :goto_5

    :cond_8
    sget-object v13, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    if-eq v1, v13, :cond_9

    const-string v13, "&nbsp;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_9
    const-string v13, "&#xa0;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_a
    if-nez p3, :cond_b

    const-string v13, "&gt;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_b
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_5

    :cond_c
    if-eqz p3, :cond_e

    sget-object v13, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    if-eq v1, v13, :cond_e

    invoke-virtual/range {p2 .. p2}, LYue/ۥ۠۟ۧۥ$ۥ;->ۥ۟۟۠ۤ()LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    move-result-object v13

    sget-object v15, LYue/ۥ۠۟ۧۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۧۥ$ۥ$ۥ;

    if-ne v13, v15, :cond_d

    goto :goto_4

    :cond_d
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_5

    :cond_e
    :goto_4
    const-string v13, "&lt;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_f
    const-string v13, "&amp;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_10
    if-eqz p3, :cond_11

    const-string v13, "&quot;"

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_11
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_5

    :cond_12
    invoke-interface {v0, v14}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_5

    :cond_13
    new-instance v13, Ljava/lang/String;

    invoke-static {v12}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2, v13}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v0, v13}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_5

    :cond_14
    invoke-static {v0, v1, v12}, LYue/ۥ۠ۡ۟۟;->ۥ۟(Ljava/lang/Appendable;LYue/ۥ۠ۡ۟۟$ۥ۟۟;I)V

    :goto_5
    invoke-static {v12}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v7, v12

    goto/16 :goto_0

    :cond_15
    return-void
.end method

.method public static ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    sget-object v0, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۟:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۧ(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    new-instance v0, Ljava/lang/String;

    filled-new-array {p0}, [I

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Ljava/lang/String;-><init>([III)V

    return-object v0

    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۧ(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۟ۤ(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟ۡ:LYue/ۥ۠ۡ۟۟$ۥ۟۟;

    invoke-virtual {v0, p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۧ(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۟ۥ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;Ljava/lang/String;I)V
    .locals 8

    new-array v0, p2, [Ljava/lang/String;

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟۟(LYue/ۥ۠ۡ۟۟$ۥ۟۟;[Ljava/lang/String;)[Ljava/lang/String;

    new-array v0, p2, [I

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۡ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;[I)[I

    new-array v0, p2, [I

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۤ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;[I)[I

    new-array v0, p2, [Ljava/lang/String;

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۦ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;[Ljava/lang/String;)[Ljava/lang/String;

    new-instance v0, LYue/ۥۣ۟ۤۤ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۤۤ;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    move v1, p1

    :goto_0
    :try_start_0
    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۦ()Z

    move-result v2

    if-nez v2, :cond_2

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠۟(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    sget-object v3, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟:[C

    invoke-virtual {v0, v3}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۡ([C)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x24

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠ۥ()C

    move-result v5

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    const/16 v6, 0x2c

    const/4 v7, -0x1

    if-ne v5, v6, :cond_0

    const/16 v5, 0x3b

    invoke-virtual {v0, v5}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠۟(C)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    move v5, v7

    :goto_1
    const/16 v6, 0x26

    invoke-virtual {v0, v6}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۠۟(C)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ()V

    invoke-static {p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, v1

    invoke-static {p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟۠(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)[I

    move-result-object v6

    aput v3, v6, v1

    invoke-static {p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥۣ۟۟۟(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)[I

    move-result-object v6

    aput v3, v6, v4

    invoke-static {p0}, LYue/ۥ۠ۡ۟۟$ۥ۟۟;->ۥ۟۟۟ۥ(LYue/ۥ۠ۡ۟۟$ۥ۟۟;)[Ljava/lang/String;

    move-result-object v6

    aput-object v2, v6, v4

    if-eq v5, v7, :cond_1

    sget-object v4, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟۟:Ljava/util/HashMap;

    new-instance v6, Ljava/lang/String;

    filled-new-array {v3, v5}, [I

    move-result-object v3

    const/4 v5, 0x2

    invoke-direct {v6, v3, p1, v5}, Ljava/lang/String;-><init>([III)V

    invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-ne v1, p2, :cond_3

    const/4 p1, 0x1

    :cond_3
    const-string p0, "Unexpected count of entities loaded"

    invoke-static {p1, p0}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟()V

    return-void

    :goto_2
    invoke-virtual {v0}, LYue/ۥۣ۟ۤۤ;->ۥ۟۟۟()V

    throw p0
.end method

.method public static ۥ۟۟۟ۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۠ۡ۟۟;->ۥ۟۟۟ۧ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۧ(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣۡۧۦ;->ۥ۟۟۠ۥ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
