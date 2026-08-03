.class public final La/x0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    const/4 v3, 0x4

    const-string v4, "bridge"

    invoke-static {v0, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, La/Pe;->b(I)I

    move-result v4

    if-eqz v4, :cond_0

    iget-object v5, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v1, La/Pe;->a:I

    add-int/2addr v4, v6

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    :cond_0
    const/4 v4, 0x6

    invoke-virtual {v1, v4}, La/Pe;->b(I)I

    move-result v5

    if-eqz v5, :cond_1

    iget-object v6, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v7, v1, La/Pe;->a:I

    add-int/2addr v5, v7

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    :cond_1
    const/16 v5, 0x8

    invoke-virtual {v1, v5}, La/Pe;->b(I)I

    move-result v5

    if-eqz v5, :cond_2

    iget v7, v1, La/Pe;->a:I

    add-int/2addr v5, v7

    invoke-virtual {v1, v5}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    const/16 v7, 0xa

    invoke-virtual {v1, v7}, La/Pe;->b(I)I

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    iget-object v9, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v10, v1, La/Pe;->a:I

    add-int/2addr v7, v10

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    goto :goto_1

    :cond_3
    move v7, v8

    :goto_1
    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    if-ne v7, v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v9, 0x2

    if-ne v7, v9, :cond_6

    goto :goto_2

    :cond_6
    const/4 v9, 0x3

    if-ne v7, v9, :cond_16

    :goto_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/16 v9, 0xc

    invoke-virtual {v1, v9}, La/Pe;->b(I)I

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v1, v10}, La/Pe;->f(I)I

    move-result v10

    goto :goto_3

    :cond_7
    move v10, v8

    :goto_3
    move v11, v8

    :goto_4
    if-ge v11, v10, :cond_15

    new-instance v12, La/a;

    invoke-direct {v12}, La/Pe;-><init>()V

    invoke-virtual {v1, v9}, La/Pe;->b(I)I

    move-result v13

    const-string v14, "bb"

    if-eqz v13, :cond_8

    invoke-virtual {v1, v13}, La/Pe;->e(I)I

    move-result v13

    mul-int/lit8 v15, v11, 0x4

    add-int/2addr v15, v13

    invoke-virtual {v1, v15}, La/Pe;->a(I)I

    move-result v13

    iget-object v15, v1, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-static {v15, v14}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v13, v15}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    :goto_5
    invoke-static {v12}, La/i9;->b(Ljava/lang/Object;)V

    new-instance v13, La/a;

    invoke-direct {v13}, La/Pe;-><init>()V

    invoke-virtual {v12, v4}, La/Pe;->b(I)I

    move-result v15

    move/from16 v16, v2

    if-eqz v15, :cond_9

    iget v2, v12, La/Pe;->a:I

    add-int/2addr v15, v2

    invoke-virtual {v12, v15}, La/Pe;->a(I)I

    move-result v2

    iget-object v15, v12, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-static {v15, v14}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v2, v15}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_6

    :cond_9
    const/4 v13, 0x0

    :goto_6
    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }"

    invoke-static {v13, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La/z0;

    invoke-virtual {v12, v3}, La/Pe;->b(I)I

    move-result v14

    if-eqz v14, :cond_a

    iget v15, v12, La/Pe;->a:I

    add-int/2addr v14, v15

    invoke-virtual {v12, v14}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_7

    :cond_a
    const/4 v12, 0x0

    :goto_7
    invoke-static {v12}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v13, v4}, La/Pe;->b(I)I

    move-result v14

    if-eqz v14, :cond_b

    iget-object v15, v13, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v4, v13, La/Pe;->a:I

    add-int/2addr v14, v4

    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    goto :goto_8

    :cond_b
    move v4, v8

    :goto_8
    invoke-static {v4}, La/C0$a;->a(B)La/C0;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, La/Ob;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v14, La/e;

    invoke-direct {v14}, La/e;-><init>()V

    invoke-virtual {v13, v14}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v13

    const-string v14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {v13, v14}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, La/e;

    invoke-virtual {v13, v3}, La/Pe;->b(I)I

    move-result v14

    if-eqz v14, :cond_c

    int-to-byte v15, v8

    iget-object v6, v13, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v13, v13, La/Pe;->a:I

    add-int/2addr v14, v13

    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    if-eq v15, v6, :cond_c

    move/from16 v6, v16

    goto :goto_9

    :cond_c
    move v6, v8

    :goto_9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_1
    new-instance v6, La/l;

    invoke-direct {v6}, La/l;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/l;

    goto/16 :goto_12

    :pswitch_2
    new-instance v6, La/c;

    invoke-direct {v6}, La/c;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/c;

    invoke-static {v0, v6}, La/x0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_3
    new-instance v6, La/b;

    invoke-direct {v6}, La/b;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/b;

    invoke-static {v0, v6}, La/A0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/b;)La/A0;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_4
    new-instance v6, La/o;

    invoke-direct {v6}, La/o;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/o;

    invoke-static {v0, v6}, La/r6$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_5
    new-instance v6, La/p;

    invoke-direct {v6}, La/p;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/p;

    invoke-static {v0, v6}, La/lb$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_6
    new-instance v6, La/d;

    invoke-direct {v6}, La/d;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/d;

    invoke-static {v0, v6}, La/b3$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/d;)La/b3;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_7
    new-instance v6, La/n;

    invoke-direct {v6}, La/n;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/n;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_d

    iget v14, v6, La/Pe;->a:I

    add-int/2addr v13, v14

    invoke-virtual {v6, v13}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :cond_d
    const/4 v6, 0x0

    :goto_a
    invoke-static {v6}, La/i9;->b(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_8
    new-instance v6, La/h;

    invoke-direct {v6}, La/h;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/h;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_e

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v13

    goto :goto_b

    :cond_e
    const-wide/16 v13, 0x0

    :goto_b
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_9
    new-instance v6, La/i;

    invoke-direct {v6}, La/i;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/i;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_f

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getFloat(I)F

    move-result v6

    goto :goto_c

    :cond_f
    const/4 v6, 0x0

    :goto_c
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_a
    new-instance v6, La/k;

    invoke-direct {v6}, La/k;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/k;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_10

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v13

    goto :goto_d

    :cond_10
    const-wide/16 v13, 0x0

    :goto_d
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_b
    new-instance v6, La/j;

    invoke-direct {v6}, La/j;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/j;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_11

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    goto :goto_e

    :cond_11
    move v6, v8

    :goto_e
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_12

    :pswitch_c
    new-instance v6, La/g;

    invoke-direct {v6}, La/g;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/g;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_12

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    goto :goto_f

    :cond_12
    move v6, v8

    :goto_f
    invoke-static {v6}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    goto :goto_12

    :pswitch_d
    new-instance v6, La/m;

    invoke-direct {v6}, La/m;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/m;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_13

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v6

    goto :goto_10

    :cond_13
    move v6, v8

    :goto_10
    invoke-static {v6}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    goto :goto_12

    :pswitch_e
    new-instance v6, La/f;

    invoke-direct {v6}, La/f;-><init>()V

    invoke-virtual {v13, v6}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v6

    const-string v13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {v6, v13}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, La/f;

    invoke-virtual {v6, v3}, La/Pe;->b(I)I

    move-result v13

    if-eqz v13, :cond_14

    iget-object v14, v6, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v6, v6, La/Pe;->a:I

    add-int/2addr v13, v6

    invoke-virtual {v14, v13}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    goto :goto_11

    :cond_14
    move v6, v8

    :goto_11
    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    :goto_12
    new-instance v13, La/B0;

    invoke-direct {v13, v6, v4}, La/B0;-><init>(Ljava/lang/Object;La/C0;)V

    invoke-direct {v2, v0, v12, v13}, La/z0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;La/B0;)V

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v16

    const/4 v4, 0x6

    goto/16 :goto_4

    :cond_15
    sget-object v1, La/Wf;->a:La/Wf;

    new-instance v1, La/x0;

    invoke-direct {v1, v0, v5, v7}, La/x0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v1

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown AnnotationVisibilityType: "

    invoke-static {v1, v7}, La/z;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
.end method
