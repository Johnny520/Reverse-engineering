.class public final synthetic Lwb/th;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lwb/s0;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/s0;ZZLfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/th;->g:Lwb/s0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/th;->h:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/th;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/th;->j:Lfg/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lp/u;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/16 p3, 0x10

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p1, p3, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    and-int/2addr p2, v0

    .line 26
    invoke-virtual {v4, p2, p1}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    iget-object v0, p0, Lwb/th;->g:Lwb/s0;

    .line 34
    .line 35
    iget-boolean v1, p0, Lwb/th;->h:Z

    .line 36
    .line 37
    iget-boolean v2, p0, Lwb/th;->i:Z

    .line 38
    .line 39
    iget-object v3, p0, Lwb/th;->j:Lfg/a;

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Lwb/ho;->c0(Lwb/s0;ZZLfg/a;Li0/h0;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 46
    .line 47
    .line 48
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1
.end method
