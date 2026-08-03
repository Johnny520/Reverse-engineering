.class public final synthetic Ljd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfc/f;


# direct methods
.method public synthetic constructor <init>(Lfc/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljd/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ljd/b;->b:Lfc/f;

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
    iget v0, p0, Ljd/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lnd/p;

    .line 7
    .line 8
    iget-object v0, p1, Lnd/p;->g:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p1, p1, Lnd/p;->h:Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v1, p0, Ljd/b;->b:Lfc/f;

    .line 13
    .line 14
    invoke-static {v1, v0, p1}, Ljd/c;->c(Lfc/f;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "/* "

    .line 21
    .line 22
    iget-object v1, p0, Ljd/b;->b:Lfc/f;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lfc/f;->r(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lfc/f;->i(Ljava/lang/String;)Lfc/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, " */"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
