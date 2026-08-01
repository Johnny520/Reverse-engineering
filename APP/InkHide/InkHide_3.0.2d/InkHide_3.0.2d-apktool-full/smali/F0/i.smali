.class public final LF0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements LO0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF0/i;->a:I

    iput-object p2, p0, LF0/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, LF0/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF0/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LK0/h;

    .line 9
    .line 10
    new-instance v1, LU0/b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, LU0/b;-><init>(LK0/h;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    iget-object v0, p0, LF0/i;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v0}, LN0/o;->d([Ljava/lang/Object;)LF0/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
