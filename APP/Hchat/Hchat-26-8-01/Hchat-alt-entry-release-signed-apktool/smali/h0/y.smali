.class public final synthetic Lh0/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lw/y0;


# direct methods
.method public synthetic constructor <init>(Lw/y0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/y;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/y;->h:Lw/y0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lh0/y;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Le1/b;

    .line 7
    .line 8
    iget-wide v0, p1, Le1/b;->a:J

    .line 9
    .line 10
    sget-object p1, Lh0/w;->d:Lg1/d;

    .line 11
    .line 12
    iget-object v2, p0, Lh0/y;->h:Lw/y0;

    .line 13
    .line 14
    invoke-interface {v2, v0, v1, p1}, Lw/y0;->a(JLg1/d;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    check-cast p1, Ls1/t;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {p1, v0}, Ls1/s;->h(Ls1/t;Z)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-object v2, p0, Lh0/y;->h:Lw/y0;

    .line 28
    .line 29
    invoke-interface {v2, v0, v1}, Lw/y0;->e(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_1
    check-cast p1, Ls1/t;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Ls1/s;->h(Ls1/t;Z)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    iget-object v2, p0, Lh0/y;->h:Lw/y0;

    .line 44
    .line 45
    invoke-interface {v2, v0, v1}, Lw/y0;->e(J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ls1/t;->a()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
