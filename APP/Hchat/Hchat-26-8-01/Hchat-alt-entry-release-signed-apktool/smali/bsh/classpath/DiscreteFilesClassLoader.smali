.class public Lbsh/classpath/DiscreteFilesClassLoader;
.super Lbsh/classpath/BshClassLoader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;
    }
.end annotation


# static fields
.field private static instance:Lbsh/classpath/DiscreteFilesClassLoader;


# instance fields
.field map:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;


# direct methods
.method public constructor <init>(Lbsh/BshClassManager;Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/classpath/BshClassLoader;-><init>(Lbsh/BshClassManager;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lbsh/classpath/DiscreteFilesClassLoader;->map:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 5
    .line 6
    return-void
.end method

.method public static instance()Lbsh/classpath/DiscreteFilesClassLoader;
    .locals 1

    .line 1
    sget-object v0, Lbsh/classpath/DiscreteFilesClassLoader;->instance:Lbsh/classpath/DiscreteFilesClassLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newInstance(Lbsh/BshClassManager;Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;)V
    .locals 1

    .line 1
    new-instance v0, Lbsh/classpath/DiscreteFilesClassLoader;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lbsh/classpath/DiscreteFilesClassLoader;-><init>(Lbsh/BshClassManager;Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;)V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/classpath/DiscreteFilesClassLoader;->instance:Lbsh/classpath/DiscreteFilesClassLoader;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/DiscreteFilesClassLoader;->map:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->get(Ljava/lang/Object;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath$ClassSource;->getCode(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lbsh/classpath/BshClassLoader;->getClassManager()Lbsh/BshClassManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1, v0}, Lbsh/BshClassManager;->loadGeneratedClass(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-super {p0, p1}, Lbsh/classpath/BshClassLoader;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "for files: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbsh/classpath/DiscreteFilesClassLoader;->map:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
