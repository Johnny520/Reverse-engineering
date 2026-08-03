.class public Lparty/iroiro/luajava/cleaner/LuaReference;
.super Ljava/lang/ref/PhantomReference;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lparty/iroiro/luajava/cleaner/LuaReferable;",
        ">",
        "Ljava/lang/ref/PhantomReference<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final ref:I


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/cleaner/LuaReferable;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/ref/ReferenceQueue<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    invoke-interface {p1}, Lparty/iroiro/luajava/cleaner/LuaReferable;->getReference()I

    move-result p1

    iput p1, p0, Lparty/iroiro/luajava/cleaner/LuaReference;->ref:I

    return-void
.end method


# virtual methods
.method public getReference()I
    .locals 1

    iget v0, p0, Lparty/iroiro/luajava/cleaner/LuaReference;->ref:I

    return v0
.end method
