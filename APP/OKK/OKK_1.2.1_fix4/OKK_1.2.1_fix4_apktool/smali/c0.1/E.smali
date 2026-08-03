.class public final Lc0/E;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LP0/l;


# direct methods
.method public synthetic constructor <init>(LP0/l;I)V
    .locals 0

    iput p2, p0, Lc0/E;->b:I

    iput-object p1, p0, Lc0/E;->c:LP0/l;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/robv/android/xposed/b;)V
    .locals 1

    iget v0, p0, Lc0/E;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Number;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lc0/E;->c:LP0/l;

    invoke-interface {v0, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    iget-object p1, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_5

    iget-object v0, p0, Lc0/E;->c:LP0/l;

    invoke-interface {v0, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_3
    return-void

    :pswitch_1
    invoke-static {}, Lc0/y;->b()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lc0/E;->c:LP0/l;

    invoke-interface {v0, p1}, LP0/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
