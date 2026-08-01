.class public final synthetic Lph1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:F

.field public final synthetic η:J

.field public final synthetic θ:F

.field public final synthetic ι:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(FJFLandroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lph1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lph1;->ζ:F

    .line 8
    .line 9
    iput-wide p2, p0, Lph1;->η:J

    .line 10
    .line 11
    iput p4, p0, Lph1;->θ:F

    .line 12
    .line 13
    iput-object p5, p0, Lph1;->ι:Landroid/app/Activity;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lsh1;FJFLandroid/app/Activity;)V
    .locals 0

    .line 16
    const/4 p1, 0x1

    iput p1, p0, Lph1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lph1;->ζ:F

    iput-wide p3, p0, Lph1;->η:J

    iput p5, p0, Lph1;->θ:F

    iput-object p6, p0, Lph1;->ι:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lph1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v6, p0, Lph1;->ζ:F

    .line 7
    .line 8
    iget-wide v1, p0, Lph1;->η:J

    .line 9
    .line 10
    iget v3, p0, Lph1;->θ:F

    .line 11
    .line 12
    iget-object v4, p0, Lph1;->ι:Landroid/app/Activity;

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    :try_start_0
    invoke-static/range {v1 .. v6}, Lsh1;->φ(JFLandroid/app/Activity;IF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    const/4 p0, 0x0

    .line 19
    sput-boolean p0, Lsh1;->λ:Z

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget v5, p0, Lph1;->ζ:F

    .line 23
    .line 24
    iget-wide v0, p0, Lph1;->η:J

    .line 25
    .line 26
    iget v2, p0, Lph1;->θ:F

    .line 27
    .line 28
    iget-object v3, p0, Lph1;->ι:Landroid/app/Activity;

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    invoke-static/range {v0 .. v5}, Lsh1;->φ(JFLandroid/app/Activity;IF)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
