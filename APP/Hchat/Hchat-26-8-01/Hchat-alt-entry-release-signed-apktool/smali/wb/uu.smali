.class public final synthetic Lwb/uu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/y2;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Ljava/lang/Object;Ljava/lang/Object;Lsf/b;II)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/uu;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/uu;->h:Lwb/y2;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/uu;->i:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/uu;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/uu;->k:Lsf/b;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/uu;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/uu;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/uu;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lwb/iv;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/uu;->k:Lsf/b;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/l;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xc01

    .line 30
    .line 31
    invoke-static {p1}, Li0/r;->C(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    iget-object v1, p0, Lwb/uu;->h:Lwb/y2;

    .line 36
    .line 37
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->g(Ljava/util/List;Lwb/iv;Lfg/l;Li0/h0;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Lwb/uu;->i:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v0, p0, Lwb/uu;->j:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lwb/uu;->k:Lsf/b;

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    check-cast v4, Lfg/a;

    .line 57
    .line 58
    move-object v5, p1

    .line 59
    check-cast v5, Li0/h0;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/16 p1, 0xc01

    .line 67
    .line 68
    invoke-static {p1}, Li0/r;->C(I)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    iget-object v1, p0, Lwb/uu;->h:Lwb/y2;

    .line 73
    .line 74
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->z(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
