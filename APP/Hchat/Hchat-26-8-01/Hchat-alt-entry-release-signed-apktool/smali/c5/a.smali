.class public final Lc5/a;
.super Lc5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Lc5/a;->i:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lc5/b;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Le5/a;)Z
    .locals 1

    .line 1
    iget v0, p0, Lc5/a;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, ".prologue"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :pswitch_0
    const-string v0, ".prologue"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
