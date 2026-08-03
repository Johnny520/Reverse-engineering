.class public final Lde/robv/android/xposed/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/reflect/Executable;

.field public b:Ljava/lang/Object;

.field public c:[Ljava/lang/Object;

.field public d:Z

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lde/robv/android/xposed/b;->f:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lde/robv/android/xposed/b;->f:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lde/robv/android/xposed/b;->d:Z

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lde/robv/android/xposed/b;->f:Ljava/lang/Throwable;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lde/robv/android/xposed/b;->d:Z

    return-void
.end method

.method public final e(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lde/robv/android/xposed/b;->f:Ljava/lang/Throwable;

    const/4 p1, 0x0

    iput-object p1, p0, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lde/robv/android/xposed/b;->d:Z

    return-void
.end method
