.class public final La/Zc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Zc$a;
    }
.end annotation


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    new-instance v0, La/Zc$a;

    invoke-direct {v0, p1}, La/Zc$a;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method
