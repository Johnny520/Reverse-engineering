.class public final synthetic Lye/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lye/e;


# direct methods
.method public synthetic constructor <init>(Lye/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lye/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lye/b;->b:Lye/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lye/b;->a:I

    .line 2
    .line 3
    check-cast p1, Lud/g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lye/b;->b:Lye/e;

    .line 9
    .line 10
    iget-object v0, v0, Lye/e;->b:Ljava/util/HashMap;

    .line 11
    .line 12
    iget-object v1, p1, Lud/g;->l:Lod/c;

    .line 13
    .line 14
    iget-object v1, v1, Lod/c;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lye/b;->b:Lye/e;

    .line 21
    .line 22
    iget-object v0, v0, Lye/e;->b:Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object v1, p1, Lud/g;->l:Lod/c;

    .line 25
    .line 26
    iget-object v1, v1, Lod/c;->h:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
