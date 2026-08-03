.class public Lk6/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lh6/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lh6/f;Ln6/a;)Lh6/n;
    .locals 1

    .line 1
    iget-object p1, p2, Ln6/a;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/util/Date;

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Lk6/h;

    .line 8
    .line 9
    sget-object p2, Lk6/g;->b:Lk6/f;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-direct {p1, p2, v0, v0}, Lk6/h;-><init>(Lk6/g;II)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"

    .line 2
    .line 3
    return-object v0
.end method
