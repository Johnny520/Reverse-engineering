.class public final LB2;
.super Lv;
.source ""

# interfaces
.implements LYb;


# instance fields
.field private volatile _preHandler:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lgf;->c:Lgf;

    invoke-direct {p0, v0}, Lv;-><init>(LZb;)V

    iput-object p0, p0, LB2;->_preHandler:Ljava/lang/Object;

    return-void
.end method
