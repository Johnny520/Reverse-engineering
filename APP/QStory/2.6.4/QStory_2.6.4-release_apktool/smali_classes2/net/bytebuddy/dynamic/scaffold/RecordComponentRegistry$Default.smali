.class public Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Compiled;,
        Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Compiled;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;

    .line 34
    .line 35
    invoke-virtual {v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;->getRecordComponentAttributeAppender()Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender;

    .line 44
    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;->getRecordComponentAttributeAppender()Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v3, p1}, Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;->getRecordComponentAttributeAppender()Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_0
    new-instance v4, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Compiled$Entry;

    .line 63
    .line 64
    invoke-virtual {v2, p1}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;->resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/matcher/ElementMatcher;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;->getTransformer()Lnet/bytebuddy/dynamic/Transformer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v4, v5, v3, v2}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Compiled$Entry;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender;Lnet/bytebuddy/dynamic/Transformer;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    new-instance p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Compiled;

    .line 80
    .line 81
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Compiled;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-object p0
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public prepend(Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;)Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/LatentMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;",
            "Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;",
            "Lnet/bytebuddy/dynamic/Transformer<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription;",
            ">;)",
            "Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;

    .line 15
    .line 16
    invoke-direct {v1, p1, p2, p3}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default$Entry;-><init>(Lnet/bytebuddy/matcher/LatentMatcher;Lnet/bytebuddy/implementation/attribute/RecordComponentAttributeAppender$Factory;Lnet/bytebuddy/dynamic/Transformer;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;->entries:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    new-instance p0, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry$Default;-><init>(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
