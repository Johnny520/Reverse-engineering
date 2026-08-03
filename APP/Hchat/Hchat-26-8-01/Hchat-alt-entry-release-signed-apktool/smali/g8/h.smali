.class public final Lg8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lg8/h;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lg8/h;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lg8/h;->b:Ljava/lang/String;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "Class alias can\'t be empty"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg8/h;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lg8/h;->b:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lg8/h;->c:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lg8/h;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lg8/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lg8/h;->d:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, ", pkg="

    .line 14
    .line 15
    const-string v2, ", fullName="

    .line 16
    .line 17
    const-string v3, "Alias{"

    .line 18
    .line 19
    iget-object v4, p0, Lg8/h;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v5, p0, Lg8/h;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v5, v2}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "}"

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
