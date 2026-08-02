.class public final Lns2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ln32;


# direct methods
.method public synthetic constructor <init>(Ln32;I)V
    .locals 0

    .line 1
    iput p2, p0, Lns2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lns2;->i:Ln32;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p2, p0, Lns2;->h:I

    .line 2
    .line 3
    sget-object v0, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Lns2;->i:Ln32;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ln32;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    invoke-virtual {p0, p1}, Ln32;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
