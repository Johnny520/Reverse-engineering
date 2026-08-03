.class public final LPg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LYg;
.implements Lzw;
.implements Lvw;
.implements Llw;
.implements Ltt;
.implements LBu;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LPg;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LP3;Lzi;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, LPg;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final d(LPg;Ljava/lang/String;LOz;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x9b08fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    const-wide v0, -0x9b10fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/File;

    sget-object p2, Lms;->b:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p0}, Lwh;->a0(Ljava/io/File;Ljava/io/File;)V

    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lhe;->a:Lhd;

    sget-object p0, LVc;->b:LVc;

    new-instance v0, LW2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1}, LW2;-><init>(ILEb;Ljava/lang/String;)V

    invoke-static {p0, v0, p2}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LPg;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_c

    invoke-static {p1}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-wide v0, -0x9b19fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x42

    invoke-static {p0, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object p0

    const/4 v2, 0x1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lzq;->a()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x3

    check-cast p1, Lyq;

    invoke-virtual {p1, v0}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Lzq;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Lyq;

    invoke-virtual {p0, v2}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-wide v0, -0x9bc2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    :cond_1
    check-cast p0, Ljava/lang/String;

    invoke-static {p1, p0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1

    :cond_2
    const-wide v3, -0x9bc8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-static {p0, v1, p1}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object p0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Lzq;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyq;

    invoke-virtual {p1, v2}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lzq;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Lyq;

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/lang/String;

    :cond_3
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [C

    const/16 v0, 0x22

    aput-char v0, p1, v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v2

    move v3, v1

    move v4, v3

    :goto_0
    if-gt v3, v0, :cond_b

    if-nez v4, :cond_4

    move v5, v3

    goto :goto_1

    :cond_4
    move v5, v0

    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move v6, v1

    :goto_2
    if-ge v6, v2, :cond_6

    aget-char v7, p1, v6

    if-ne v5, v7, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_6
    const/4 v6, -0x1

    :goto_3
    if-ltz v6, :cond_7

    move v5, v2

    goto :goto_4

    :cond_7
    move v5, v1

    :goto_4
    if-nez v4, :cond_9

    if-nez v5, :cond_8

    move v4, v2

    goto :goto_0

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    if-nez v5, :cond_a

    goto :goto_5

    :cond_a
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_b
    :goto_5
    add-int/2addr v0, v2

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    :goto_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-wide v0, -0x9d52fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x9d59fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_0
    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x215defffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/Class;

    :cond_1
    new-instance v0, LiG;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v2, Ljava/lang/String;

    const-class v3, Ljava/util/List;

    const-class v4, Ljava/lang/String;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->g([Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p1

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, LiG;->d([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private final j(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private final k(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-wide v0, -0x9d5dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x9d64fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x216fcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static m(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 17

    const-wide v0, -0x9b45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x9b7cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->d([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x214e8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    instance-of v6, v3, Ljava/lang/reflect/Method;

    if-eqz v6, :cond_1

    check-cast v3, Ljava/lang/reflect/Method;

    :goto_1
    move-wide v6, v1

    goto :goto_2

    :cond_1
    move-object v3, v4

    goto :goto_1

    :goto_2
    sget-object v2, Lgf;->p:Landroid/app/Application;

    move-object v1, v3

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_2

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_3

    :cond_2
    move-object v0, v4

    :goto_3
    instance-of v6, v0, Ljava/lang/reflect/Method;

    if-eqz v6, :cond_3

    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_4

    :cond_3
    move-object v0, v4

    :goto_4
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/4 v6, 0x2

    aget-object v0, v0, v6

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move v7, v6

    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v8, p1

    invoke-virtual {v6, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move v9, v7

    move-object v7, v8

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move v10, v9

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-wide v11, -0x9b07fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v11

    move-object v11, v12

    const/4 v12, 0x0

    move-object/from16 v16, v4

    move-object v4, v0

    move-object/from16 v0, v16

    filled-new-array/range {v2 .. v15}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-wide v0, -0x9d78fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x9d7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-wide v0, -0x9d03fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x9d19fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x9d2afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x9dc6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-wide p1, -0x9dd6fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    sget-object p1, Lms;->c:LCb;

    new-instance v2, Lfk;

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v5, p0

    move-object v3, p4

    invoke-direct/range {v2 .. v7}, Lfk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 p0, 0x3

    invoke-static {p1, v2, p0}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void

    :cond_0
    move-object v5, p0

    invoke-static {v4, v5}, LPg;->m(Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public b(ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, LPg;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    :goto_0
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lvt;)Z
    .locals 0

    check-cast p1, Lpw;

    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj;

    :try_start_0
    iget-object p1, p1, LAj;->a:LL2;

    iget-object p1, p1, LL2;->b:Ljava/lang/Object;

    check-cast p1, LHj;

    iget-object p1, p1, LHj;->a:LWy;

    iget-object p1, p1, LWy;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1, p2}, Lt6;->d(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public f(Lvt;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LPg;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lgp;

    invoke-direct {v0}, Lgp;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lpw;Lvt;)Lpw;
    .locals 4

    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj;

    iget-object p1, p1, LAj;->a:LL2;

    iget-object p1, p1, LL2;->b:Ljava/lang/Object;

    check-cast p1, LHj;

    iget-object p1, p1, LHj;->a:LWy;

    iget-object p1, p1, LWy;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, LH2;

    sget-object v0, Lt6;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/nio/Buffer;->isReadOnly()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ls6;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Ls6;-><init>([BII)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget v1, v0, Ls6;->a:I

    if-nez v1, :cond_1

    iget v1, v0, Ls6;->b:I

    iget-object v0, v0, Ls6;->c:Ljava/lang/Object;

    check-cast v0, [B

    array-length v0, v0

    if-ne v1, v0, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-object p1, v0

    :goto_1
    invoke-direct {p2, p1}, LH2;-><init>([B)V

    return-object p2
.end method
