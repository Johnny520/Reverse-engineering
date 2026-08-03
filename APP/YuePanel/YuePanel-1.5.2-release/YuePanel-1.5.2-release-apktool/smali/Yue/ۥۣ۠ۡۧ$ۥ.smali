.class public LYue/ۥۣ۠ۡۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۡۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/io/FileDescriptor;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    invoke-static {p0}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V

    return-void
.end method

.method public static ۥ۟(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    invoke-static {p0}, Landroid/system/Os;->dup(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Ljava/io/FileDescriptor;JI)J
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    move-result-wide p0

    return-wide p0
.end method
