.class public Lnet/bytebuddy/build/RenamingPlugin;
.super Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/build/Plugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;,
        Lnet/bytebuddy/build/RenamingPlugin$Renaming;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final matcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;-><init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/build/RenamingPlugin;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    new-instance v0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;-><init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V

    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/build/RenamingPlugin;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V
    .locals 1

    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/build/RenamingPlugin;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;Lnet/bytebuddy/matcher/ElementMatcher;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;Lnet/bytebuddy/matcher/ElementMatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/RenamingPlugin$Renaming;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;-><init>()V

    .line 5
    iput-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    check-cast p1, Lnet/bytebuddy/build/RenamingPlugin;

    iget-object v3, p1, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    iget-object p1, p1, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/RenamingPlugin;->matches(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p1

    return p1
.end method

.method public matches(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;II)",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;"
        }
    .end annotation

    new-instance p1, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;

    new-instance p3, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;

    iget-object p4, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    invoke-direct {p3, p4}, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V

    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    return-object p1
.end method
