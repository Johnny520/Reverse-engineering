.class public abstract Lng/m;
.super Lng/n;


# direct methods
.method public static R(Ljava/util/Iterator;)Lng/j;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldg/n;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Lng/a;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lng/a;-><init>(Lng/j;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static S(Lng/j;)Lng/c;
    .locals 2

    .line 1
    new-instance v0, Lr9/p;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr9/p;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lng/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, Lng/c;-><init>(Lng/j;Lfg/l;)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public static T(Lng/j;Lfg/l;)Lng/i;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lng/i;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1, p1}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static U(Lng/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static V(Lng/j;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;
    .locals 4

    .line 1
    and-int/lit8 p3, p3, 0x20

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    add-int/2addr v1, v3

    .line 36
    if-le v1, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-static {p3, v2, p2}, Lac/p;->f(Ljava/lang/StringBuilder;Ljava/lang/Object;Lfg/l;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static W(Lng/j;Lfg/l;)Lng/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lng/t;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lng/t;-><init>(Lng/j;Lfg/l;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static X(Lng/j;Lfg/l;)Lng/i;
    .locals 2

    .line 1
    new-instance v0, Lng/t;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lng/t;-><init>(Lng/j;Lfg/l;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Li2/z;

    .line 7
    .line 8
    const/16 p1, 0x1d

    .line 9
    .line 10
    invoke-direct {p0, p1}, Li2/z;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lng/i;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p1, v0, v1, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public static Y(Lng/j;Ldg/n;)Ldg/j;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Lng/j;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p0, v0, v1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    aput-object p1, v0, p0

    .line 9
    .line 10
    invoke-static {v0}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, Li2/z;

    .line 15
    .line 16
    const/16 v0, 0x1c

    .line 17
    .line 18
    invoke-direct {p1, v0}, Li2/z;-><init>(I)V

    .line 19
    .line 20
    .line 21
    instance-of v0, p0, Lng/t;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast p0, Lng/t;

    .line 26
    .line 27
    new-instance v0, Ldg/j;

    .line 28
    .line 29
    iget-object v1, p0, Lng/t;->a:Lng/j;

    .line 30
    .line 31
    iget-object p0, p0, Lng/t;->b:Lfg/l;

    .line 32
    .line 33
    invoke-direct {v0, v1, p0, p1}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v0, Ldg/j;

    .line 38
    .line 39
    new-instance v1, Lr9/p;

    .line 40
    .line 41
    const/16 v2, 0xb

    .line 42
    .line 43
    invoke-direct {v1, v2}, Lr9/p;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, p0, v1, p1}, Ldg/j;-><init>(Lng/j;Lfg/l;Lfg/l;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static Z(Lng/j;I)Lng/j;
    .locals 2

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    sget-object p0, Lng/g;->a:Lng/g;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Lng/f;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Lng/f;

    .line 13
    .line 14
    invoke-interface {p0, p1}, Lng/f;->a(I)Lng/j;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance v0, Lng/e;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lng/e;-><init>(Lng/j;II)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_2
    const-string p0, "Requested element count "

    .line 27
    .line 28
    const-string v0, " is less than zero."

    .line 29
    .line 30
    invoke-static {p1, p0, v0}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method public static a0(Lng/j;Ljava/util/AbstractCollection;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public static b0(Lng/j;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-object v1
.end method

.method public static c0(Lng/j;)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-interface {p0}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-static {v0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v1
.end method
