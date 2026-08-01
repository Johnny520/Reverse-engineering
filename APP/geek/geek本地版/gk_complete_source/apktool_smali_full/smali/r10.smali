.class public final synthetic Lr10;
.super Ljava/lang/Object;

# interfaces
.implements Lmq;


# instance fields
.field public final synthetic a:La3;


# direct methods
.method public synthetic constructor <init>(La3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr10;->a:La3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Loq;Liq;)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    iget-object v0, p0, Lr10;->a:La3;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Liq;->ON_START:Liq;

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, v0, La3;->e:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object p1, Liq;->ON_STOP:Liq;

    .line 17
    .line 18
    if-ne p2, p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, v0, La3;->e:Z

    .line 22
    .line 23
    :cond_1
    return-void
.end method
