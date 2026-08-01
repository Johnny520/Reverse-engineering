.class public Lnet/bytebuddy/matcher/StringMatcher;
.super Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/matcher/StringMatcher$Mode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/matcher/StringMatcher$Mode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic doMatch(Ljava/lang/Object;)Z
    .locals 0

    .line 10
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lnet/bytebuddy/matcher/StringMatcher;->doMatch(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public doMatch(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/matcher/StringMatcher$Mode;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/matcher/StringMatcher;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/matcher/ElementMatcher$Junction$ForNonNullValues;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/matcher/StringMatcher;->mode:Lnet/bytebuddy/matcher/StringMatcher$Mode;

    .line 7
    .line 8
    invoke-virtual {v1}, Lnet/bytebuddy/matcher/StringMatcher$Mode;->getDescription()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x28

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/matcher/StringMatcher;->value:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0x29

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
