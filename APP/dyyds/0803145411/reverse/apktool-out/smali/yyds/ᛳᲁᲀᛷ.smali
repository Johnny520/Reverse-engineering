.class public final Lyyds/ᛳᲁᲀᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ᛲᲈᲁ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᲁᲀᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    iget p0, p0, Lyyds/ᛳᲁᲀᛷ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lyyds/ᛴᛴᲁᛴ;

    .line 7
    .line 8
    const-string v0, "fonts-androidx"

    .line 9
    .line 10
    invoke-direct {p0, p1, v0}, Lyyds/ᛴᛴᲁᛴ;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance p0, Lyyds/ᛴᛴᲁᛴ;

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lyyds/ᛴᛴᲁᛴ;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    new-instance p0, Ljava/lang/Thread;

    .line 21
    .line 22
    new-instance v0, Lyyds/ᛴᛶᛳᛸ;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1, p1}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "glide-active-resources"

    .line 29
    .line 30
    invoke-direct {p0, v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
