.class public final synthetic Lyyds/ᛸᛴᛸᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic ᛲᲈᲁ:Ljava/lang/String;

.field public final synthetic ᛵᛸᛸᛷ:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛴᛸᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛸᛴᛸᛸ;->ᛵᛸᛸᛷ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛴᛸᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Lyyds/ᛸᛴᛸᛸ;->ᛵᛸᛸᛷ:Z

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
