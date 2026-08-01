.class public Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CreateClassVisitorFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/asm/ClassVisitorFactory<",
        "TS;>;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final byteBuddy:Lnet/bytebuddy/ByteBuddy;

.field private final classVisitor:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TS;>;",
            "Lnet/bytebuddy/ByteBuddy;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-virtual {p0}, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->run()Lnet/bytebuddy/asm/ClassVisitorFactory;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 1
    const-string v0, "delegate"

    const-class v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "attribute"

    const-string v4, "constants"

    const-string v5, "frames"

    const-string v6, "constant"

    const-string v7, "handle"

    const-string v8, "typePath"

    const-string v9, "labels"

    const-string v10, "label"

    const-class v11, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    const-class v12, Lnet/bytebuddy/jar/asm/Type;

    const-class v13, Lnet/bytebuddy/jar/asm/ClassVisitor;

    const-class v14, Lnet/bytebuddy/jar/asm/Label;

    const-class v15, Lnet/bytebuddy/jar/asm/Attribute;

    move-object/from16 v16, v2

    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v13

    const-string v13, "ClassVisitor"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 2
    iget-object v13, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    const/16 v18, 0x0

    if-eqz v2, :cond_1c

    .line 3
    :try_start_0
    invoke-virtual {v13}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 5
    const-class v19, Lnet/bytebuddy/jar/asm/Attribute;

    const-class v20, Lnet/bytebuddy/jar/asm/Label;

    const-class v21, Lnet/bytebuddy/jar/asm/Type;

    const-class v22, Lnet/bytebuddy/jar/asm/TypePath;

    const-class v23, Lnet/bytebuddy/jar/asm/Handle;

    const-class v24, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    filled-new-array/range {v19 .. v24}, [Ljava/lang/Class;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v21, v0

    const-string v0, "."

    move-object/from16 v22, v3

    if-eqz v20, :cond_0

    :try_start_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v3, v20

    check-cast v3, Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v20, v4

    .line 6
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v24, v5

    const/4 v5, 0x0

    :try_start_3
    invoke-static {v0, v5, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 7
    :try_start_4
    invoke-virtual {v13, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :catch_0
    :goto_1
    move-object/from16 v4, v20

    move-object/from16 v0, v21

    move-object/from16 v3, v22

    move-object/from16 v5, v24

    goto :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_18

    :catch_2
    move-object/from16 v24, v5

    goto :goto_1

    :cond_0
    move-object/from16 v20, v4

    move-object/from16 v24, v5

    .line 8
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const-class v4, [Lnet/bytebuddy/jar/asm/Label;

    if-eqz v3, :cond_1

    .line 9
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[L"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    move-object/from16 v19, v6

    const/4 v6, 0x0

    invoke-static {v3, v6, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v13, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    move-object/from16 v19, v6

    .line 10
    :goto_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 11
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 12
    const-class v25, Lnet/bytebuddy/jar/asm/ClassVisitor;

    const-class v26, Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    const-class v27, Lnet/bytebuddy/jar/asm/ModuleVisitor;

    const-class v28, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    const-class v29, Lnet/bytebuddy/jar/asm/FieldVisitor;

    const-class v30, Lnet/bytebuddy/jar/asm/MethodVisitor;

    filled-new-array/range {v25 .. v30}, [Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v25
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move-object/from16 v26, v6

    const-class v6, Lnet/bytebuddy/jar/asm/Handle;

    move-object/from16 v27, v7

    const-class v7, Lnet/bytebuddy/jar/asm/TypePath;

    move-object/from16 v28, v8

    const-class v8, Lnet/bytebuddy/jar/asm/MethodVisitor;

    move-object/from16 v29, v9

    if-eqz v25, :cond_3

    :try_start_6
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v9, v25

    check-cast v9, Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object/from16 v25, v4

    .line 13
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    move-object/from16 v43, v0

    :try_start_8
    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    move-object/from16 v44, v2

    const/4 v2, 0x0

    :try_start_9
    invoke-static {v0, v2, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v31
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    .line 14
    iget-object v0, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    if-ne v9, v8, :cond_2

    .line 15
    :try_start_a
    const-class v33, Lnet/bytebuddy/jar/asm/TypePath;

    .line 16
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v2

    check-cast v34, Ljava/lang/Class;

    const-class v35, Lnet/bytebuddy/jar/asm/Label;

    .line 17
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/Class;

    const-class v37, Lnet/bytebuddy/jar/asm/Type;

    .line 18
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v38, v2

    check-cast v38, Ljava/lang/Class;

    const-class v39, Lnet/bytebuddy/jar/asm/Handle;

    .line 19
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v40, v2

    check-cast v40, Ljava/lang/Class;

    const-class v41, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 20
    invoke-virtual {v13, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v42, v2

    check-cast v42, Ljava/lang/Class;

    move-object/from16 v30, v0

    move-object/from16 v32, v31

    move-object/from16 v31, v9

    .line 21
    invoke-static/range {v30 .. v42}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v0

    .line 22
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 23
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v33, v4

    check-cast v33, Ljava/lang/Class;

    const-class v34, Lnet/bytebuddy/jar/asm/TypePath;

    .line 24
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v35, v4

    check-cast v35, Ljava/lang/Class;

    const-class v36, Lnet/bytebuddy/jar/asm/Label;

    .line 25
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v37, v4

    check-cast v37, Ljava/lang/Class;

    const-class v38, Lnet/bytebuddy/jar/asm/Type;

    .line 26
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v39, v4

    check-cast v39, Ljava/lang/Class;

    const-class v40, Lnet/bytebuddy/jar/asm/Handle;

    .line 27
    invoke-virtual {v13, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v41, v4

    check-cast v41, Ljava/lang/Class;

    const-class v42, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    move-object/from16 v30, v32

    move-object/from16 v32, v31

    move-object/from16 v31, v30

    move-object/from16 v30, v2

    .line 28
    invoke-static/range {v30 .. v42}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    move-object/from16 v47, v32

    move-object/from16 v32, v31

    move-object/from16 v31, v47

    move-object/from16 v4, v31

    move-object/from16 v6, v32

    goto :goto_4

    :cond_2
    move-object/from16 v30, v0

    move-object/from16 v32, v31

    move-object/from16 v31, v9

    .line 29
    const-class v33, Lnet/bytebuddy/jar/asm/TypePath;

    .line 30
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v34, v0

    check-cast v34, Ljava/lang/Class;

    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Simple;

    sget-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/4 v4, 0x1

    new-array v6, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/16 v23, 0x0

    aput-object v2, v6, v23

    invoke-direct {v0, v6}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v35, v0

    .line 31
    invoke-static/range {v30 .. v35}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v0

    .line 32
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 33
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v33, v6

    check-cast v33, Ljava/lang/Class;

    const-class v34, Lnet/bytebuddy/jar/asm/TypePath;

    new-instance v6, Lnet/bytebuddy/implementation/Implementation$Simple;

    const/4 v7, 0x1

    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/16 v23, 0x0

    aput-object v2, v7, v23

    invoke-direct {v6, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v30, v32

    move-object/from16 v32, v31

    move-object/from16 v31, v30

    move-object/from16 v30, v4

    move-object/from16 v35, v6

    .line 34
    invoke-static/range {v30 .. v35}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    move-object/from16 v6, v31

    move-object/from16 v4, v32

    .line 35
    :goto_4
    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    invoke-virtual {v5, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    invoke-virtual {v5, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :catch_3
    :goto_5
    move-object/from16 v4, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v9, v29

    move-object/from16 v0, v43

    move-object/from16 v2, v44

    goto/16 :goto_3

    :catch_4
    :goto_6
    move-object/from16 v44, v2

    goto :goto_5

    :catch_5
    move-object/from16 v43, v0

    goto :goto_6

    :cond_3
    move-object/from16 v25, v4

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 40
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    if-eqz v4, :cond_4

    .line 41
    :try_start_b
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    sget-object v9, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {v4, v15, v9}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v4

    .line 42
    iget-object v11, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Class;

    invoke-virtual {v11, v12, v9}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v9

    .line 43
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v4, v15, v11, v12, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    invoke-interface {v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v9, v11, v15, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    move-result-object v4

    .line 46
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :catch_6
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_18

    :cond_4
    move-object/from16 v1, v18

    move-object v4, v1

    .line 47
    :goto_7
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    const-string v12, "wrap"

    if-eqz v11, :cond_19

    :try_start_c
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    move-object/from16 v26, v1

    .line 48
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-object/from16 v30, v1

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 49
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v31

    check-cast v31, Ljava/lang/Class;

    move-object/from16 v32, v1

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    move-object/from16 v31, v4

    array-length v4, v1

    move-object/from16 v33, v1

    move-object/from16 v1, v30

    move-object/from16 v30, v9

    move-object/from16 v9, v32

    move-object/from16 v32, v11

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v4, :cond_18

    aget-object v34, v33, v11

    move/from16 v35, v4

    .line 50
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    move/from16 v37, v11

    const-class v11, Ljava/lang/Object;

    if-ne v4, v11, :cond_5

    move-object/from16 v39, v0

    move-object/from16 v40, v2

    move-object v11, v3

    move-object v0, v9

    move-object/from16 v38, v12

    move-object/from16 v46, v14

    move-object/from16 v9, v21

    move-object/from16 v14, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v10

    move-object/from16 v10, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v24

    move-object/from16 v24, v7

    goto/16 :goto_16

    .line 51
    :cond_5
    :try_start_d
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v38, v12

    array-length v12, v4

    move-object/from16 v39, v0

    new-array v0, v12, [Ljava/lang/Class;

    move-object/from16 v40, v2

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v41, v3

    array-length v3, v4

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v44, v1

    move-object/from16 v42, v9

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/16 v43, 0x0

    .line 54
    :goto_a
    array-length v1, v4

    if-ge v9, v1, :cond_13

    .line 55
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_6

    aget-object v1, v4, v9

    if-ne v1, v14, :cond_6

    .line 56
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    aput-object v1, v0, v9

    .line 57
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    move-object/from16 v45, v4

    aget-object v4, v0, v9

    move-object/from16 v46, v14

    const/4 v14, 0x1

    invoke-static {v1, v4, v10, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v4, v45, v9

    const/4 v14, 0x1

    invoke-static {v1, v4, v10, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v14, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v10

    :goto_b
    move-object/from16 v10, v27

    :goto_c
    move-object/from16 v27, v6

    :goto_d
    move-object/from16 v6, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v24

    move-object/from16 v24, v7

    goto/16 :goto_e

    :cond_6
    move-object/from16 v45, v4

    move-object/from16 v46, v14

    .line 59
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_8

    aget-object v1, v45, v9

    move-object/from16 v4, v25

    if-ne v1, v4, :cond_7

    .line 60
    invoke-virtual {v13, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    aput-object v1, v0, v9

    .line 61
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v14, v0, v9

    move-object/from16 v25, v4

    move-object/from16 v4, v29

    move-object/from16 v29, v10

    const/4 v10, 0x1

    invoke-static {v1, v14, v4, v12, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v10, v45, v9

    const/4 v14, 0x1

    invoke-static {v1, v10, v4, v12, v14}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v10, v27

    move-object/from16 v14, v28

    move-object/from16 v28, v4

    goto :goto_c

    :cond_7
    move-object/from16 v25, v4

    :cond_8
    move-object/from16 v4, v29

    move-object/from16 v29, v10

    .line 63
    aget-object v1, v45, v9

    if-ne v1, v7, :cond_9

    .line 64
    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    aput-object v1, v0, v9

    .line 65
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v10, v0, v9

    move-object/from16 v14, v28

    move-object/from16 v28, v4

    const/4 v4, 0x0

    invoke-static {v1, v10, v14, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v4, v45, v9

    const/4 v10, 0x0

    invoke-static {v1, v4, v14, v12, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_b

    :cond_9
    move-object/from16 v14, v28

    move-object/from16 v28, v4

    .line 67
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_a

    aget-object v1, v45, v9

    if-ne v1, v6, :cond_a

    .line 68
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    aput-object v1, v0, v9

    .line 69
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v4, v0, v9

    move-object/from16 v10, v27

    move-object/from16 v27, v6

    const/4 v6, 0x0

    invoke-static {v1, v4, v10, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    aget-object v4, v45, v9

    const/4 v6, 0x0

    invoke-static {v1, v4, v10, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_a
    move-object/from16 v10, v27

    move-object/from16 v27, v6

    .line 71
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_b

    aget-object v1, v45, v9

    if-ne v1, v11, :cond_b

    .line 72
    aput-object v11, v0, v9

    .line 73
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    move-object/from16 v4, v19

    const/4 v6, 0x0

    invoke-static {v1, v11, v4, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v1, v11, v4, v12, v6}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v19, v4

    goto/16 :goto_d

    :cond_b
    move-object/from16 v4, v19

    .line 75
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_d

    aget-object v1, v45, v9
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6

    const-class v6, [Ljava/lang/Object;

    if-ne v1, v6, :cond_d

    .line 76
    :try_start_e
    aput-object v6, v0, v9

    .line 77
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v4

    const-string v4, "visitFrame"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 78
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    move-object/from16 v4, v24

    move-object/from16 v24, v7

    const/4 v7, 0x1

    invoke-static {v1, v6, v4, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    const/4 v7, 0x1

    invoke-static {v1, v6, v4, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v4

    goto/16 :goto_e

    :cond_c
    move-object/from16 v4, v24

    move-object/from16 v24, v7

    const/4 v7, 0x1

    .line 80
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    move-object/from16 v7, v20

    move-object/from16 v20, v4

    const/4 v4, 0x0

    invoke-static {v1, v6, v7, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v1, v6, v7, v12, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v22

    move-object/from16 v22, v7

    goto :goto_e

    :cond_d
    move-object/from16 v19, v24

    move-object/from16 v24, v7

    move-object/from16 v7, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v4

    .line 82
    aget-object v1, v45, v9

    if-ne v1, v15, :cond_f

    .line 83
    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    aput-object v1, v0, v9

    if-eqz v26, :cond_e

    if-eqz v31, :cond_e

    .line 84
    invoke-interface/range {v31 .. v31}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-virtual {v13, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    move-object/from16 v6, v22

    move-object/from16 v22, v7

    const/4 v7, 0x0

    invoke-static {v1, v4, v6, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    invoke-interface/range {v26 .. v26}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v1, v15, v6, v12, v7}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_e
    move-object/from16 v6, v22

    move-object/from16 v22, v7

    const/16 v43, 0x1

    goto :goto_e

    :cond_f
    move-object/from16 v6, v22

    move-object/from16 v22, v7

    .line 86
    aput-object v1, v0, v9

    .line 87
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    invoke-direct {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    invoke-direct {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    :goto_e
    aget-object v1, v0, v9

    if-nez v1, :cond_10

    const/4 v1, 0x1

    :goto_f
    move/from16 v4, v43

    goto :goto_12

    .line 90
    :cond_10
    aget-object v1, v45, v9

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_12

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    if-ne v1, v4, :cond_11

    goto :goto_10

    :cond_11
    const/4 v4, 0x1

    goto :goto_11

    :cond_12
    :goto_10
    const/4 v4, 0x2

    :goto_11
    add-int/2addr v12, v4

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v7, v24

    move-object/from16 v4, v45

    move-object/from16 v24, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v6

    move-object/from16 v6, v27

    move-object/from16 v27, v10

    move-object/from16 v10, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v14

    move-object/from16 v14, v46

    goto/16 :goto_a

    :cond_13
    move-object/from16 v46, v14

    move-object/from16 v14, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v10

    move-object/from16 v10, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v24

    move-object/from16 v24, v7

    const/4 v1, 0x0

    goto :goto_f

    :goto_12
    if-eqz v1, :cond_14

    :catch_7
    move-object/from16 v0, v18

    const/4 v4, 0x1

    goto :goto_13

    .line 91
    :cond_14
    :try_start_f
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    :goto_13
    if-eqz v4, :cond_16

    .line 92
    :try_start_10
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    move-object/from16 v4, v44

    invoke-interface {v4, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v1

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v1

    if-eqz v0, :cond_15

    .line 93
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    move-object/from16 v7, v42

    invoke-interface {v7, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v0

    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object v2

    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    :goto_14
    move-object/from16 v9, v21

    move-object/from16 v11, v41

    goto/16 :goto_16

    :cond_15
    move-object/from16 v7, v42

    move-object v0, v7

    goto :goto_14

    :cond_16
    move-object/from16 v7, v42

    move-object/from16 v4, v44

    .line 94
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v1

    move-object/from16 v9, v21

    invoke-virtual {v1, v9}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    .line 95
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v2

    invoke-virtual {v2, v9}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    invoke-virtual {v2, v3}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    .line 96
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    move-object/from16 v11, v41

    invoke-virtual {v11, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_17

    .line 97
    invoke-virtual/range {v34 .. v34}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 98
    invoke-interface {v12}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v12

    .line 99
    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v12

    move-object/from16 v21, v0

    .line 100
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-interface {v12, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 101
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 102
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v0

    .line 103
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    .line 104
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    .line 105
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v0

    .line 106
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 107
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 108
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v0

    .line 109
    invoke-virtual {v0, v2}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    goto :goto_15

    :cond_17
    move-object/from16 v21, v0

    .line 110
    :goto_15
    invoke-static/range {v34 .. v34}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-interface {v4, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v0

    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    .line 111
    invoke-static/range {v21 .. v21}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    invoke-interface {v7, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v1

    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v1

    move-object/from16 v47, v1

    move-object v1, v0

    move-object/from16 v0, v47

    :goto_16
    add-int/lit8 v2, v37, 0x1

    move-object/from16 v21, v9

    move-object v3, v11

    move-object/from16 v7, v24

    move/from16 v4, v35

    move-object/from16 v12, v38

    move-object v9, v0

    move v11, v2

    move-object/from16 v24, v20

    move-object/from16 v20, v22

    move-object/from16 v0, v39

    move-object/from16 v2, v40

    move-object/from16 v22, v6

    move-object/from16 v6, v27

    move-object/from16 v27, v10

    move-object/from16 v10, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v14

    move-object/from16 v14, v46

    goto/16 :goto_9

    :cond_18
    move-object/from16 v39, v0

    move-object v4, v1

    move-object/from16 v40, v2

    move-object v11, v3

    move-object/from16 v46, v14

    move-object/from16 v14, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v10

    move-object/from16 v10, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v24

    move-object/from16 v24, v7

    move-object v7, v9

    move-object/from16 v9, v21

    .line 112
    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v0

    invoke-interface {v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v1

    .line 113
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    move-object/from16 v4, v40

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    invoke-interface/range {v32 .. v32}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v39

    .line 115
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v2

    move-object v2, v4

    move-object/from16 v21, v9

    move-object v3, v11

    move-object/from16 v7, v24

    move-object/from16 v1, v26

    move-object/from16 v9, v30

    move-object/from16 v4, v31

    move-object/from16 v24, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v6

    move-object/from16 v6, v27

    move-object/from16 v27, v10

    move-object/from16 v10, v29

    move-object/from16 v29, v28

    move-object/from16 v28, v14

    move-object/from16 v14, v46

    goto/16 :goto_8

    :cond_19
    move-object v4, v2

    move-object/from16 v38, v12

    move-object v2, v0

    .line 117
    new-instance v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    const/4 v6, 0x0

    invoke-direct {v0, v6}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;-><init>(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    move-object/from16 v1, p0

    :try_start_11
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    move-object/from16 v5, v17

    filled-new-array {v5, v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 118
    invoke-virtual {v0, v3}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->appendMostSpecific([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->build()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 120
    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    const-class v6, Lnet/bytebuddy/asm/ClassVisitorFactory;

    sget-object v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {v3, v6, v7}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v3

    .line 121
    invoke-static/range {v38 .. v38}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v3

    iget-object v6, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/type/TypeDescription;

    .line 122
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v6

    .line 123
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v7

    invoke-interface {v6, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodList;

    .line 124
    invoke-interface {v6}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodDescription;

    .line 125
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    const/16 v23, 0x0

    filled-new-array/range {v23 .. v23}, [I

    move-result-object v7

    .line 126
    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    .line 127
    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v3

    const-string v6, "unwrap"

    .line 128
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v3, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v3

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 129
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v4

    .line 130
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v4, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/method/MethodList;

    .line 131
    invoke-interface {v4}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/method/MethodDescription;

    .line 132
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v4

    const/16 v23, 0x0

    filled-new-array/range {v23 .. v23}, [I

    move-result-object v6

    .line 133
    invoke-virtual {v4, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v4

    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    sget-object v7, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v4, v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v4

    .line 134
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v3

    .line 135
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v3

    .line 136
    invoke-interface {v3, v2}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->include(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v2

    .line 137
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    move-result-object v2

    .line 138
    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 140
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 141
    instance-of v3, v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    if-eqz v3, :cond_1b

    .line 142
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eq v0, v3, :cond_1b

    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 143
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eq v0, v3, :cond_1b

    move-object v3, v0

    check-cast v3, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    .line 144
    invoke-virtual {v3}, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;->seal()Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_17

    .line 145
    :cond_1a
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to seal multiple parent class loader: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    :cond_1b
    :goto_17
    return-object v2

    .line 146
    :goto_18
    new-instance v2, Ljava/lang/IllegalArgumentException;

    iget-object v1, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Failed to generate factory for "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 147
    :cond_1c
    const-string v0, "Expected a class named ClassVisitor: "

    .line 148
    invoke-static {v13, v0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 149
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v18
.end method
