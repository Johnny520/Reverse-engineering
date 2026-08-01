.class public final LN0/i;
.super LN0/b;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements LS0/a;


# instance fields
.field public final g:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    sget-object v1, LN0/a;->a:LN0/a;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const-class v2, Lv0/c;

    .line 5
    .line 6
    const-string v3, "mainBinding"

    .line 7
    .line 8
    const-string v4, "getMainBinding()Lcom/lu/wxmask/databinding/FragmentMainBinding;"

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v5}, LN0/b;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, LN0/i;->g:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()LS0/a;
    .locals 1

    .line 1
    sget-object v0, LN0/m;->a:LN0/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, LN0/i;->e()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method public final d()LS0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LN0/i;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object v0, p0, LN0/b;->a:LS0/a;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, LN0/b;->a()LS0/a;

    .line 11
    .line 12
    .line 13
    iput-object p0, p0, LN0/b;->a:LS0/a;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    return-object v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LN0/i;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LN0/i;->d()LS0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eq v0, p0, :cond_0

    .line 10
    .line 11
    check-cast v0, LN0/i;

    .line 12
    .line 13
    invoke-virtual {v0}, LN0/i;->e()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, LL0/a;

    .line 18
    .line 19
    const-string v1, "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string v1, "Kotlin reflection is not yet supported for synthetic Java properties"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, LN0/i;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, LN0/i;

    .line 9
    .line 10
    invoke-virtual {p0}, LN0/b;->b()LN0/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, LN0/b;->b()LN0/c;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LN0/b;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, LN0/b;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, LN0/b;->e:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, LN0/b;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, LN0/b;->b:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, p1, LN0/b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    :goto_0
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_1
    instance-of v0, p1, LN0/i;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, LN0/i;->d()LS0/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :cond_2
    const/4 p1, 0x0

    .line 70
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, LN0/b;->b()LN0/c;

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
    iget-object v2, p0, LN0/b;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, LL/d;->c(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, LN0/b;->e:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v1, v0

    .line 25
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, LN0/i;->d()LS0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "property "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LN0/b;->d:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, " (Kotlin reflection is not available)"

    .line 22
    .line 23
    invoke-static {v0, v1, v2}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
