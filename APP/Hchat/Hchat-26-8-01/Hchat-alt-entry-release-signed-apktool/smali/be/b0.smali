.class public final synthetic Lbe/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbe/d0;

.field public final synthetic c:Lud/e;


# direct methods
.method public synthetic constructor <init>(Lbe/d0;Lud/e;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbe/b0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/b0;->b:Lbe/d0;

    .line 4
    .line 5
    iput-object p2, p0, Lbe/b0;->c:Lud/e;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lbe/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbe/b0;->c:Lud/e;

    .line 7
    .line 8
    check-cast p1, Lpc/d;

    .line 9
    .line 10
    iget-object v1, p0, Lbe/b0;->b:Lbe/d0;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p1}, Lbe/d0;->m(Lud/e;Lpc/d;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Lud/r;

    .line 17
    .line 18
    sget-object v0, Loc/c;->a:Loc/c;

    .line 19
    .line 20
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lpc/d;

    .line 27
    .line 28
    iget-object v1, p0, Lbe/b0;->b:Lbe/d0;

    .line 29
    .line 30
    iget-object v2, p0, Lbe/b0;->c:Lud/e;

    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, Lbe/d0;->m(Lud/e;Lpc/d;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Loc/c;->g:Loc/c;

    .line 36
    .line 37
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lpc/c;

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p1, p1, Lpc/c;->g:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v0, Lbe/b0;

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    invoke-direct {v0, v1, v2, v3}, Lbe/b0;-><init>(Lbe/d0;Lud/e;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_1
    check-cast p1, Lud/g;

    .line 61
    .line 62
    sget-object v0, Loc/c;->a:Loc/c;

    .line 63
    .line 64
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lpc/d;

    .line 71
    .line 72
    iget-object v0, p0, Lbe/b0;->b:Lbe/d0;

    .line 73
    .line 74
    iget-object v1, p0, Lbe/b0;->c:Lud/e;

    .line 75
    .line 76
    invoke-virtual {v0, v1, p1}, Lbe/d0;->m(Lud/e;Lpc/d;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
