.class public final synthetic Lwb/rr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/y2;

.field public final synthetic i:Lm1/f;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Lm1/f;Ljava/lang/String;Lfg/a;II)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/rr;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/rr;->h:Lwb/y2;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/rr;->i:Lm1/f;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/rr;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/rr;->k:Lfg/a;

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
    iget v0, p0, Lwb/rr;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0xc37

    .line 15
    .line 16
    invoke-static {p1}, Li0/r;->C(I)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    iget-object v1, p0, Lwb/rr;->h:Lwb/y2;

    .line 21
    .line 22
    iget-object v2, p0, Lwb/rr;->i:Lm1/f;

    .line 23
    .line 24
    iget-object v3, p0, Lwb/rr;->j:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, Lwb/rr;->k:Lfg/a;

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->h0(Lm1/f;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_0
    move-object v4, p1

    .line 35
    check-cast v4, Li0/h0;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/16 p1, 0xc37

    .line 43
    .line 44
    invoke-static {p1}, Li0/r;->C(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    iget-object v0, p0, Lwb/rr;->h:Lwb/y2;

    .line 49
    .line 50
    iget-object v1, p0, Lwb/rr;->i:Lm1/f;

    .line 51
    .line 52
    iget-object v2, p0, Lwb/rr;->j:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, p0, Lwb/rr;->k:Lfg/a;

    .line 55
    .line 56
    invoke-virtual/range {v0 .. v5}, Lwb/y2;->a0(Lm1/f;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
