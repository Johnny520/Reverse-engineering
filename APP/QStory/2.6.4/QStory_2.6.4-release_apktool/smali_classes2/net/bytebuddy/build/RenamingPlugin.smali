.class public Lnet/bytebuddy/build/RenamingPlugin;
.super Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin;
.implements Lnet/bytebuddy/build/Plugin$Factory;


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

    .line 18
    new-instance v0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;-><init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/build/RenamingPlugin;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;-><init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->nameStartsWith(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/build/RenamingPlugin;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;Lnet/bytebuddy/matcher/ElementMatcher;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V
    .locals 1

    .line 19
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

    .line 20
    invoke-direct {p0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;-><init>()V

    .line 21
    iput-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 22
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

    .line 1
    invoke-interface {p1, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->visit(Lnet/bytebuddy/asm/AsmVisitorWrapper;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/RenamingPlugin;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

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
    iget-object p0, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 0

    .line 1
    return-object p0
.end method

.method public bridge synthetic matches(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/RenamingPlugin;->matches(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public matches(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 0
    .param p1    # Lnet/bytebuddy/description/type/TypeDescription;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 8
    iget-object p0, p0, Lnet/bytebuddy/build/RenamingPlugin;->matcher:Lnet/bytebuddy/matcher/ElementMatcher;

    invoke-interface {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    move-result p0

    return p0
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

    .line 1
    new-instance p1, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;

    .line 2
    .line 3
    new-instance p3, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/build/RenamingPlugin;->renaming:Lnet/bytebuddy/build/RenamingPlugin$Renaming;

    .line 6
    .line 7
    invoke-direct {p3, p0}, Lnet/bytebuddy/build/RenamingPlugin$RenamingRemapper;-><init>(Lnet/bytebuddy/build/RenamingPlugin$Renaming;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/jar/asm/commons/ClassRemapper;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/commons/Remapper;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method
