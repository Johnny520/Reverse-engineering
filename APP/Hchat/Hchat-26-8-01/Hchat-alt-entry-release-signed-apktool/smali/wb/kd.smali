.class public final synthetic Lwb/kd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lfg/a;II)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/kd;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/kd;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/kd;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/kd;->j:Lfg/a;

    .line 8
    .line 9
    iput p4, p0, Lwb/kd;->k:I

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/kd;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lwb/kd;->k:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Lwb/kd;->h:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lwb/kd;->i:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v2, p0, Lwb/kd;->j:Lfg/a;

    .line 26
    .line 27
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->x3(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget p2, p0, Lwb/kd;->k:I

    .line 34
    .line 35
    or-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    invoke-static {p2}, Li0/r;->C(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, Lwb/kd;->h:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p0, Lwb/kd;->i:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, p0, Lwb/kd;->j:Lfg/a;

    .line 46
    .line 47
    invoke-static {v0, v1, v2, p1, p2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
