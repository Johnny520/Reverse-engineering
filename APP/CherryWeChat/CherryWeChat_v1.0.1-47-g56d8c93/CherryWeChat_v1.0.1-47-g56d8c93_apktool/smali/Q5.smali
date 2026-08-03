.class public final LQ5;
.super Ltg;
.source ""


# instance fields
.field public final h:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lbc;-><init>()V

    iput-object p1, p0, LQ5;->h:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final x()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, LQ5;->h:Ljava/lang/Thread;

    return-object v0
.end method
