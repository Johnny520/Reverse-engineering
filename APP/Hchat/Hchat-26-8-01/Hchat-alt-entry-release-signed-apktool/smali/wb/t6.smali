.class public final synthetic Lwb/t6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/t6;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/t6;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput p2, p0, Lwb/t6;->i:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/t6;->g:I

    .line 2
    .line 3
    check-cast p1, Li0/h0;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lwb/t6;->i:I

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
    iget-object v0, p0, Lwb/t6;->h:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, p1, p2}, Lwb/ho;->E2(Ljava/lang/String;Li0/h0;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    iget p2, p0, Lwb/t6;->i:I

    .line 33
    .line 34
    or-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    invoke-static {p2}, Li0/r;->C(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-object v0, p0, Lwb/t6;->h:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, p1, p2}, Lwb/ho;->s0(Ljava/lang/String;Li0/h0;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
