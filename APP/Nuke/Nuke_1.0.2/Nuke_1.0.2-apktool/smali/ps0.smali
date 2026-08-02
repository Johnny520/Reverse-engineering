.class public final synthetic Lps0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lqs0;


# direct methods
.method public synthetic constructor <init>(Lqs0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lps0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lps0;->i:Lqs0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lps0;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Font resolution state is not set."

    .line 5
    .line 6
    sget-object v3, La83;->a:La83;

    .line 7
    .line 8
    iget-object p0, p0, Lps0;->i:Lqs0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lqs0;->C:Lm63;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    move-object v1, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v2}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ls;->b()V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v1

    .line 26
    :pswitch_0
    iget-object p0, p0, Lqs0;->C:Lm63;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    move-object v1, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {v2}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ls;->b()V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
