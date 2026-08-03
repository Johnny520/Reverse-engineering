.class public Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;

    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/ByteBuddy;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-virtual {v1}, Lnet/bytebuddy/ByteBuddy;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->run()Lnet/bytebuddy/asm/ClassVisitorFactory;

    move-result-object v0

    return-object v0
.end method

.method public run()Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 2
    const-string v0, "delegate"

    const-class v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "attribute"

    const-string v4, "constants"

    const-string v7, "frames"

    const-string v8, "constant"

    const-string v9, "handle"

    const-string v10, "typePath"

    const-string v11, "labels"

    const-string v12, "label"

    const-class v13, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    const-class v14, Lnet/bytebuddy/jar/asm/Type;

    const-class v15, Lnet/bytebuddy/jar/asm/Label;

    const-class v6, Lnet/bytebuddy/jar/asm/Attribute;

    const-class v5, Lnet/bytebuddy/jar/asm/ClassVisitor;

    move-object/from16 v16, v0

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v5

    iget-object v5, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 3
    :try_start_0
    iget-object v0, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 5
    const-class v18, Lnet/bytebuddy/jar/asm/Attribute;

    const-class v19, Lnet/bytebuddy/jar/asm/Label;

    const-class v20, Lnet/bytebuddy/jar/asm/Type;

    const-class v21, Lnet/bytebuddy/jar/asm/TypePath;

    const-class v22, Lnet/bytebuddy/jar/asm/Handle;

    const-class v23, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    filled-new-array/range {v18 .. v23}, [Ljava/lang/Class;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v20, v2

    const-string v2, "."

    if-eqz v19, :cond_0

    :try_start_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v21, v3

    move-object/from16 v3, v19

    check-cast v3, Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v19, v4

    .line 6
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v22, v7

    const/4 v7, 0x0

    :try_start_3
    invoke-static {v2, v7, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 7
    :try_start_4
    invoke-interface {v5, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :catch_0
    :goto_1
    move-object/from16 v4, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v7, v22

    goto :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_1b

    :catch_2
    move-object/from16 v22, v7

    goto :goto_1

    :cond_0
    move-object/from16 v21, v3

    move-object/from16 v19, v4

    move-object/from16 v22, v7

    .line 8
    invoke-interface {v5, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const-class v4, [Lnet/bytebuddy/jar/asm/Label;

    if-eqz v3, :cond_1

    .line 9
    :try_start_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[L"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ";"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v7, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    move-object/from16 v18, v8

    const/4 v8, 0x0

    invoke-static {v3, v8, v7}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    move-object/from16 v18, v8

    .line 10
    :goto_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 11
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 12
    const-class v23, Lnet/bytebuddy/jar/asm/ClassVisitor;

    const-class v24, Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    const-class v25, Lnet/bytebuddy/jar/asm/ModuleVisitor;

    const-class v26, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    const-class v27, Lnet/bytebuddy/jar/asm/FieldVisitor;

    const-class v28, Lnet/bytebuddy/jar/asm/MethodVisitor;

    filled-new-array/range {v23 .. v28}, [Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v23
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move-object/from16 v24, v9

    const-class v9, Lnet/bytebuddy/jar/asm/Handle;

    move-object/from16 v25, v10

    const-class v10, Lnet/bytebuddy/jar/asm/TypePath;

    move-object/from16 v26, v11

    const-class v11, Lnet/bytebuddy/jar/asm/MethodVisitor;

    if-eqz v23, :cond_3

    :try_start_6
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v40, v8

    move-object/from16 v8, v23

    check-cast v8, Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object/from16 v23, v4

    .line 13
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    move-object/from16 v41, v0

    :try_start_8
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

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

    move-object/from16 v42, v2

    const/4 v2, 0x0

    :try_start_9
    invoke-static {v0, v2, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    if-ne v8, v11, :cond_2

    .line 14
    :try_start_a
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    const-class v30, Lnet/bytebuddy/jar/asm/TypePath;

    .line 15
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v31, v4

    check-cast v31, Ljava/lang/Class;

    const-class v32, Lnet/bytebuddy/jar/asm/Label;

    .line 16
    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v33, v4

    check-cast v33, Ljava/lang/Class;

    const-class v34, Lnet/bytebuddy/jar/asm/Type;

    .line 17
    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v35, v4

    check-cast v35, Ljava/lang/Class;

    const-class v36, Lnet/bytebuddy/jar/asm/Handle;

    .line 18
    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v37, v4

    check-cast v37, Ljava/lang/Class;

    const-class v38, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 19
    invoke-interface {v5, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v39, v4

    check-cast v39, Ljava/lang/Class;

    move-object/from16 v27, v2

    move-object/from16 v28, v8

    move-object/from16 v29, v0

    .line 20
    invoke-static/range {v27 .. v39}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    .line 21
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 22
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v30, v10

    check-cast v30, Ljava/lang/Class;

    const-class v31, Lnet/bytebuddy/jar/asm/TypePath;

    .line 23
    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v32, v10

    check-cast v32, Ljava/lang/Class;

    const-class v33, Lnet/bytebuddy/jar/asm/Label;

    .line 24
    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v34, v10

    check-cast v34, Ljava/lang/Class;

    const-class v35, Lnet/bytebuddy/jar/asm/Type;

    .line 25
    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v36, v9

    check-cast v36, Ljava/lang/Class;

    const-class v37, Lnet/bytebuddy/jar/asm/Handle;

    .line 26
    invoke-interface {v5, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v38, v9

    check-cast v38, Ljava/lang/Class;

    const-class v39, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    move-object/from16 v27, v4

    move-object/from16 v28, v0

    move-object/from16 v29, v8

    .line 27
    invoke-static/range {v27 .. v39}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v4

    move-object/from16 v33, v13

    goto :goto_4

    .line 28
    :cond_2
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    const-class v30, Lnet/bytebuddy/jar/asm/TypePath;

    .line 29
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v31, v4

    check-cast v31, Ljava/lang/Class;

    new-instance v4, Lnet/bytebuddy/implementation/Implementation$Simple;

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    move-object/from16 v33, v13

    const/4 v11, 0x1

    new-array v13, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v11, 0x0

    aput-object v9, v13, v11

    invoke-direct {v4, v13}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v27, v2

    move-object/from16 v28, v8

    move-object/from16 v29, v0

    move-object/from16 v32, v4

    .line 30
    invoke-static/range {v27 .. v32}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    .line 31
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    .line 32
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v30, v10

    check-cast v30, Ljava/lang/Class;

    const-class v31, Lnet/bytebuddy/jar/asm/TypePath;

    new-instance v10, Lnet/bytebuddy/implementation/Implementation$Simple;

    const/4 v11, 0x1

    new-array v13, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v11, 0x0

    aput-object v9, v13, v11

    invoke-direct {v10, v13}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    move-object/from16 v27, v4

    move-object/from16 v28, v0

    move-object/from16 v29, v8

    move-object/from16 v32, v10

    .line 33
    invoke-static/range {v27 .. v32}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v4

    .line 34
    :goto_4
    invoke-interface {v3, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    invoke-interface {v7, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    invoke-interface {v7, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    move-object/from16 v4, v23

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v26

    move-object/from16 v13, v33

    move-object/from16 v8, v40

    move-object/from16 v0, v41

    move-object/from16 v2, v42

    goto/16 :goto_3

    :catch_3
    :goto_6
    move-object/from16 v33, v13

    goto :goto_5

    :catch_4
    :goto_7
    move-object/from16 v42, v2

    goto :goto_6

    :catch_5
    move-object/from16 v41, v0

    goto :goto_7

    :cond_3
    move-object/from16 v23, v4

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 39
    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    if-eqz v4, :cond_4

    .line 40
    :try_start_b
    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    sget-object v13, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {v4, v6, v13}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v4

    .line 41
    iget-object v14, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v8, v27

    check-cast v8, Ljava/lang/Class;

    invoke-virtual {v14, v8, v13}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v8

    .line 42
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Class;

    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v14

    invoke-interface {v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-static {v4, v6, v13, v14, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    move-result-object v1

    .line 43
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Class;

    invoke-interface {v8}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v14

    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-static {v8, v13, v6, v14, v4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    move-result-object v4

    .line 45
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :catch_6
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_1b

    :cond_4
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 46
    :goto_8
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    const-string v14, "wrap"

    if-eqz v13, :cond_1a

    :try_start_c
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    move-object/from16 v27, v8

    .line 47
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-object/from16 v29, v8

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 48
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v30

    check-cast v30, Ljava/lang/Class;

    move-object/from16 v31, v8

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    move-object/from16 v30, v0

    array-length v0, v8

    move-object/from16 v32, v2

    move-object/from16 v2, v29

    move-object/from16 v29, v14

    move-object/from16 v14, v31

    move-object/from16 v31, v3

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v0, :cond_19

    aget-object v33, v8, v3

    move/from16 v34, v0

    .line 49
    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    move-object/from16 v35, v8

    const-class v8, Ljava/lang/Object;

    if-ne v0, v8, :cond_5

    move-object/from16 v40, v1

    move/from16 v36, v3

    move-object/from16 v39, v4

    move-object/from16 v42, v5

    move-object/from16 v43, v15

    move-object/from16 v8, v21

    move-object/from16 v15, v25

    move-object/from16 v25, v26

    const/4 v0, 0x1

    move-object/from16 v26, v12

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    move-object/from16 v22, v18

    move-object v9, v6

    move-object/from16 v18, v10

    move-object/from16 v10, v31

    goto/16 :goto_19

    .line 50
    :cond_5
    :try_start_d
    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    move/from16 v36, v3

    array-length v3, v0

    move-object/from16 v37, v14

    new-array v14, v3, [Ljava/lang/Class;

    move-object/from16 v38, v2

    .line 51
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v39, v4

    array-length v4, v0

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v40, v1

    move-object/from16 v42, v6

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/16 v41, 0x0

    .line 53
    :goto_b
    array-length v6, v0

    if-ge v1, v6, :cond_14

    .line 54
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_6

    aget-object v6, v0, v1

    if-ne v6, v15, :cond_6

    .line 55
    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    aput-object v6, v14, v1

    .line 56
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    move-object/from16 v43, v15

    aget-object v15, v14, v1

    move-object/from16 v44, v8

    const/4 v8, 0x1

    invoke-static {v6, v15, v12, v3, v8}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v8, v0, v1

    const/4 v15, 0x1

    invoke-static {v6, v8, v12, v3, v15}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, v21

    move-object/from16 v15, v25

    move-object/from16 v25, v26

    move-object/from16 v26, v12

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    move-object/from16 v22, v18

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    :goto_c
    move-object/from16 v18, v10

    goto/16 :goto_11

    :cond_6
    move-object/from16 v44, v8

    move-object/from16 v43, v15

    .line 58
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_8

    aget-object v6, v0, v1

    move-object/from16 v8, v23

    if-ne v6, v8, :cond_7

    .line 59
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    aput-object v6, v14, v1

    .line 60
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v15, v14, v1

    move-object/from16 v23, v8

    move-object/from16 v8, v26

    move-object/from16 v26, v12

    const/4 v12, 0x1

    invoke-static {v6, v15, v8, v3, v12}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v12, v0, v1

    const/4 v15, 0x1

    invoke-static {v6, v12, v8, v3, v15}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v12, v24

    move-object/from16 v15, v25

    move-object/from16 v25, v8

    move-object/from16 v24, v9

    :goto_d
    move-object/from16 v8, v21

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    :goto_e
    move-object/from16 v22, v18

    goto :goto_c

    :cond_7
    move-object/from16 v23, v8

    :cond_8
    move-object/from16 v8, v26

    move-object/from16 v26, v12

    .line 62
    aget-object v6, v0, v1

    if-ne v6, v10, :cond_9

    .line 63
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    aput-object v6, v14, v1

    .line 64
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v12, v14, v1

    move-object/from16 v15, v25

    move-object/from16 v25, v8

    const/4 v8, 0x0

    invoke-static {v6, v12, v15, v3, v8}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v8, v0, v1

    const/4 v12, 0x0

    invoke-static {v6, v8, v15, v3, v12}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, v21

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    goto :goto_e

    :cond_9
    move-object/from16 v15, v25

    move-object/from16 v25, v8

    .line 66
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_a

    aget-object v6, v0, v1

    if-ne v6, v9, :cond_a

    .line 67
    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    aput-object v6, v14, v1

    .line 68
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v8, v14, v1

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    const/4 v9, 0x0

    invoke-static {v6, v8, v12, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    aget-object v8, v0, v1

    const/4 v9, 0x0

    invoke-static {v6, v8, v12, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_a
    move-object/from16 v12, v24

    move-object/from16 v24, v9

    .line 70
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_c

    aget-object v6, v0, v1

    move-object/from16 v8, v44

    if-ne v6, v8, :cond_b

    .line 71
    aput-object v8, v14, v1

    .line 72
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    move-object/from16 v9, v18

    move-object/from16 v18, v10

    const/4 v10, 0x0

    invoke-static {v6, v8, v9, v3, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v8, v9, v3, v10}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v44, v8

    move-object/from16 v8, v21

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v9

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    goto/16 :goto_11

    :cond_b
    move-object/from16 v9, v18

    :goto_f
    move-object/from16 v18, v10

    goto :goto_10

    :cond_c
    move-object/from16 v9, v18

    move-object/from16 v8, v44

    goto :goto_f

    .line 74
    :goto_10
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_e

    aget-object v6, v0, v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6

    const-class v10, [Ljava/lang/Object;

    if-ne v6, v10, :cond_e

    .line 75
    :try_start_e
    aput-object v10, v14, v1

    .line 76
    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v44, v8

    const-string v8, "visitFrame"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 77
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    move-object/from16 v8, v22

    move-object/from16 v22, v9

    const/4 v9, 0x1

    invoke-static {v6, v10, v8, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    const/4 v9, 0x1

    invoke-static {v6, v10, v8, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    move-object/from16 v45, v19

    move-object/from16 v19, v8

    move-object/from16 v8, v21

    move-object/from16 v21, v45

    goto/16 :goto_11

    :cond_d
    move-object/from16 v8, v22

    move-object/from16 v22, v9

    .line 79
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    const/4 v9, 0x0

    move-object/from16 v45, v19

    move-object/from16 v19, v8

    move-object/from16 v8, v45

    invoke-static {v6, v10, v8, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v6, v10, v8, v3, v9}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    move-object/from16 v45, v21

    move-object/from16 v21, v8

    move-object/from16 v8, v45

    goto/16 :goto_11

    :cond_e
    move-object/from16 v44, v8

    move-object/from16 v8, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v9

    .line 81
    aget-object v6, v0, v1

    move-object/from16 v9, v42

    if-ne v6, v9, :cond_10

    .line 82
    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    aput-object v6, v14, v1

    if-eqz v40, :cond_f

    if-eqz v39, :cond_f

    .line 83
    invoke-interface/range {v39 .. v39}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Class;

    move-object/from16 v42, v5

    const/4 v5, 0x0

    move-object/from16 v45, v21

    move-object/from16 v21, v8

    move-object/from16 v8, v45

    invoke-static {v6, v10, v8, v3, v5}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-interface/range {v40 .. v40}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v6

    invoke-static {v6, v9, v8, v3, v5}, Lnet/bytebuddy/asm/ClassVisitorFactory;->access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_f
    move-object/from16 v42, v5

    move-object/from16 v45, v21

    move-object/from16 v21, v8

    move-object/from16 v8, v45

    const/16 v41, 0x1

    goto :goto_11

    :cond_10
    move-object/from16 v42, v5

    move-object/from16 v45, v21

    move-object/from16 v21, v8

    move-object/from16 v8, v45

    .line 85
    aput-object v6, v14, v1

    .line 86
    new-instance v5, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    invoke-direct {v5, v1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    new-instance v5, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;

    invoke-direct {v5, v1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForMethodParameter$Factory;-><init>(I)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :goto_11
    aget-object v5, v14, v1

    if-nez v5, :cond_11

    const/4 v0, 0x1

    goto :goto_14

    .line 89
    :cond_11
    aget-object v5, v0, v1

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v5, v6, :cond_13

    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    if-ne v5, v6, :cond_12

    goto :goto_12

    :cond_12
    const/4 v5, 0x1

    goto :goto_13

    :cond_13
    :goto_12
    const/4 v5, 0x2

    :goto_13
    add-int/2addr v3, v5

    const/4 v5, 0x1

    add-int/2addr v1, v5

    move-object/from16 v10, v18

    move-object/from16 v18, v22

    move-object/from16 v5, v42

    move-object/from16 v42, v9

    move-object/from16 v22, v19

    move-object/from16 v19, v21

    move-object/from16 v9, v24

    move-object/from16 v21, v8

    move-object/from16 v24, v12

    move-object/from16 v12, v26

    move-object/from16 v8, v44

    move-object/from16 v26, v25

    move-object/from16 v25, v15

    move-object/from16 v15, v43

    goto/16 :goto_b

    :cond_14
    move-object/from16 v43, v15

    move-object/from16 v8, v21

    move-object/from16 v15, v25

    move-object/from16 v25, v26

    move-object/from16 v26, v12

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    move-object/from16 v22, v18

    move-object/from16 v9, v42

    move-object/from16 v42, v5

    move-object/from16 v18, v10

    const/4 v0, 0x0

    :goto_14
    if-eqz v0, :cond_15

    :catch_7
    const/4 v0, 0x0

    const/16 v41, 0x1

    goto :goto_15

    .line 90
    :cond_15
    :try_start_f
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    :goto_15
    if-eqz v41, :cond_17

    .line 91
    :try_start_10
    invoke-static/range {v33 .. v33}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v1

    move-object/from16 v3, v38

    invoke-interface {v3, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v1

    invoke-static/range {v20 .. v20}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object v2

    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v1

    if-eqz v0, :cond_16

    .line 92
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    move-object/from16 v5, v37

    invoke-interface {v5, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    move-result-object v2

    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    move-object v14, v0

    move-object v2, v1

    :goto_16
    move-object/from16 v10, v31

    :goto_17
    const/4 v0, 0x1

    goto/16 :goto_19

    :cond_16
    move-object/from16 v5, v37

    move-object v2, v1

    move-object v14, v5

    goto :goto_16

    :cond_17
    move-object/from16 v5, v37

    move-object/from16 v3, v38

    .line 93
    invoke-static {v0}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v1

    move-object/from16 v6, v16

    invoke-virtual {v1, v6}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    .line 94
    invoke-static/range {v33 .. v33}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v2

    invoke-virtual {v2, v6}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    invoke-virtual {v2, v4}, Lnet/bytebuddy/implementation/MethodCall;->with(Ljava/util/List;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    .line 95
    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v10, v31

    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    if-eqz v4, :cond_18

    .line 96
    invoke-virtual/range {v33 .. v33}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v14

    invoke-interface {v7, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 97
    invoke-interface {v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v14

    .line 98
    invoke-interface {v14}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v14

    move-object/from16 v16, v6

    .line 99
    invoke-static/range {v29 .. v29}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v14, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodList;

    .line 100
    invoke-interface {v6}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodDescription;

    .line 101
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v6

    .line 102
    invoke-virtual {v6, v1}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v1

    .line 103
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/dynamic/DynamicType$Builder;

    invoke-interface {v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    .line 104
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v4

    .line 105
    invoke-static/range {v29 .. v29}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v4, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/method/MethodList;

    .line 106
    invoke-interface {v4}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/bytebuddy/description/method/MethodDescription;

    .line 107
    invoke-static {v4}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    move-result-object v4

    .line 108
    invoke-virtual {v4, v2}, Lnet/bytebuddy/implementation/MethodCall;->withMethodCall(Lnet/bytebuddy/implementation/MethodCall;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v2

    goto :goto_18

    :cond_18
    move-object/from16 v16, v6

    .line 109
    :goto_18
    invoke-static/range {v33 .. v33}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v4

    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v3

    invoke-interface {v3, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v1

    .line 110
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-interface {v5, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v0

    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    move-object v14, v0

    move-object v2, v1

    goto/16 :goto_17

    :goto_19
    add-int/lit8 v3, v36, 0x1

    move-object v6, v9

    move-object/from16 v31, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v22

    move-object/from16 v9, v24

    move/from16 v0, v34

    move-object/from16 v4, v39

    move-object/from16 v1, v40

    move-object/from16 v5, v42

    move-object/from16 v24, v12

    move-object/from16 v22, v19

    move-object/from16 v19, v21

    move-object/from16 v12, v26

    move-object/from16 v21, v8

    move-object/from16 v26, v25

    move-object/from16 v8, v35

    move-object/from16 v25, v15

    move-object/from16 v15, v43

    goto/16 :goto_a

    :cond_19
    move-object/from16 v40, v1

    move-object v3, v2

    move-object/from16 v39, v4

    move-object/from16 v42, v5

    move-object v5, v14

    move-object/from16 v43, v15

    move-object/from16 v8, v21

    move-object/from16 v15, v25

    move-object/from16 v25, v26

    const/4 v0, 0x1

    move-object/from16 v26, v12

    move-object/from16 v21, v19

    move-object/from16 v19, v22

    move-object/from16 v12, v24

    move-object/from16 v24, v9

    move-object/from16 v22, v18

    move-object v9, v6

    move-object/from16 v18, v10

    move-object/from16 v10, v31

    .line 111
    invoke-interface {v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v1

    invoke-interface {v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v2

    .line 112
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    move-object/from16 v5, v32

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v4

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v3, v30

    .line 114
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v0, v3

    move-object v2, v5

    move-object v6, v9

    move-object v3, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v22

    move-object/from16 v9, v24

    move-object/from16 v4, v39

    move-object/from16 v1, v40

    move-object/from16 v5, v42

    move-object/from16 v24, v12

    move-object/from16 v22, v19

    move-object/from16 v19, v21

    move-object/from16 v12, v26

    move-object/from16 v21, v8

    move-object/from16 v26, v25

    move-object/from16 v8, v27

    move-object/from16 v25, v15

    move-object/from16 v15, v43

    goto/16 :goto_9

    :cond_1a
    move-object v3, v0

    move-object v5, v2

    move-object/from16 v29, v14

    .line 116
    new-instance v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;-><init>(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    move-object/from16 v1, p0

    :try_start_11
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    move-object/from16 v4, v17

    filled-new-array {v4, v2}, [Ljava/lang/Class;

    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->appendMostSpecific([Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;

    move-result-object v0

    .line 118
    invoke-virtual {v0}, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader$Builder;->build()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 119
    iget-object v2, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->byteBuddy:Lnet/bytebuddy/ByteBuddy;

    const-class v6, Lnet/bytebuddy/asm/ClassVisitorFactory;

    sget-object v7, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->IMITATE_SUPER_CLASS_OPENING:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    invoke-virtual {v2, v6, v7}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v2

    .line 120
    invoke-static/range {v29 .. v29}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v2

    iget-object v6, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/type/TypeDescription;

    .line 121
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v6

    .line 122
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v7

    invoke-interface {v6, v7}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodList;

    .line 123
    invoke-interface {v6}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/method/MethodDescription;

    .line 124
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    const/4 v7, 0x0

    filled-new-array {v7}, [I

    move-result-object v8

    .line 125
    invoke-virtual {v6, v8}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v6

    .line 126
    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v2

    const-string v6, "unwrap"

    .line 127
    invoke-static {v6}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v2, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    move-result-object v2

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 128
    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v5

    .line 129
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v6

    invoke-interface {v5, v6}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodList;

    .line 130
    invoke-interface {v5}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/method/MethodDescription;

    .line 131
    invoke-static {v5}, Lnet/bytebuddy/implementation/MethodCall;->construct(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v5

    const/4 v6, 0x0

    filled-new-array {v6}, [I

    move-result-object v6

    .line 132
    invoke-virtual {v5, v6}, Lnet/bytebuddy/implementation/MethodCall;->withArgument([I)Lnet/bytebuddy/implementation/MethodCall;

    move-result-object v5

    sget-object v6, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    sget-object v7, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v5, v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v5

    .line 133
    invoke-interface {v2, v5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v2

    .line 134
    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v2

    .line 135
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->include(Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    move-result-object v2

    .line 136
    invoke-interface {v2, v0}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    move-result-object v2

    .line 137
    invoke-interface {v2}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 140
    instance-of v3, v0, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    if-eqz v3, :cond_1c

    .line 141
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eq v0, v3, :cond_1c

    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    .line 142
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eq v0, v3, :cond_1c

    move-object v3, v0

    check-cast v3, Lnet/bytebuddy/dynamic/loading/MultipleParentClassLoader;

    .line 143
    invoke-virtual {v3}, Lnet/bytebuddy/dynamic/loading/InjectionClassLoader;->seal()Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_1a

    .line 144
    :cond_1b
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

    :cond_1c
    :goto_1a
    return-object v2

    .line 145
    :goto_1b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to generate factory for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1d
    move-object/from16 v4, v17

    .line 146
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected a class named "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;->classVisitor:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
