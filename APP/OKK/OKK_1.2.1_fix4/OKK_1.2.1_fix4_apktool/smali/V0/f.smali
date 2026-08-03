.class public final LV0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;


# instance fields
.field public final synthetic a:I

.field public final b:LV0/h;

.field public final c:LP0/l;


# direct methods
.method public constructor <init>(LE0/k;LP0/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LV0/f;->a:I

    sget-object v0, LV0/n;->i:LV0/n;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LV0/f;->b:LV0/h;

    .line 5
    iput-object p2, p0, LV0/f;->c:LP0/l;

    return-void
.end method

.method public constructor <init>(LV0/h;LP0/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LV0/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LV0/f;->b:LV0/h;

    iput-object p2, p0, LV0/f;->c:LP0/l;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, LV0/f;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, LV0/p;

    invoke-direct {v0, p0}, LV0/p;-><init>(LV0/f;)V

    return-object v0

    :pswitch_0
    new-instance v0, LV0/d;

    invoke-direct {v0, p0}, LV0/d;-><init>(LV0/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
