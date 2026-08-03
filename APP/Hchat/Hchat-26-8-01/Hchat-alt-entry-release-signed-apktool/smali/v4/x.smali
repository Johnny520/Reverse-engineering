.class public final Lv4/x;
.super Lv4/f0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Ljava/lang/String;


# instance fields
.field public final g:I

.field public final h:Lv4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v7, "invoke-direct"

    .line 2
    .line 3
    const-string v8, "invoke-interface"

    .line 4
    .line 5
    const-string v0, "static-put"

    .line 6
    .line 7
    const-string v1, "static-get"

    .line 8
    .line 9
    const-string v2, "instance-put"

    .line 10
    .line 11
    const-string v3, "instance-get"

    .line 12
    .line 13
    const-string v4, "invoke-static"

    .line 14
    .line 15
    const-string v5, "invoke-instance"

    .line 16
    .line 17
    const-string v6, "invoke-constructor"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lv4/x;->i:[Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(ILv4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv4/x;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lv4/x;->h:Lv4/a;

    .line 7
    .line 8
    return-void
.end method

.method public static k(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public static l(ILv4/a;)Lv4/x;
    .locals 2

    .line 1
    invoke-static {p0}, Lv4/x;->k(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "ref has wrong type: "

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p1, Lv4/m;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0, v1}, Lj8/o;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    packed-switch p0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    const-string p1, "type is out of range: "

    .line 27
    .line 28
    invoke-static {p0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_0
    instance-of v0, p1, Lv4/e;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    :goto_1
    new-instance v0, Lv4/x;

    .line 41
    .line 42
    invoke-direct {v0, p0, p1}, Lv4/x;-><init>(ILv4/a;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0, v1}, Lj8/o;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lv4/x;->g:I

    .line 7
    .line 8
    sget-object v2, Lv4/x;->i:[Ljava/lang/String;

    .line 9
    .line 10
    aget-object v1, v2, v1

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ","

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lv4/x;->h:Lv4/a;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final e(Lv4/a;)I
    .locals 2

    .line 1
    check-cast p1, Lv4/x;

    .line 2
    .line 3
    iget v0, p1, Lv4/x;->g:I

    .line 4
    .line 5
    iget v1, p0, Lv4/x;->g:I

    .line 6
    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lv4/x;->h:Lv4/a;

    .line 10
    .line 11
    iget-object p1, p1, Lv4/x;->h:Lv4/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    sget-object v0, Lw4/c;->B:Lw4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "method handle"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "method-handle{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/x;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "}"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
