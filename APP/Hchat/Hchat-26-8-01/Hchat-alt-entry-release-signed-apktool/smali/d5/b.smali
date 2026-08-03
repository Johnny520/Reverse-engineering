.class public final synthetic Ld5/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld5/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le5/a;

.field public final synthetic c:Lv5/b;


# direct methods
.method public synthetic constructor <init>(Le5/a;Lv5/b;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld5/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld5/b;->b:Le5/a;

    .line 4
    .line 5
    iput-object p2, p0, Ld5/b;->c:Lv5/b;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Ld5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld5/b;->b:Le5/a;

    .line 7
    .line 8
    iget-object v1, p0, Ld5/b;->c:Lv5/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lq5/a;->o(Lv5/b;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Ld5/b;->b:Le5/a;

    .line 15
    .line 16
    iget-object v1, p0, Ld5/b;->c:Lv5/b;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lq5/a;->o(Lv5/b;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
