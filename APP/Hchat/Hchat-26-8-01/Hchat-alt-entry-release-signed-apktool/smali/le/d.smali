.class public final synthetic Lle/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/HashSet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashSet;I)V
    .locals 0

    .line 1
    iput p2, p0, Lle/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lle/d;->h:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Lle/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lbe/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lbe/a;->e()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lle/d;->h:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lud/u;->v:Lmh/b;

    .line 21
    .line 22
    const-string v1, "Disable pass: {}"

    .line 23
    .line 24
    invoke-virtual {p1}, Lbe/a;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {v0, p1, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    return p1

    .line 35
    :pswitch_0
    iget-object v0, p0, Lle/d;->h:Ljava/util/HashSet;

    .line 36
    .line 37
    check-cast p1, Lud/a;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
