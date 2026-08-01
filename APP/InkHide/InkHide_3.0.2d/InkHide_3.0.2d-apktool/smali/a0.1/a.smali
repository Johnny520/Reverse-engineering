.class public final La0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/lang/reflect/Type;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/reflect/Type;

    .line 8
    .line 9
    invoke-static {p1}, LV/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La0/a;->b:Ljava/lang/reflect/Type;

    .line 14
    .line 15
    invoke-static {p1}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La0/a;->a:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, La0/a;->c:I

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La0/a;

    .line 6
    .line 7
    iget-object p1, p1, La0/a;->b:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    iget-object v0, p0, La0/a;->b:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    invoke-static {v0, p1}, LV/d;->d(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, La0/a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La0/a;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    invoke-static {v0}, LV/d;->j(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
