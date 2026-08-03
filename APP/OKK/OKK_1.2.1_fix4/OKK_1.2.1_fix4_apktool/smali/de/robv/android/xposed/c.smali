.class public abstract Lde/robv/android/xposed/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x32

    iput v0, p0, Lde/robv/android/xposed/c;->a:I

    return-void
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 0

    return-void
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 0

    return-void
.end method

.method public final c(Lde/robv/android/xposed/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/c;->a(Lde/robv/android/xposed/b;)V

    return-void
.end method

.method public final d(Lde/robv/android/xposed/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/c;->b(Lde/robv/android/xposed/b;)V

    return-void
.end method
