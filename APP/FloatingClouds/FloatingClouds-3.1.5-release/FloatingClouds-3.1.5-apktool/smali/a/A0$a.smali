.class public final La/A0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lorg/luckypray/dexkit/DexKitBridge;La/b;)La/A0;
    .locals 10

    const-string v0, "bridge"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, La/Pe;->b(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, La/Pe;->f(I)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_e

    new-instance v5, La/a;

    invoke-direct {v5}, La/Pe;-><init>()V

    invoke-virtual {p1, v1}, La/Pe;->b(I)I

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-virtual {p1, v6}, La/Pe;->e(I)I

    move-result v6

    mul-int/lit8 v8, v4, 0x4

    add-int/2addr v8, v6

    invoke-virtual {p1, v8}, La/Pe;->a(I)I

    move-result v6

    iget-object v8, p1, La/Pe;->b:Ljava/nio/ByteBuffer;

    const-string v9, "bb"

    invoke-static {v8, v9}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6, v8}, La/Pe;->c(ILjava/nio/ByteBuffer;)V

    goto :goto_2

    :cond_1
    move-object v5, v7

    :goto_2
    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    const/4 v6, 0x6

    invoke-virtual {v5, v6}, La/Pe;->b(I)I

    move-result v6

    if-eqz v6, :cond_2

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v9, v5, La/Pe;->a:I

    add-int/2addr v6, v9

    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    goto :goto_3

    :cond_2
    move v6, v3

    :goto_3
    invoke-static {v6}, La/C0$a;->a(B)La/C0;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance p0, La/Ob;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v7, La/e;

    invoke-direct {v7}, La/e;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/e;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_3

    int-to-byte v8, v3

    iget-object v9, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    if-eq v8, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_4

    :cond_3
    move v5, v3

    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_1
    new-instance v7, La/l;

    invoke-direct {v7}, La/l;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/l;

    goto/16 :goto_10

    :pswitch_2
    new-instance v7, La/c;

    invoke-direct {v7}, La/c;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/c;

    invoke-static {p0, v5}, La/x0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/c;)La/x0;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_3
    new-instance v7, La/b;

    invoke-direct {v7}, La/b;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/b;

    invoke-static {p0, v5}, La/A0$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/b;)La/A0;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_4
    new-instance v7, La/o;

    invoke-direct {v7}, La/o;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/o;

    invoke-static {p0, v5}, La/r6$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/o;)La/r6;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_5
    new-instance v7, La/p;

    invoke-direct {v7}, La/p;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/p;

    invoke-static {p0, v5}, La/lb$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/p;)La/lb;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_6
    new-instance v7, La/d;

    invoke-direct {v7}, La/d;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/d;

    invoke-static {p0, v5}, La/b3$a;->a(Lorg/luckypray/dexkit/DexKitBridge;La/d;)La/b3;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_7
    new-instance v8, La/n;

    invoke-direct {v8}, La/n;-><init>()V

    invoke-virtual {v5, v8}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {v5, v8}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/n;

    :try_start_0
    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v8

    if-eqz v8, :cond_4

    iget v9, v5, La/Pe;->a:I

    add-int/2addr v8, v9

    invoke-virtual {v5, v8}, La/Pe;->d(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_4
    move-object v8, v7

    :goto_5
    invoke-static {v8}, La/i9;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v8

    goto/16 :goto_10

    :catch_0
    :try_start_1
    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v8

    if-nez v8, :cond_5

    goto :goto_6

    :cond_5
    iget-object v7, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v7

    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v5, v8}, La/Pe;->e(I)I

    move-result v9

    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v5, v8}, La/Pe;->f(I)I

    move-result v5

    add-int/2addr v5, v9

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :goto_6
    const-string v5, "__vector_as_bytebuffer(4, 1)"

    invoke-static {v7, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, La/n9;->n(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/n9;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v5

    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_7
    invoke-static {v5}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_6

    goto :goto_8

    :cond_6
    const-string v5, ""

    :goto_8
    check-cast v5, Ljava/lang/String;

    goto/16 :goto_10

    :pswitch_8
    new-instance v7, La/h;

    invoke-direct {v7}, La/h;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/h;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_7

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v7

    goto :goto_9

    :cond_7
    const-wide/16 v7, 0x0

    :goto_9
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_9
    new-instance v7, La/i;

    invoke-direct {v7}, La/i;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/i;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_8

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    move-result v5

    goto :goto_a

    :cond_8
    const/4 v5, 0x0

    :goto_a
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_a
    new-instance v7, La/k;

    invoke-direct {v7}, La/k;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/k;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_9

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v7

    goto :goto_b

    :cond_9
    const-wide/16 v7, 0x0

    :goto_b
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_b
    new-instance v7, La/j;

    invoke-direct {v7}, La/j;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/j;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_a

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    goto :goto_c

    :cond_a
    move v5, v3

    :goto_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_10

    :pswitch_c
    new-instance v7, La/g;

    invoke-direct {v7}, La/g;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/g;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_b

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v5

    goto :goto_d

    :cond_b
    move v5, v3

    :goto_d
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    goto :goto_10

    :pswitch_d
    new-instance v7, La/m;

    invoke-direct {v7}, La/m;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/m;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_c

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v5

    goto :goto_e

    :cond_c
    move v5, v3

    :goto_e
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    goto :goto_10

    :pswitch_e
    new-instance v7, La/f;

    invoke-direct {v7}, La/f;-><init>()V

    invoke-virtual {v5, v7}, La/a;->l(La/Pe;)La/Pe;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {v5, v7}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, La/f;

    invoke-virtual {v5, v1}, La/Pe;->b(I)I

    move-result v7

    if-eqz v7, :cond_d

    iget-object v8, v5, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v5, v5, La/Pe;->a:I

    add-int/2addr v7, v5

    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    goto :goto_f

    :cond_d
    move v5, v3

    :goto_f
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    :goto_10
    const-string v7, "when (type) {\n          \u2026lue\n                    }"

    invoke-static {v5, v7}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, La/B0;

    invoke-direct {v7, v5, v6}, La/B0;-><init>(Ljava/lang/Object;La/C0;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_e
    new-instance p1, La/A0;

    invoke-direct {p1, p0, v0}, La/A0;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/ArrayList;)V

    return-object p1

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
