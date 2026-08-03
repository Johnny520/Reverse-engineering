.class public final Lv4/f;
.super Lv4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Lv4/f;

.field public static final i:Lv4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv4/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lv4/s;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv4/f;->h:Lv4/f;

    .line 8
    .line 9
    new-instance v0, Lv4/f;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lv4/s;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lv4/f;->i:Lv4/f;

    .line 16
    .line 17
    return-void
.end method

.method public static n(I)Lv4/f;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lv4/f;->h:Lv4/f;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    sget-object p0, Lv4/f;->i:Lv4/f;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const-string v0, "bogus value: "

    .line 13
    .line 14
    invoke-static {p0, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lv4/s;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "false"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "true"

    .line 9
    .line 10
    return-object v0
.end method

.method public final getType()Lw4/c;
    .locals 1

    .line 1
    sget-object v0, Lw4/c;->o:Lw4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "boolean"

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lv4/s;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "boolean{false}"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "boolean{true}"

    .line 9
    .line 10
    return-object v0
.end method
