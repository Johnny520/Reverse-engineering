.class public LYue/ۥۡۧۤۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۤۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/io/Reader;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public final synthetic ۥ۟۟۟۟:LYue/ۥۡۧۤۤ;


# direct methods
.method public constructor <init>(LYue/ۥۡۧۤۤ;Ljava/lang/String;Ljava/io/Reader;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۤۤ$ۥ;->ۥ۟۟۟۟:LYue/ۥۡۧۤۤ;

    const/4 p1, 0x1

    iput p1, p0, LYue/ۥۡۧۤۤ$ۥ;->ۥ۟۟:I

    iput p1, p0, LYue/ۥۡۧۤۤ$ۥ;->ۥ۟۟۟:I

    iput-object p2, p0, LYue/ۥۡۧۤۤ$ۥ;->ۥ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۡۧۤۤ$ۥ;->ۥ۟:Ljava/io/Reader;

    return-void
.end method
