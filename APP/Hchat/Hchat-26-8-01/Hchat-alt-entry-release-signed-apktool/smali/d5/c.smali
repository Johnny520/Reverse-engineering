.class public final synthetic Ld5/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld5/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le5/a;

.field public final synthetic c:Lv5/a;


# direct methods
.method public synthetic constructor <init>(Le5/a;Lv5/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld5/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld5/c;->b:Le5/a;

    .line 4
    .line 5
    iput-object p2, p0, Ld5/c;->c:Lv5/a;

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
    iget v0, p0, Ld5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld5/c;->c:Lv5/a;

    .line 7
    .line 8
    iget-object v0, v0, Lv5/a;->g:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Ld5/c;->b:Le5/a;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Ld5/c;->c:Lv5/a;

    .line 17
    .line 18
    iget-object v0, v0, Lv5/a;->g:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Ld5/c;->b:Le5/a;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
