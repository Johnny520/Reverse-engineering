.class public final La/h5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;

.field public static final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    new-instance v0, La/mc;

    const-string v9, "boolean"

    const-string v10, "Z"

    invoke-direct {v0, v9, v10}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, La/mc;

    const-string v11, "byte"

    const-string v12, "B"

    invoke-direct {v1, v11, v12}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, La/mc;

    const-string v13, "char"

    const-string v14, "C"

    invoke-direct {v2, v13, v14}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, La/mc;

    const-string v15, "short"

    const-string v4, "S"

    invoke-direct {v3, v15, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v4

    new-instance v4, La/mc;

    const-string v6, "int"

    const-string v7, "I"

    invoke-direct {v4, v6, v7}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v5

    new-instance v5, La/mc;

    move-object/from16 v16, v15

    const-string v15, "float"

    move-object/from16 v17, v13

    const-string v13, "F"

    invoke-direct {v5, v15, v13}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v18, v6

    new-instance v6, La/mc;

    move-object/from16 v19, v13

    const-string v13, "long"

    move-object/from16 v20, v15

    const-string v15, "J"

    invoke-direct {v6, v13, v15}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v21, v7

    new-instance v7, La/mc;

    move-object/from16 v22, v13

    const-string v13, "double"

    move-object/from16 v23, v15

    const-string v15, "D"

    invoke-direct {v7, v13, v15}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v24, v8

    new-instance v8, La/mc;

    move-object/from16 v25, v13

    const-string v13, "void"

    move-object/from16 v26, v15

    const-string v15, "V"

    invoke-direct {v8, v13, v15}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v27, v18

    move-object/from16 v18, v15

    move-object/from16 v15, v27

    move-object/from16 v27, v13

    move-object/from16 v28, v21

    move-object/from16 v13, v24

    filled-new-array/range {v0 .. v8}, [La/mc;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0x9

    invoke-static {v2}, La/aa;->C(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v1, v0}, La/ba;->F(Ljava/util/LinkedHashMap;[La/mc;)V

    sput-object v1, La/h5;->a:Ljava/util/LinkedHashMap;

    new-instance v0, La/mc;

    invoke-direct {v0, v10, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, La/mc;

    invoke-direct {v1, v12, v11}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, La/mc;

    move-object/from16 v4, v17

    invoke-direct {v3, v14, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, La/mc;

    move-object/from16 v5, v16

    invoke-direct {v4, v13, v5}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, La/mc;

    move-object/from16 v6, v28

    invoke-direct {v5, v6, v15}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, La/mc;

    move-object/from16 v8, v19

    move-object/from16 v7, v20

    invoke-direct {v6, v8, v7}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, La/mc;

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    invoke-direct {v7, v9, v8}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, La/mc;

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    invoke-direct {v8, v10, v9}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, La/mc;

    move-object/from16 v11, v18

    move-object/from16 v10, v27

    invoke-direct {v9, v11, v10}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v29, v0

    move-object/from16 v30, v1

    move-object/from16 v31, v3

    move-object/from16 v32, v4

    move-object/from16 v33, v5

    move-object/from16 v34, v6

    move-object/from16 v35, v7

    move-object/from16 v36, v8

    move-object/from16 v37, v9

    filled-new-array/range {v29 .. v37}, [La/mc;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-static {v2}, La/aa;->C(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v1, v0}, La/ba;->F(Ljava/util/LinkedHashMap;[La/mc;)V

    sput-object v1, La/h5;->b:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "typeSign"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5b

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "(this as java.lang.String).substring(startIndex)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, La/h5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "[]"

    invoke-static {p0, v0}, La/z;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v3, :cond_2

    sget-object v0, La/h5;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown primitive typeSign: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2f

    const/16 v1, 0x2e

    invoke-static {p0, v0, v1}, La/Ae;->F(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown class sign: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "typeName"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, La/h5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "["

    invoke-static {v0, p0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, La/h5;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    const/16 v0, 0x2e

    const/16 v1, 0x2f

    invoke-static {p0, v0, v1}, La/Ae;->F(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p0

    const-string v0, "L"

    const-string v1, ";"

    invoke-static {v0, p0, v1}, La/z;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method
