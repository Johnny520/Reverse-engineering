.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Method;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 5
    .line 6
    new-instance p1, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-direct {p1, p0, v0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;
    .locals 10

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    if-ne p2, v0, :cond_1

    .line 6
    .line 7
    :cond_0
    if-ne p3, v0, :cond_1

    .line 8
    .line 9
    new-instance p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲楪世;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-direct {p2, p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲楪世;-><init>(Ljava/lang/Class;Ljava/lang/Class;J)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_1
    new-instance v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    move-object v3, p0

    .line 23
    move-object v4, p1

    .line 24
    move-object v5, p2

    .line 25
    move-object v6, p3

    .line 26
    invoke-direct/range {v2 .. v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v3, Ljava/lang/String;

    if-eq v1, v3, :cond_e7

    const-class v4, Ljava/lang/CharSequence;

    if-ne v1, v4, :cond_0

    goto/16 :goto_2d

    .line 2
    :cond_0
    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_e6

    const-class v4, Ljava/lang/Character;

    if-ne v1, v4, :cond_1

    goto/16 :goto_2c

    .line 3
    :cond_1
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_e5

    const-class v4, Ljava/lang/Boolean;

    if-ne v1, v4, :cond_2

    goto/16 :goto_2b

    .line 4
    :cond_2
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_e4

    const-class v4, Ljava/lang/Byte;

    if-ne v1, v4, :cond_3

    goto/16 :goto_2a

    .line 5
    :cond_3
    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_e3

    const-class v4, Ljava/lang/Short;

    if-ne v1, v4, :cond_4

    goto/16 :goto_29

    .line 6
    :cond_4
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_e2

    const-class v5, Ljava/lang/Integer;

    if-ne v1, v5, :cond_5

    goto/16 :goto_28

    .line 7
    :cond_5
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v1, v5, :cond_e1

    const-class v5, Ljava/lang/Long;

    if-ne v1, v5, :cond_6

    goto/16 :goto_27

    .line 8
    :cond_6
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v1, v6, :cond_e0

    const-class v6, Ljava/lang/Float;

    if-ne v1, v6, :cond_7

    goto/16 :goto_26

    .line 9
    :cond_7
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v1, v6, :cond_df

    const-class v6, Ljava/lang/Double;

    if-ne v1, v6, :cond_8

    goto/16 :goto_25

    .line 10
    :cond_8
    const-class v6, Ljava/math/BigInteger;

    if-ne v1, v6, :cond_9

    .line 11
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 12
    :cond_9
    const-class v6, Ljava/math/BigDecimal;

    if-ne v1, v6, :cond_a

    .line 13
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;

    return-object v0

    .line 14
    :cond_a
    const-class v6, Ljava/lang/Number;

    if-ne v1, v6, :cond_b

    .line 15
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲世苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 16
    :cond_b
    const-class v7, Ljava/util/BitSet;

    if-ne v1, v7, :cond_c

    .line 17
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰苏世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰苏世;

    return-object v0

    .line 18
    :cond_c
    const-class v7, Ljava/util/OptionalInt;

    if-ne v1, v7, :cond_d

    .line 19
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 20
    :cond_d
    const-class v7, Ljava/util/OptionalLong;

    if-ne v1, v7, :cond_e

    .line 21
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 22
    :cond_e
    const-class v7, Ljava/util/OptionalDouble;

    if-ne v1, v7, :cond_f

    .line 23
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲苏世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 24
    :cond_f
    const-class v7, Ljava/util/Optional;

    if-ne v1, v7, :cond_10

    .line 25
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;

    return-object v0

    .line 26
    :cond_10
    const-class v8, Ljava/util/UUID;

    if-ne v1, v8, :cond_11

    .line 27
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪兰世苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 28
    :cond_11
    const-class v8, Ljava/time/Duration;

    const/4 v9, 0x1

    if-ne v1, v8, :cond_12

    .line 29
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏哲兰;

    invoke-direct {v1, v9}, L飘花落叶言苏子哲楪世兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    invoke-direct {v0, v8, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_12
    const/16 v8, 0x11

    .line 30
    const-class v10, Ljava/time/Period;

    if-ne v1, v10, :cond_13

    .line 31
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v8}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_13
    const/16 v10, 0x14

    .line 32
    const-class v11, Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne v1, v11, :cond_14

    .line 33
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v10}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Lbsh/classpath/飘花落叶言子楪世哲兰苏;)V

    return-object v0

    :cond_14
    const/16 v11, 0x15

    .line 34
    const-class v12, Ljava/net/URI;

    if-ne v1, v12, :cond_15

    .line 35
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v11}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v12, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_15
    const/16 v12, 0x16

    .line 36
    const-class v13, Ljava/nio/charset/Charset;

    if-ne v1, v13, :cond_16

    .line 37
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v12}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v13, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_16
    const/16 v13, 0x17

    .line 38
    const-class v14, Ljava/io/File;

    if-ne v1, v14, :cond_17

    .line 39
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v13}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v14, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_17
    const/16 v14, 0x18

    .line 40
    const-class v15, Ljava/nio/file/Path;

    if-ne v1, v15, :cond_18

    .line 41
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v14}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v15, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_18
    const/16 v15, 0x1a

    .line 42
    const-class v8, Ljava/net/URL;

    if-ne v1, v8, :cond_19

    .line 43
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v15}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v8, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    :cond_19
    const/16 v8, 0x1b

    .line 44
    const-class v10, Ljava/util/regex/Pattern;

    if-ne v1, v10, :cond_1a

    .line 45
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    invoke-direct {v1, v8}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v10, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 46
    :cond_1a
    const-class v10, Ljava/lang/Class;

    if-ne v1, v10, :cond_1b

    .line 47
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰楪苏;

    return-object v0

    .line 48
    :cond_1b
    const-class v10, Ljava/lang/reflect/Method;

    if-ne v1, v10, :cond_1c

    .line 49
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪世苏;

    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 51
    :cond_1c
    const-class v10, Ljava/lang/reflect/Field;

    if-ne v1, v10, :cond_1d

    .line 52
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏兰楪世;

    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    .line 54
    :cond_1d
    const-class v10, Ljava/lang/reflect/Type;

    if-ne v1, v10, :cond_1e

    .line 55
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰楪苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰楪苏;

    return-object v0

    .line 56
    :cond_1e
    invoke-static {v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v10

    .line 57
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v18

    const/16 v19, 0x9

    const/16 v20, 0x8

    const/16 v21, 0x7

    const/16 v22, 0x6

    const-string v8, "org.springframework.util.LinkedMultiValueMap"

    const/16 v24, 0x4

    const/16 v26, -0x1

    sparse-switch v18, :sswitch_data_0

    :goto_0
    move/from16 v15, v26

    goto/16 :goto_1

    :sswitch_0
    const-string v15, "org.springframework.security.core.authority.SimpleGrantedAuthority"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1f

    goto :goto_0

    :cond_1f
    const/16 v15, 0xa

    goto/16 :goto_1

    :sswitch_1
    const-string v15, "org.springframework.security.core.userdetails.User"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_20

    goto :goto_0

    :cond_20
    move/from16 v15, v19

    goto/16 :goto_1

    :sswitch_2
    const-string v15, "org.springframework.security.authentication.BadCredentialsException"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_21

    goto :goto_0

    :cond_21
    move/from16 v15, v20

    goto/16 :goto_1

    :sswitch_3
    const-string v15, "org.springframework.security.core.authority.RememberMeAuthenticationToken"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_22

    goto :goto_0

    :cond_22
    move/from16 v15, v21

    goto :goto_1

    :sswitch_4
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_23

    goto :goto_0

    :cond_23
    move/from16 v15, v22

    goto :goto_1

    :sswitch_5
    const-string v15, "org.springframework.security.web.authentication.WebAuthenticationDetails"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_24

    goto :goto_0

    :cond_24
    const/4 v15, 0x5

    goto :goto_1

    :sswitch_6
    const-string v15, "org.springframework.security.web.savedrequest.SavedCookie"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_25

    goto :goto_0

    :cond_25
    move/from16 v15, v24

    goto :goto_1

    :sswitch_7
    const-string v15, "org.springframework.security.core.authority.AnonymousAuthenticationToken"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_26

    goto :goto_0

    :cond_26
    const/4 v15, 0x3

    goto :goto_1

    :sswitch_8
    const-string v15, "org.springframework.security.web.csrf.DefaultCsrfToken"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_27

    goto :goto_0

    :cond_27
    const/4 v15, 0x2

    goto :goto_1

    :sswitch_9
    const-string v15, "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_28

    goto :goto_0

    :cond_28
    move v15, v9

    goto :goto_1

    :sswitch_a
    const-string v15, "org.springframework.security.authentication.UsernamePasswordAuthenticationToken"

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_29

    goto/16 :goto_0

    :cond_29
    const/4 v15, 0x0

    :goto_1
    const-string v11, "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin"

    const-wide/16 v12, 0x0

    packed-switch v15, :pswitch_data_0

    const/4 v15, 0x0

    goto :goto_3

    :pswitch_0
    move-object v15, v11

    goto :goto_3

    .line 58
    :pswitch_1
    const-string v15, "org.springframework.security.jackson2.UserMixin"

    goto :goto_3

    .line 59
    :pswitch_2
    const-string v15, "org.springframework.security.jackson2.BadCredentialsExceptionMixin"

    goto :goto_3

    .line 60
    :pswitch_3
    const-string v15, "org.springframework.security.jackson2.AnonymousAuthenticationTokenMixin"

    goto :goto_3

    .line 61
    :pswitch_4
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v1, v0, v12, v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 62
    :pswitch_5
    const-string v15, "org.springframework.security.web.jackson2.WebAuthenticationDetailsMixin"

    goto :goto_3

    .line 63
    :pswitch_6
    const-string v15, "org.springframework.security.web.jackson2.SavedCookieMixin"

    goto :goto_3

    .line 64
    :pswitch_7
    const-string v15, "org.springframework.security.jackson2.RememberMeAuthenticationTokenMixin"

    goto :goto_3

    .line 65
    :pswitch_8
    const-string v15, "org.springframework.security.web.jackson2.DefaultCsrfTokenMixin"

    goto :goto_3

    :catchall_0
    :cond_2a
    :goto_2
    :pswitch_9
    const/16 v31, 0x0

    goto/16 :goto_17

    .line 66
    :pswitch_a
    const-string v15, "org.springframework.security.jackson2.UsernamePasswordAuthenticationTokenMixin"

    :goto_3
    if-eqz v15, :cond_2c

    .line 67
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Ljava/lang/Class;

    if-nez v30, :cond_2c

    .line 68
    invoke-static {v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v30

    if-nez v30, :cond_2b

    .line 69
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2b

    .line 70
    const-string v11, "com.alibaba.fastjson2.internal.mixin.spring.SimpleGrantedAuthorityMixin"

    invoke-static {v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v30

    :cond_2b
    move-object/from16 v11, v30

    if-eqz v11, :cond_2c

    .line 71
    move-object v15, v1

    check-cast v15, Ljava/lang/Class;

    invoke-virtual {v2, v15, v11}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_2c
    const-class v2, Ljava/util/Map;

    if-eq v1, v2, :cond_2d

    const-class v11, Ljava/util/AbstractMap;

    if-ne v1, v11, :cond_2e

    :cond_2d
    const/4 v7, 0x0

    goto/16 :goto_24

    .line 73
    :cond_2e
    const-class v15, Ljava/util/concurrent/ConcurrentMap;

    const-class v12, Ljava/util/concurrent/ConcurrentHashMap;

    const-class v13, Ljava/lang/Object;

    if-eq v1, v15, :cond_2f

    if-ne v1, v12, :cond_30

    :cond_2f
    const/4 v7, 0x0

    goto/16 :goto_23

    .line 74
    :cond_30
    const-class v9, Ljava/util/concurrent/ConcurrentNavigableMap;

    const-class v14, Ljava/util/concurrent/ConcurrentSkipListMap;

    if-eq v1, v9, :cond_31

    if-ne v1, v14, :cond_32

    :cond_31
    const/4 v7, 0x0

    goto/16 :goto_22

    :cond_32
    move-object/from16 v33, v6

    .line 75
    const-class v6, Ljava/util/SortedMap;

    move-object/from16 v34, v5

    const-class v5, Ljava/util/TreeMap;

    if-eq v1, v6, :cond_33

    const-class v6, Ljava/util/NavigableMap;

    if-eq v1, v6, :cond_33

    if-ne v1, v5, :cond_34

    :cond_33
    move-object v2, v5

    const/4 v7, 0x0

    goto/16 :goto_21

    .line 76
    :cond_34
    const-class v6, Ljava/util/Calendar;

    if-eq v1, v6, :cond_de

    const-string v6, "javax.xml.datatype.XMLGregorianCalendar"

    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_35

    goto/16 :goto_20

    .line 77
    :cond_35
    const-class v6, Ljava/util/Date;

    if-ne v1, v6, :cond_36

    .line 78
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    return-object v0

    .line 79
    :cond_36
    const-class v6, Ljava/time/LocalDate;

    if-ne v1, v6, :cond_37

    .line 80
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲楪苏;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲楪苏;

    return-object v0

    .line 81
    :cond_37
    const-class v6, Ljava/time/LocalTime;

    if-ne v1, v6, :cond_38

    .line 82
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏楪世哲;

    return-object v0

    .line 83
    :cond_38
    const-class v6, Ljava/time/LocalDateTime;

    if-ne v1, v6, :cond_39

    .line 84
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;

    return-object v0

    .line 85
    :cond_39
    const-class v6, Ljava/time/ZonedDateTime;

    if-ne v1, v6, :cond_3a

    .line 86
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲兰苏;

    return-object v0

    .line 87
    :cond_3a
    const-class v6, Ljava/time/OffsetDateTime;

    if-ne v1, v6, :cond_3b

    .line 88
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世楪苏;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世楪苏;

    return-object v0

    .line 89
    :cond_3b
    const-class v6, Ljava/time/OffsetTime;

    if-ne v1, v6, :cond_3c

    .line 90
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世苏楪;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世苏楪;

    return-object v0

    .line 91
    :cond_3c
    const-class v6, Ljava/time/ZoneOffset;

    if-ne v1, v6, :cond_3d

    .line 92
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 93
    :cond_3d
    const-class v6, Ljava/time/Instant;

    if-ne v1, v6, :cond_3e

    .line 94
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰世楪苏;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰世楪苏;

    return-object v0

    .line 95
    :cond_3e
    const-class v6, Ljava/util/Locale;

    if-ne v1, v6, :cond_3f

    .line 96
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 97
    :cond_3f
    const-class v6, Ljava/util/Currency;

    if-ne v1, v6, :cond_40

    .line 98
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;

    return-object v0

    .line 99
    :cond_40
    const-class v6, Ljava/time/ZoneId;

    if-ne v1, v6, :cond_41

    .line 100
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 101
    :cond_41
    const-class v6, Ljava/util/TimeZone;

    if-ne v1, v6, :cond_42

    .line 102
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 103
    :cond_42
    const-class v6, [C

    if-ne v1, v6, :cond_43

    .line 104
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;

    return-object v0

    .line 105
    :cond_43
    const-class v6, [F

    if-ne v1, v6, :cond_44

    .line 106
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;

    return-object v0

    .line 107
    :cond_44
    const-class v6, [D

    if-ne v1, v6, :cond_45

    .line 108
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;

    return-object v0

    .line 109
    :cond_45
    const-class v6, [Z

    if-ne v1, v6, :cond_46

    .line 110
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;

    return-object v0

    .line 111
    :cond_46
    const-class v6, [B

    if-ne v1, v6, :cond_47

    .line 112
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    return-object v0

    .line 113
    :cond_47
    const-class v6, [S

    if-ne v1, v6, :cond_48

    .line 114
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;

    return-object v0

    .line 115
    :cond_48
    const-class v6, [I

    if-ne v1, v6, :cond_49

    .line 116
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;

    return-object v0

    .line 117
    :cond_49
    const-class v6, [J

    if-ne v1, v6, :cond_4a

    .line 118
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;

    return-object v0

    .line 119
    :cond_4a
    const-class v6, [Ljava/lang/Byte;

    if-ne v1, v6, :cond_4b

    .line 120
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;

    return-object v0

    .line 121
    :cond_4b
    const-class v6, [Ljava/lang/Short;

    if-ne v1, v6, :cond_4c

    .line 122
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰世苏楪;

    return-object v0

    .line 123
    :cond_4c
    const-class v6, [Ljava/lang/Integer;

    if-ne v1, v6, :cond_4d

    .line 124
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;

    return-object v0

    .line 125
    :cond_4d
    const-class v6, [Ljava/lang/Long;

    if-ne v1, v6, :cond_4e

    .line 126
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世哲苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世哲苏;

    return-object v0

    .line 127
    :cond_4e
    const-class v6, [Ljava/lang/Float;

    if-ne v1, v6, :cond_4f

    .line 128
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏兰世楪;

    return-object v0

    .line 129
    :cond_4f
    const-class v6, [Ljava/lang/Double;

    if-ne v1, v6, :cond_50

    .line 130
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪兰世;

    return-object v0

    .line 131
    :cond_50
    const-class v6, [Ljava/lang/Number;

    if-ne v1, v6, :cond_51

    .line 132
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲世兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 133
    :cond_51
    const-class v6, [Ljava/lang/String;

    if-ne v1, v6, :cond_52

    .line 134
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏哲兰;

    return-object v0

    .line 135
    :cond_52
    const-class v6, Ljava/util/concurrent/atomic/AtomicInteger;

    if-ne v1, v6, :cond_53

    .line 136
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世兰哲苏;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世兰哲苏;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;-><init>(Lbsh/classpath/飘花落叶言子楪世兰哲苏;)V

    return-object v0

    .line 137
    :cond_53
    const-class v6, Ljava/util/concurrent/atomic/AtomicLong;

    if-ne v1, v6, :cond_54

    .line 138
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世兰楪哲;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世兰楪哲;)V

    return-object v0

    .line 139
    :cond_54
    const-class v6, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    if-ne v1, v6, :cond_55

    .line 140
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;

    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 141
    :cond_55
    const-class v6, Ljava/util/concurrent/atomic/AtomicLongArray;

    if-ne v1, v6, :cond_56

    .line 142
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    return-object v0

    .line 143
    :cond_56
    const-class v6, Ljava/util/concurrent/atomic/AtomicReference;

    if-ne v1, v6, :cond_57

    .line 144
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    return-object v0

    :cond_57
    move-object/from16 v35, v10

    .line 145
    const-class v10, Ljava/lang/StringBuffer;

    if-eq v1, v10, :cond_dd

    const-class v10, Ljava/lang/StringBuilder;

    if-ne v1, v10, :cond_58

    goto/16 :goto_1f

    .line 146
    :cond_58
    const-class v10, Ljava/lang/Iterable;

    if-eq v1, v10, :cond_59

    const-class v0, Ljava/util/Collection;

    if-eq v1, v0, :cond_59

    move-object/from16 v36, v6

    const-class v6, Ljava/util/List;

    if-eq v1, v6, :cond_59

    move-object/from16 v37, v7

    const-class v7, Ljava/util/AbstractCollection;

    if-eq v1, v7, :cond_59

    move-object/from16 v38, v7

    const-class v7, Ljava/util/AbstractList;

    if-eq v1, v7, :cond_59

    move-object/from16 v39, v7

    const-class v7, Ljava/util/ArrayList;

    if-eq v1, v7, :cond_59

    move-object/from16 v40, v7

    const-class v7, Ljava/util/Stack;

    if-ne v1, v7, :cond_5a

    :cond_59
    const/4 v7, 0x0

    goto/16 :goto_1e

    .line 147
    :cond_5a
    const-class v7, Ljava/util/Queue;

    if-eq v1, v7, :cond_5b

    const-class v7, Ljava/util/Deque;

    if-eq v1, v7, :cond_5b

    const-class v7, Ljava/util/AbstractSequentialList;

    if-eq v1, v7, :cond_5b

    const-class v7, Ljava/util/LinkedList;

    if-ne v1, v7, :cond_5c

    :cond_5b
    const/4 v7, 0x0

    goto/16 :goto_1d

    :cond_5c
    move-object/from16 v41, v7

    .line 148
    const-class v7, Ljava/util/Set;

    if-eq v1, v7, :cond_5d

    const-class v7, Ljava/util/AbstractSet;

    if-eq v1, v7, :cond_5d

    const-class v7, Ljava/util/EnumSet;

    if-ne v1, v7, :cond_5e

    :cond_5d
    const/4 v7, 0x0

    goto/16 :goto_1c

    .line 149
    :cond_5e
    const-class v7, Ljava/util/NavigableSet;

    if-eq v1, v7, :cond_5f

    const-class v7, Ljava/util/SortedSet;

    if-ne v1, v7, :cond_60

    :cond_5f
    const/4 v7, 0x0

    goto/16 :goto_1b

    .line 150
    :cond_60
    const-class v7, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eq v1, v7, :cond_61

    const-class v7, Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eq v1, v7, :cond_61

    const-class v7, Ljava/util/concurrent/ConcurrentSkipListSet;

    if-eq v1, v7, :cond_61

    const-class v7, Ljava/util/LinkedHashSet;

    if-eq v1, v7, :cond_61

    const-class v7, Ljava/util/HashSet;

    if-eq v1, v7, :cond_61

    move-object/from16 v42, v7

    const-class v7, Ljava/util/TreeSet;

    if-eq v1, v7, :cond_61

    move-object/from16 v43, v7

    const-class v7, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-ne v1, v7, :cond_62

    :cond_61
    const/4 v7, 0x0

    goto/16 :goto_1a

    .line 151
    :cond_62
    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲世苏兰:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲世兰苏:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲苏世兰:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Class;

    if-eq v1, v7, :cond_63

    sget-object v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    if-ne v1, v7, :cond_64

    :cond_63
    const/4 v7, 0x0

    goto/16 :goto_19

    .line 152
    :cond_64
    sget-object v7, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    if-ne v1, v7, :cond_65

    const/4 v7, 0x0

    .line 153
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_65
    if-eq v1, v13, :cond_dc

    .line 154
    const-class v7, Ljava/lang/Cloneable;

    if-eq v1, v7, :cond_dc

    const-class v7, Ljava/io/Closeable;

    if-eq v1, v7, :cond_dc

    const-class v7, Ljava/io/Serializable;

    if-eq v1, v7, :cond_dc

    const-class v7, Ljava/lang/Comparable;

    if-ne v1, v7, :cond_66

    goto/16 :goto_18

    .line 155
    :cond_66
    const-class v7, Ljava/util/Map$Entry;

    if-ne v1, v7, :cond_67

    .line 156
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世哲楪;

    const/4 v7, 0x0

    invoke-direct {v0, v7, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世哲楪;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v0

    .line 157
    :cond_67
    instance-of v7, v1, Ljava/lang/Class;

    if-eqz v7, :cond_70

    .line 158
    move-object v7, v1

    check-cast v7, Ljava/lang/Class;

    .line 159
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/Class;)Z

    move-result v44

    if-eqz v44, :cond_68

    goto/16 :goto_2

    .line 160
    :cond_68
    invoke-virtual {v2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v44

    if-eqz v44, :cond_69

    const-wide/16 v5, 0x0

    const/4 v10, 0x0

    .line 161
    invoke-static {v10, v7, v5, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_69
    move-object/from16 v44, v5

    move-object/from16 v45, v6

    move-object/from16 v46, v10

    .line 162
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_6a

    .line 163
    invoke-static {v7, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 164
    :cond_6a
    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_6c

    .line 165
    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v13, :cond_6b

    .line 166
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲苏兰楪;

    return-object v0

    .line 167
    :cond_6b
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲兰楪苏;

    invoke-direct {v0, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲兰楪苏;-><init>(Ljava/lang/Class;)V

    return-object v0

    .line 168
    :cond_6c
    const-class v5, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰世苏;

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_6d

    .line 169
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲苏世;

    invoke-direct {v0, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲苏世;-><init>(Ljava/lang/Class;)V

    return-object v0

    .line 170
    :cond_6d
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    move-result-object v5

    .line 171
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    sget-object v6, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/ThreadLocal;

    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    if-eqz v6, :cond_6e

    goto :goto_4

    .line 173
    :cond_6e
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    .line 174
    :goto_4
    const-class v5, Ljava/lang/StackTraceElement;

    if-ne v7, v5, :cond_6f

    .line 175
    :try_start_0
    filled-new-array {v3, v3, v3, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    .line 176
    const-string v7, "className"

    const-string v10, "methodName"

    move-object/from16 v47, v6

    const-string v6, "fileName"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v48, v4

    :try_start_1
    const-string v4, "lineNumber"

    filled-new-array {v7, v10, v6, v4}, [Ljava/lang/String;

    move-result-object v4

    .line 177
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    return-object v0

    :catchall_1
    :cond_6f
    move-object/from16 v48, v4

    goto :goto_5

    :cond_70
    move-object/from16 v48, v4

    move-object/from16 v44, v5

    move-object/from16 v45, v6

    move-object/from16 v46, v10

    .line 178
    :catchall_2
    :goto_5
    instance-of v4, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_9c

    .line 179
    move-object v4, v1

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 180
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 181
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    .line 182
    array-length v6, v4

    const/4 v7, 0x2

    if-ne v6, v7, :cond_80

    const/16 v32, 0x0

    .line 183
    aget-object v0, v4, v32

    const/16 v29, 0x1

    .line 184
    aget-object v3, v4, v29

    if-eq v5, v2, :cond_71

    if-eq v5, v11, :cond_71

    .line 185
    const-class v2, Ljava/util/HashMap;

    if-ne v5, v2, :cond_72

    :cond_71
    move-object v1, v3

    goto/16 :goto_b

    :cond_72
    if-eq v5, v15, :cond_73

    if-ne v5, v12, :cond_74

    :cond_73
    move-object v1, v3

    goto/16 :goto_a

    :cond_74
    if-eq v5, v9, :cond_75

    if-ne v5, v14, :cond_76

    :cond_75
    move-object v1, v3

    goto/16 :goto_9

    .line 186
    :cond_76
    const-class v2, Ljava/util/LinkedHashMap;

    if-eq v5, v2, :cond_77

    move-object/from16 v2, v44

    if-eq v5, v2, :cond_77

    const-class v2, Ljava/util/Hashtable;

    if-ne v5, v2, :cond_78

    :cond_77
    move-object v1, v3

    goto/16 :goto_8

    .line 187
    :cond_78
    const-class v2, Ljava/util/Map$Entry;

    if-ne v5, v2, :cond_79

    .line 188
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世哲楪;

    invoke-direct {v1, v0, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世哲楪;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v1

    .line 189
    :cond_79
    invoke-static {v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    :goto_6
    move/from16 v9, v26

    goto :goto_7

    :sswitch_b
    const-string v4, "com.google.common.collect.RegularImmutableMap"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7a

    goto :goto_6

    :cond_7a
    const/4 v9, 0x5

    goto :goto_7

    :sswitch_c
    const-string v4, "org.apache.commons.lang3.tuple.ImmutablePair"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7b

    goto :goto_6

    :cond_7b
    move/from16 v9, v24

    goto :goto_7

    :sswitch_d
    const-string v4, "com.google.common.collect.ImmutableMap"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7c

    goto :goto_6

    :cond_7c
    const/4 v9, 0x3

    goto :goto_7

    :sswitch_e
    const-string v4, "org.apache.commons.lang3.tuple.Pair"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7d

    goto :goto_6

    :cond_7d
    const/4 v9, 0x2

    goto :goto_7

    :sswitch_f
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7e

    goto :goto_6

    :cond_7e
    const/4 v9, 0x1

    goto :goto_7

    :sswitch_10
    const-string v4, "com.google.common.collect.SingletonImmutableBiMap"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7f

    goto :goto_6

    :cond_7f
    const/4 v9, 0x0

    :goto_7
    packed-switch v9, :pswitch_data_1

    goto/16 :goto_2

    .line 190
    :pswitch_b
    new-instance v16, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-object/from16 v17, v5

    check-cast v17, Ljava/lang/Class;

    .line 191
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    const/4 v2, 0x2

    .line 192
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 193
    const-class v18, Ljava/util/HashMap;

    const-wide/16 v21, 0x0

    move-object/from16 v19, v0

    move-object/from16 v23, v1

    move-object/from16 v20, v3

    invoke-direct/range {v16 .. v23}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    return-object v16

    :pswitch_c
    move-object v1, v3

    .line 194
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v2, v5, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v2

    .line 195
    :pswitch_d
    check-cast v5, Ljava/lang/Class;

    const-wide/16 v2, 0x0

    invoke-static {v1, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object v1, v3

    .line 196
    new-instance v16, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-object/from16 v17, v5

    check-cast v17, Ljava/lang/Class;

    .line 197
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    const/4 v6, 0x3

    .line 198
    invoke-direct {v2, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 199
    const-class v18, Ljava/util/HashMap;

    const-wide/16 v21, 0x0

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object/from16 v23, v2

    invoke-direct/range {v16 .. v23}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    return-object v16

    .line 200
    :goto_8
    check-cast v5, Ljava/lang/Class;

    invoke-static {v5, v5, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 201
    :goto_9
    check-cast v5, Ljava/lang/Class;

    invoke-static {v5, v14, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 202
    :goto_a
    check-cast v5, Ljava/lang/Class;

    invoke-static {v5, v12, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 203
    :goto_b
    check-cast v5, Ljava/lang/Class;

    const-class v2, Ljava/util/HashMap;

    invoke-static {v5, v2, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    :cond_80
    const/4 v6, 0x3

    .line 204
    array-length v2, v4

    const/4 v7, 0x1

    if-ne v2, v7, :cond_2a

    const/16 v32, 0x0

    .line 205
    aget-object v2, v4, v32

    .line 206
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v7, v46

    if-eq v5, v7, :cond_99

    if-eq v5, v0, :cond_99

    move-object/from16 v0, v45

    if-eq v5, v0, :cond_99

    move-object/from16 v0, v38

    if-eq v5, v0, :cond_99

    move-object/from16 v0, v39

    if-eq v5, v0, :cond_99

    move-object/from16 v0, v40

    if-eq v5, v0, :cond_81

    .line 207
    const-class v7, Ljava/util/Stack;

    if-ne v5, v7, :cond_82

    :cond_81
    move-object/from16 v6, v34

    goto/16 :goto_12

    .line 208
    :cond_82
    const-class v0, Ljava/util/Queue;

    if-eq v5, v0, :cond_96

    const-class v0, Ljava/util/Deque;

    if-eq v5, v0, :cond_96

    const-class v0, Ljava/util/AbstractSequentialList;

    if-eq v5, v0, :cond_96

    move-object/from16 v0, v41

    if-ne v5, v0, :cond_83

    move-object/from16 v6, v34

    goto/16 :goto_11

    .line 209
    :cond_83
    const-class v0, Ljava/util/Set;

    if-eq v5, v0, :cond_84

    const-class v0, Ljava/util/AbstractSet;

    if-eq v5, v0, :cond_84

    const-class v0, Ljava/util/EnumSet;

    if-ne v5, v0, :cond_85

    :cond_84
    move-object/from16 v6, v34

    move-object/from16 v0, v42

    goto/16 :goto_10

    .line 210
    :cond_85
    const-class v0, Ljava/util/NavigableSet;

    if-eq v5, v0, :cond_86

    const-class v0, Ljava/util/SortedSet;

    if-ne v5, v0, :cond_87

    :cond_86
    move-object/from16 v6, v34

    move-object/from16 v0, v43

    goto/16 :goto_f

    .line 211
    :cond_87
    const-class v0, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-eq v5, v0, :cond_8f

    const-class v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    if-eq v5, v0, :cond_8f

    const-class v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    if-eq v5, v0, :cond_8f

    const-class v0, Ljava/util/LinkedHashSet;

    if-eq v5, v0, :cond_8f

    move-object/from16 v0, v42

    if-eq v5, v0, :cond_8f

    move-object/from16 v0, v43

    if-eq v5, v0, :cond_8f

    const-class v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    if-ne v5, v0, :cond_88

    goto/16 :goto_e

    .line 212
    :cond_88
    invoke-static {v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_2

    :goto_c
    move/from16 v9, v26

    goto :goto_d

    :sswitch_11
    const-string v3, "com.google.common.collect.ImmutableSet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_89

    goto :goto_c

    :cond_89
    move v9, v6

    goto :goto_d

    :sswitch_12
    const-string v3, "cn.hutool.core.lang.tree.Tree"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8a

    goto :goto_c

    :cond_8a
    const/4 v9, 0x2

    goto :goto_d

    :sswitch_13
    const-string v3, "com.google.common.collect.SingletonImmutableSet"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8b

    goto :goto_c

    :cond_8b
    const/4 v9, 0x1

    goto :goto_d

    :sswitch_14
    const-string v3, "com.google.common.collect.ImmutableList"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8c

    goto :goto_c

    :cond_8c
    const/4 v9, 0x0

    :goto_d
    packed-switch v9, :pswitch_data_2

    move-object/from16 v0, v37

    if-ne v5, v0, :cond_8d

    .line 213
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;

    const/4 v7, 0x0

    invoke-direct {v0, v1, v7, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;-><init>(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0

    :cond_8d
    move-object/from16 v0, v36

    if-ne v5, v0, :cond_8e

    .line 214
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;

    invoke-direct {v0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏兰世;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0

    .line 215
    :cond_8e
    instance-of v0, v2, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_2a

    move-object/from16 v0, p0

    .line 216
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 217
    :pswitch_f
    check-cast v5, Ljava/lang/Class;

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    invoke-static {v7, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :pswitch_10
    const/4 v7, 0x0

    .line 218
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_8f
    :goto_e
    if-ne v2, v3, :cond_90

    .line 219
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v0, v5, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    :cond_90
    move-object/from16 v6, v34

    if-ne v4, v6, :cond_91

    .line 220
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v0, v5, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    :cond_91
    const/4 v7, 0x0

    .line 221
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :goto_f
    if-ne v2, v3, :cond_92

    .line 222
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_92
    if-ne v4, v6, :cond_93

    .line 223
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_93
    const/4 v7, 0x0

    .line 224
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :goto_10
    if-ne v4, v3, :cond_94

    .line 225
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_94
    if-ne v4, v6, :cond_95

    .line 226
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_95
    const/4 v7, 0x0

    .line 227
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_96
    move-object/from16 v6, v34

    move-object/from16 v0, v41

    :goto_11
    if-ne v4, v3, :cond_97

    .line 228
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_97
    if-ne v4, v6, :cond_98

    .line 229
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_98
    const/4 v7, 0x0

    .line 230
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_99
    move-object/from16 v6, v34

    move-object/from16 v0, v40

    :goto_12
    if-ne v4, v3, :cond_9a

    .line 231
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_9a
    if-ne v4, v6, :cond_9b

    .line 232
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;

    check-cast v5, Ljava/lang/Class;

    invoke-direct {v1, v5, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v1

    :cond_9b
    const/4 v7, 0x0

    .line 233
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_9c
    move-object/from16 v0, p0

    const/4 v6, 0x3

    .line 234
    instance-of v2, v1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v2, :cond_9d

    .line 235
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪苏世;

    check-cast v1, Ljava/lang/reflect/GenericArrayType;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪苏世;-><init>(Ljava/lang/reflect/GenericArrayType;)V

    return-object v0

    .line 236
    :cond_9d
    instance-of v2, v1, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_9e

    .line 237
    move-object v2, v1

    check-cast v2, Ljava/lang/reflect/WildcardType;

    invoke-interface {v2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 238
    array-length v3, v2

    const/4 v7, 0x1

    if-ne v3, v7, :cond_9e

    const/4 v3, 0x0

    .line 239
    aget-object v1, v2, v3

    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    :cond_9e
    const/4 v3, 0x0

    .line 240
    const-class v0, Ljava/lang/reflect/ParameterizedType;

    if-ne v1, v0, :cond_9f

    .line 241
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    move-result-object v1

    .line 243
    const-class v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏楪兰;

    invoke-virtual {v0, v2, v2, v3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 244
    :cond_9f
    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v2, "javax.money.NumberValue"

    sparse-switch v0, :sswitch_data_3

    :goto_13
    move/from16 v8, v26

    goto/16 :goto_14

    :sswitch_15
    const-string v0, "org.joda.time.Chronology"

    move-object/from16 v3, v35

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a0

    goto :goto_13

    :cond_a0
    const/16 v8, 0x36

    goto/16 :goto_14

    :sswitch_16
    move-object/from16 v3, v35

    const-string v0, "com.google.common.collect.RegularImmutableSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a1

    goto :goto_13

    :cond_a1
    const/16 v8, 0x35

    goto/16 :goto_14

    :sswitch_17
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TDoubleArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a2

    goto :goto_13

    :cond_a2
    const/16 v8, 0x34

    goto/16 :goto_14

    :sswitch_18
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.LongArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a3

    goto :goto_13

    :cond_a3
    const/16 v8, 0x33

    goto/16 :goto_14

    :sswitch_19
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.set.hash.TByteHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a4

    goto :goto_13

    :cond_a4
    const/16 v8, 0x32

    goto/16 :goto_14

    :sswitch_1a
    move-object/from16 v3, v35

    const-string v0, "java.util.RegularEnumSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a5

    goto :goto_13

    :cond_a5
    const/16 v8, 0x31

    goto/16 :goto_14

    :sswitch_1b
    move-object/from16 v3, v35

    const-string v0, "javax.money.Money"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a6

    goto :goto_13

    :cond_a6
    const/16 v8, 0x30

    goto/16 :goto_14

    :sswitch_1c
    move-object/from16 v3, v35

    const-string v0, "org.bson.types.Decimal128"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a7

    goto :goto_13

    :cond_a7
    const/16 v8, 0x2f

    goto/16 :goto_14

    :sswitch_1d
    move-object/from16 v3, v35

    const-string v0, "java.lang.Throwable"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a8

    goto/16 :goto_13

    :cond_a8
    const/16 v8, 0x2e

    goto/16 :goto_14

    :sswitch_1e
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TByteArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a9

    goto/16 :goto_13

    :cond_a9
    const/16 v8, 0x2d

    goto/16 :goto_14

    :sswitch_1f
    move-object/from16 v3, v35

    const-string v0, "java.net.InetSocketAddress"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_aa

    goto/16 :goto_13

    :cond_aa
    const/16 v8, 0x2c

    goto/16 :goto_14

    :sswitch_20
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TIntArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ab

    goto/16 :goto_13

    :cond_ab
    const/16 v8, 0x2b

    goto/16 :goto_14

    :sswitch_21
    move-object/from16 v3, v35

    const-string v0, "java.text.SimpleDateFormat"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ac

    goto/16 :goto_13

    :cond_ac
    const/16 v8, 0x2a

    goto/16 :goto_14

    :sswitch_22
    move-object/from16 v3, v35

    const-string v0, "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ad

    goto/16 :goto_13

    :cond_ad
    const/16 v8, 0x29

    goto/16 :goto_14

    :sswitch_23
    move-object/from16 v3, v35

    const-string v0, "org.joda.time.LocalDateTime"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ae

    goto/16 :goto_13

    :cond_ae
    const/16 v8, 0x28

    goto/16 :goto_14

    :sswitch_24
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.IntHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_af

    goto/16 :goto_13

    :cond_af
    const/16 v8, 0x27

    goto/16 :goto_14

    :sswitch_25
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.FloatArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b0

    goto/16 :goto_13

    :cond_b0
    const/16 v8, 0x26

    goto/16 :goto_14

    :sswitch_26
    move-object/from16 v3, v35

    const-string v0, "java.sql.Timestamp"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b1

    goto/16 :goto_13

    :cond_b1
    const/16 v8, 0x25

    goto/16 :goto_14

    :sswitch_27
    move-object/from16 v3, v35

    const-string v0, "javax.money.MonetaryAmount"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b2

    goto/16 :goto_13

    :cond_b2
    const/16 v8, 0x24

    goto/16 :goto_14

    :sswitch_28
    move-object/from16 v3, v35

    const-string v0, "org.joda.time.DateTime"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b3

    goto/16 :goto_13

    :cond_b3
    const/16 v8, 0x23

    goto/16 :goto_14

    :sswitch_29
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TFloatArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b4

    goto/16 :goto_13

    :cond_b4
    const/16 v8, 0x22

    goto/16 :goto_14

    :sswitch_2a
    move-object/from16 v3, v35

    const-string v0, "java.sql.Time"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b5

    goto/16 :goto_13

    :cond_b5
    const/16 v8, 0x21

    goto/16 :goto_14

    :sswitch_2b
    move-object/from16 v3, v35

    const-string v0, "java.sql.Date"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b6

    goto/16 :goto_13

    :cond_b6
    const/16 v8, 0x20

    goto/16 :goto_14

    :sswitch_2c
    move-object/from16 v3, v35

    const-string v0, "org.apache.commons.lang3.tuple.ImmutablePair"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b7

    goto/16 :goto_13

    :cond_b7
    const/16 v8, 0x1f

    goto/16 :goto_14

    :sswitch_2d
    move-object/from16 v3, v35

    const-string v0, "com.google.common.collect.ImmutableSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b8

    goto/16 :goto_13

    :cond_b8
    const/16 v8, 0x1e

    goto/16 :goto_14

    :sswitch_2e
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TCharArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b9

    goto/16 :goto_13

    :cond_b9
    const/16 v8, 0x1d

    goto/16 :goto_14

    :sswitch_2f
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.set.hash.TLongHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ba

    goto/16 :goto_13

    :cond_ba
    const/16 v8, 0x1c

    goto/16 :goto_14

    :sswitch_30
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.ByteArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_bb

    goto/16 :goto_13

    :cond_bb
    const/16 v8, 0x1b

    goto/16 :goto_14

    :sswitch_31
    move-object/from16 v3, v35

    const-string v0, "java.lang.IllegalStateException"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_bc

    goto/16 :goto_13

    :cond_bc
    const/16 v8, 0x1a

    goto/16 :goto_14

    :sswitch_32
    move-object/from16 v3, v35

    const-string v0, "java.lang.Exception"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_bd

    goto/16 :goto_13

    :cond_bd
    const/16 v8, 0x19

    goto/16 :goto_14

    :sswitch_33
    move-object/from16 v3, v35

    const-string v0, "org.joda.time.Instant"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_be

    goto/16 :goto_13

    :cond_be
    const/16 v8, 0x18

    goto/16 :goto_14

    :sswitch_34
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.DoubleArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_bf

    goto/16 :goto_13

    :cond_bf
    const/16 v8, 0x17

    goto/16 :goto_14

    :sswitch_35
    move-object/from16 v3, v35

    const-string v0, "org.apache.commons.lang3.tuple.Pair"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c0

    goto/16 :goto_13

    :cond_c0
    const/16 v8, 0x16

    goto/16 :goto_14

    :sswitch_36
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.ShortArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c1

    goto/16 :goto_13

    :cond_c1
    const/16 v8, 0x15

    goto/16 :goto_14

    :sswitch_37
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.set.hash.TIntHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c2

    goto/16 :goto_13

    :cond_c2
    const/16 v8, 0x14

    goto/16 :goto_14

    :sswitch_38
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TShortArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c3

    goto/16 :goto_13

    :cond_c3
    const/16 v8, 0x13

    goto/16 :goto_14

    :sswitch_39
    move-object/from16 v3, v35

    const-string v0, "java.nio.ByteBuffer"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c4

    goto/16 :goto_13

    :cond_c4
    const/16 v8, 0x12

    goto/16 :goto_14

    :sswitch_3a
    move-object/from16 v3, v35

    const-string v0, "java.nio.HeapByteBuffer"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c5

    goto/16 :goto_13

    :cond_c5
    const/16 v8, 0x11

    goto/16 :goto_14

    :sswitch_3b
    move-object/from16 v3, v35

    const-string v0, "com.google.common.collect.SingletonImmutableSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c6

    goto/16 :goto_13

    :cond_c6
    const/16 v8, 0x10

    goto/16 :goto_14

    :sswitch_3c
    move-object/from16 v3, v35

    const-string v0, "java.net.InetAddress"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c7

    goto/16 :goto_13

    :cond_c7
    const/16 v8, 0xf

    goto/16 :goto_14

    :sswitch_3d
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.list.array.TLongArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c8

    goto/16 :goto_13

    :cond_c8
    const/16 v8, 0xe

    goto/16 :goto_14

    :sswitch_3e
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.IntArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c9

    goto/16 :goto_13

    :cond_c9
    const/16 v8, 0xd

    goto/16 :goto_14

    :sswitch_3f
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.CharArrayList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ca

    goto/16 :goto_13

    :cond_ca
    const/16 v8, 0xc

    goto/16 :goto_14

    :sswitch_40
    move-object/from16 v3, v35

    const-string v0, "javax.money.CurrencyUnit"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_cb

    goto/16 :goto_13

    :cond_cb
    const/16 v8, 0xb

    goto/16 :goto_14

    :sswitch_41
    move-object/from16 v3, v35

    const-string v0, "java.util.JumboEnumSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_cc

    goto/16 :goto_13

    :cond_cc
    const/16 v8, 0xa

    goto/16 :goto_14

    :sswitch_42
    move-object/from16 v3, v35

    const-string v0, "java.io.UncheckedIOException"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_cd

    goto/16 :goto_13

    :cond_cd
    move/from16 v8, v19

    goto/16 :goto_14

    :sswitch_43
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.CharHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_ce

    goto/16 :goto_13

    :cond_ce
    move/from16 v8, v20

    goto/16 :goto_14

    :sswitch_44
    move-object/from16 v3, v35

    const-string v0, "gnu.trove.set.hash.TShortHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_cf

    goto/16 :goto_13

    :cond_cf
    move/from16 v8, v21

    goto/16 :goto_14

    :sswitch_45
    move-object/from16 v3, v35

    const-string v0, "com.carrotsearch.hppc.LongHashSet"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d0

    goto/16 :goto_13

    :cond_d0
    move/from16 v8, v22

    goto :goto_14

    :sswitch_46
    move-object/from16 v3, v35

    const-string v0, "org.joda.time.LocalDate"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d1

    goto/16 :goto_13

    :cond_d1
    const/4 v8, 0x5

    goto :goto_14

    :sswitch_47
    move-object/from16 v3, v35

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d2

    goto/16 :goto_13

    :cond_d2
    move/from16 v8, v24

    goto :goto_14

    :sswitch_48
    move-object/from16 v3, v35

    const-string v0, "com.google.common.collect.ImmutableList"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d3

    goto/16 :goto_13

    :cond_d3
    move v8, v6

    goto :goto_14

    :sswitch_49
    move-object/from16 v3, v35

    const-string v0, "java.io.IOException"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d4

    goto/16 :goto_13

    :cond_d4
    const/4 v8, 0x2

    goto :goto_14

    :sswitch_4a
    move-object/from16 v3, v35

    const-string v0, "java.lang.RuntimeException"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d5

    goto/16 :goto_13

    :cond_d5
    const/4 v8, 0x1

    goto :goto_14

    :sswitch_4b
    move-object/from16 v3, v35

    const-string v0, "java.awt.Color"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d6

    goto/16 :goto_13

    :cond_d6
    const/4 v8, 0x0

    :goto_14
    packed-switch v8, :pswitch_data_3

    goto/16 :goto_2

    .line 245
    :pswitch_11
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 246
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰苏哲;-><init>(Ljava/lang/Class;)V

    return-object v1

    .line 247
    :pswitch_12
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;

    check-cast v1, Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰哲苏;-><init>(Ljava/lang/Class;)V

    return-object v0

    .line 248
    :pswitch_13
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    new-instance v8, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    const/16 v0, 0x12

    invoke-direct {v8, v0}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 249
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-class v2, Ljava/lang/String;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;-><init>(Ljava/lang/reflect/Type;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 250
    :pswitch_14
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 251
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;

    const/4 v7, 0x1

    invoke-direct {v1, v0, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/Class;I)V

    return-object v1

    .line 252
    :pswitch_15
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    .line 253
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲苏兰;

    const/4 v7, 0x0

    .line 254
    invoke-direct {v0, v7, v7}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0

    .line 255
    :pswitch_16
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    if-nez v0, :cond_d7

    .line 256
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 257
    :cond_d7
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    if-nez v0, :cond_d8

    .line 258
    const-string v0, "javax.money.CurrencyUnit"

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 259
    :cond_d8
    :try_start_2
    const-class v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;

    const-string v1, "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2"

    filled-new-array {v13, v13}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 260
    const-string v1, "currency"

    const-string v2, "number"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 261
    sget-object v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    .line 262
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 263
    new-instance v14, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    invoke-direct {v14, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/String;)V

    .line 264
    const-class v15, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;

    const-class v16, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;

    const-string v17, "currency"

    sget-object v24, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    const-string v26, "currency"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v24

    .line 265
    invoke-static/range {v15 .. v28}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;

    move-result-object v0

    .line 266
    const-class v15, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;

    const-class v16, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;

    const-string v17, "number"

    sget-object v24, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    const-string v26, "number"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v24

    .line 267
    invoke-static/range {v15 .. v28}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;

    move-result-object v1

    const/4 v2, 0x2

    .line 268
    new-array v15, v2, [Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    const/16 v32, 0x0

    aput-object v0, v15, v32

    const/16 v29, 0x1

    aput-object v1, v15, v29

    .line 269
    new-instance v8, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;[Ljava/lang/Class;[Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v8

    :catch_0
    move-exception v0

    .line 270
    const-string v1, "createMonetaryAmountReader error"

    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_15
    const/4 v7, 0x0

    return-object v7

    :pswitch_17
    const/4 v7, 0x0

    .line 271
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲兰苏;

    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    const/4 v2, 0x5

    .line 272
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 273
    invoke-direct {v0, v7, v7}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 274
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    return-object v0

    :pswitch_18
    const/4 v7, 0x0

    .line 275
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    .line 276
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏哲兰;

    .line 277
    invoke-direct {v0, v7, v7}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0

    :pswitch_19
    const/4 v7, 0x0

    .line 278
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    .line 279
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰哲苏世;

    .line 280
    invoke-direct {v0, v7, v7}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0

    .line 281
    :pswitch_1a
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 282
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏楪兰哲;

    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/Class;)V

    return-object v1

    .line 283
    :pswitch_1b
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;

    check-cast v1, Ljava/lang/Class;

    invoke-direct {v0, v1, v13, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v0

    .line 284
    :pswitch_1c
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    const/4 v7, 0x0

    invoke-direct {v0, v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;-><init>(Ljava/lang/String;Ljava/util/function/Function;)V

    return-object v0

    .line 285
    :pswitch_1d
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    new-instance v8, Lbsh/classpath/飘花落叶言子楪世哲兰苏;

    const/16 v0, 0x10

    invoke-direct {v8, v0}, Lbsh/classpath/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 286
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-class v2, Ljava/lang/String;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;-><init>(Ljava/lang/reflect/Type;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 287
    :pswitch_1e
    invoke-static {}, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;

    move-result-object v0

    return-object v0

    .line 288
    :pswitch_1f
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 289
    :pswitch_20
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;

    move-result-object v0

    return-object v0

    .line 290
    :pswitch_21
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    sget v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:I

    .line 291
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/Class;I)V

    return-object v1

    .line 292
    :pswitch_22
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    if-nez v0, :cond_d9

    .line 293
    const-string v0, "org.javamoney.moneta.spi.DefaultNumberValue"

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 294
    :cond_d9
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Ljava/lang/reflect/Method;

    if-nez v0, :cond_da

    .line 295
    :try_start_3
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    const-string v1, "of"

    filled-new-array/range {v33 .. v33}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Ljava/lang/reflect/Method;
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_16

    :catch_1
    move-exception v0

    .line 296
    const-string v1, "method not found : org.javamoney.moneta.spi.DefaultNumberValue.of"

    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 v31, 0x0

    return-object v31

    .line 297
    :cond_da
    :goto_16
    sget-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    if-nez v0, :cond_db

    .line 298
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 299
    :cond_db
    sget-object v7, L飘花落叶言楪子哲苏兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Ljava/lang/reflect/Method;

    .line 300
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-class v2, Ljava/math/BigDecimal;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;-><init>(Ljava/lang/reflect/Type;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    :pswitch_23
    const/4 v7, 0x0

    .line 301
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 302
    :pswitch_24
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏世兰;

    check-cast v1, Ljava/lang/Class;

    .line 303
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲兰世楪;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲兰世楪;-><init>(I)V

    .line 304
    sget-object v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 305
    const-string v5, "stackTrace"

    const-class v6, [Ljava/lang/StackTraceElement;

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v7, v6

    invoke-static/range {v3 .. v17}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    move-result-object v3

    .line 306
    filled-new-array {v3}, [Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    move-result-object v3

    .line 307
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪苏世兰;-><init>(Ljava/lang/Class;Ljava/util/List;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;)V

    return-object v0

    .line 308
    :pswitch_25
    :try_start_4
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    move-object/from16 v1, v48

    filled-new-array {v1, v1, v1, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 309
    sget-object v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;

    const-string v2, "r"

    const-string v3, "g"

    const-string v4, "b"

    const-string v5, "alpha"

    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    :goto_17
    return-object v31

    .line 310
    :cond_dc
    :goto_18
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 311
    :goto_19
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 312
    :goto_1a
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 313
    :goto_1b
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 314
    :goto_1c
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 315
    :goto_1d
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 316
    :goto_1e
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 317
    :cond_dd
    :goto_1f
    :try_start_5
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    .line 318
    new-instance v4, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;

    const-class v5, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v1

    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世苏兰哲;-><init>(Ljava/lang/reflect/Type;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2

    return-object v4

    :catch_2
    move-exception v0

    .line 320
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    goto/16 :goto_15

    .line 321
    :cond_de
    :goto_20
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏楪兰;

    return-object v0

    .line 322
    :goto_21
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v2, v7, v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 323
    :goto_22
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v14, v7, v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 324
    :goto_23
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0, v12, v7, v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    move-result-object v0

    return-object v0

    .line 325
    :goto_24
    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    const-wide/16 v2, 0x0

    invoke-static {v7, v0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    move-result-object v0

    return-object v0

    .line 326
    :cond_df
    :goto_25
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 327
    :cond_e0
    :goto_26
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 328
    :cond_e1
    :goto_27
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏哲兰世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 329
    :cond_e2
    :goto_28
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 330
    :cond_e3
    :goto_29
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏世楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏世楪;

    return-object v0

    .line 331
    :cond_e4
    :goto_2a
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪兰苏;

    return-object v0

    .line 332
    :cond_e5
    :goto_2b
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 333
    :cond_e6
    :goto_2c
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    .line 334
    :cond_e7
    :goto_2d
    sget-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪哲兰苏世:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲楪苏世;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77c5ffff -> :sswitch_a
        -0x6a7c71fa -> :sswitch_9
        -0x648d55e3 -> :sswitch_8
        -0x25e474d9 -> :sswitch_7
        -0x24dcfefa -> :sswitch_6
        -0xeb491b5 -> :sswitch_5
        -0x9e7ba9a -> :sswitch_4
        0x1d899909 -> :sswitch_3
        0x278b30c9 -> :sswitch_2
        0x4a6300ea -> :sswitch_1
        0x5f84b54d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x64f58121 -> :sswitch_10
        -0x9e7ba9a -> :sswitch_f
        -0x82e223b -> :sswitch_e
        0x35fc9059 -> :sswitch_d
        0x371ffcf1 -> :sswitch_c
        0x79522977 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x766adabf -> :sswitch_14
        -0x289861d4 -> :sswitch_13
        0x221f1e57 -> :sswitch_12
        0x35fca75f -> :sswitch_11
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_10
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x7c78d479 -> :sswitch_4b
        -0x7a3f8f55 -> :sswitch_4a
        -0x77d84db3 -> :sswitch_49
        -0x766adabf -> :sswitch_48
        -0x75d131fe -> :sswitch_47
        -0x7295bf66 -> :sswitch_46
        -0x68ba7345 -> :sswitch_45
        -0x644c0dfa -> :sswitch_44
        -0x6393895f -> :sswitch_43
        -0x58f8d9c9 -> :sswitch_42
        -0x541731ee -> :sswitch_41
        -0x4b6349e5 -> :sswitch_40
        -0x338dde7c -> :sswitch_3f
        -0x328cea9b -> :sswitch_3e
        -0x3031dac2 -> :sswitch_3d
        -0x2aec35fd -> :sswitch_3c
        -0x289861d4 -> :sswitch_3b
        -0x217c6306 -> :sswitch_3a
        -0x209f6312 -> :sswitch_39
        -0x1abe1be8 -> :sswitch_38
        -0x1463c54d -> :sswitch_37
        -0xe4f93c8 -> :sswitch_36
        -0x82e223b -> :sswitch_35
        -0x79e4957 -> :sswitch_34
        -0xaeafe -> :sswitch_33
        0x455697b -> :sswitch_32
        0x4818f00 -> :sswitch_31
        0x5f99c12 -> :sswitch_30
        0xcfdbeea -> :sswitch_2f
        0x26e22da4 -> :sswitch_2e
        0x35fca75f -> :sswitch_2d
        0x371ffcf1 -> :sswitch_2c
        0x40d5de3a -> :sswitch_2b
        0x40dd4159 -> :sswitch_2a
        0x43dae238 -> :sswitch_29
        0x4872249a -> :sswitch_28
        0x4a5511eb -> :sswitch_27
        0x4aad720a -> :sswitch_26
        0x50496a58 -> :sswitch_25
        0x532aeec2 -> :sswitch_24
        0x56ec2a87 -> :sswitch_23
        0x5b0f3e73 -> :sswitch_22
        0x5bc5408c -> :sswitch_21
        0x5cc10545 -> :sswitch_20
        0x5e7d83d0 -> :sswitch_1f
        0x6069a832 -> :sswitch_1e
        0x612cf26c -> :sswitch_1d
        0x61f056af -> :sswitch_1c
        0x6456ce9a -> :sswitch_1b
        0x6d0b6e25 -> :sswitch_1a
        0x70c56ede -> :sswitch_19
        0x755e191e -> :sswitch_18
        0x76ff3ac9 -> :sswitch_17
        0x7952407d -> :sswitch_16
        0x7bff4017 -> :sswitch_15
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_24
        :pswitch_1f
        :pswitch_1e
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1d
        :pswitch_23
        :pswitch_1c
        :pswitch_1c
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_1b
        :pswitch_20
        :pswitch_1a
        :pswitch_24
        :pswitch_24
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_23
        :pswitch_1b
        :pswitch_19
        :pswitch_18
        :pswitch_20
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_20
        :pswitch_20
        :pswitch_14
        :pswitch_23
        :pswitch_13
        :pswitch_20
        :pswitch_12
        :pswitch_20
        :pswitch_24
        :pswitch_20
        :pswitch_16
        :pswitch_1f
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_23
        :pswitch_11
    .end packed-switch
.end method

.method public static 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Ljava/lang/Enum;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "values"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    array-length v1, v0

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    move-object v5, v2

    .line 39
    move v4, v3

    .line 40
    move v6, v4

    .line 41
    :goto_0
    const/4 v7, 0x1

    .line 42
    if-ge v4, v1, :cond_6

    .line 43
    .line 44
    aget-object v5, v0, v4

    .line 45
    .line 46
    invoke-interface {v5}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    const-class v9, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;

    .line 51
    .line 52
    invoke-static {v5, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    check-cast v9, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;

    .line 57
    .line 58
    if-ne v9, v5, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    const-string v11, "com.fasterxml.jackson.annotation.JsonCreator"

    .line 66
    .line 67
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-nez v11, :cond_4

    .line 72
    .line 73
    const-string v11, "com.alibaba.fastjson.annotation.JSONCreator"

    .line 74
    .line 75
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-nez v10, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    new-instance v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;

    .line 83
    .line 84
    invoke-direct {v6, v5, p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;-><init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v8, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 88
    .line 89
    .line 90
    :goto_1
    move v6, v7

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    sget-boolean v10, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 93
    .line 94
    if-eqz v10, :cond_5

    .line 95
    .line 96
    new-instance v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;

    .line 97
    .line 98
    invoke-direct {v6, v5, p1, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;-><init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v8, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    move-object v5, v9

    .line 108
    goto :goto_0

    .line 109
    :cond_6
    if-eqz v5, :cond_8

    .line 110
    .line 111
    invoke-interface {v5}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;->parameterNames()[Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    array-length v1, v0

    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    iput-object v0, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 119
    .line 120
    :cond_7
    move v6, v7

    .line 121
    :cond_8
    if-nez v6, :cond_9

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_9
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p2, p0, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :catch_0
    if-eqz v2, :cond_a

    .line 133
    .line 134
    iput-object v2, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲:Ljava/lang/reflect/Method;

    .line 135
    .line 136
    :cond_a
    :goto_3
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世兰楪;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v0, p0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    if-ge v1, v0, :cond_7

    .line 17
    .line 18
    aget-object v3, p0, v1

    .line 19
    .line 20
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-class v5, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-eqz v5, :cond_3

    .line 34
    .line 35
    invoke-interface {v5}, L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲苏兰;->parameterNames()[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    array-length v7, v2

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    iput-object v2, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;

    .line 43
    .line 44
    :cond_1
    if-ne v5, v3, :cond_2

    .line 45
    .line 46
    :goto_1
    move v2, v6

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v2, v6

    .line 49
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const-string v7, "com.fasterxml.jackson.annotation.JsonCreator"

    .line 54
    .line 55
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_5

    .line 60
    .line 61
    const-string v7, "com.alibaba.fastjson.annotation.JSONCreator"

    .line 62
    .line 63
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-nez v7, :cond_4

    .line 68
    .line 69
    const-string v7, "\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u4e16\u5170\u82cf\u54f2.\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170"

    .line 70
    .line 71
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    new-instance v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;

    .line 79
    .line 80
    const/4 v5, 0x2

    .line 81
    invoke-direct {v2, v3, p1, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;-><init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    sget-boolean v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Z

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_7
    if-nez v2, :cond_8

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p2, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 104
    .line 105
    .line 106
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_3

    .line 108
    :catch_0
    const/4 p0, 0x0

    .line 109
    :goto_3
    if-eqz p0, :cond_9

    .line 110
    .line 111
    iput-object p0, p1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/reflect/Constructor;

    .line 112
    .line 113
    :cond_9
    :goto_4
    return-void
.end method
