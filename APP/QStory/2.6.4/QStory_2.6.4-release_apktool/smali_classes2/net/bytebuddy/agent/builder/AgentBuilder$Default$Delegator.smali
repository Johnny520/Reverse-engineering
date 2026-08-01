.class public abstract Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Delegator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator$Matchable;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public varargs assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeFromAndTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public varargs assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/instrument/Instrumentation;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public varargs assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->assureReadEdgeTo(Ljava/lang/instrument/Instrumentation;[Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public disableClassFormatChanges()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder;->disableClassFormatChanges()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public disableNativeMethodPrefix()Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder;->disableNativeMethodPrefix()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public enableNativeMethodPrefix(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->enableNativeMethodPrefix(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public ignore(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->ignore(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p0

    return-object p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p0

    return-object p0
.end method

.method public ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;"
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder;->ignore(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Ignored;

    move-result-object p0

    return-object p0
.end method

.method public installOn(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->installOn(Ljava/lang/instrument/Instrumentation;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public installOnByteBuddyAgent()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder;->installOnByteBuddyAgent()Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public makeRaw()Ljava/lang/instrument/ClassFileTransformer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder;->makeRaw()Ljava/lang/instrument/ClassFileTransformer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public abstract materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p0

    return-object p0
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p0

    return-object p0
.end method

.method public patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOn(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p0

    return-object p0
.end method

.method public patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->patchOnByteBuddyAgent(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$PatchMode;)Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;

    move-result-object p0

    return-object p0
.end method

.method public type(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->type(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    return-object p0
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->type(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder;->type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    return-object p0
.end method

.method public type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaModule;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;"
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/agent/builder/AgentBuilder;->type(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Identified$Narrowable;

    move-result-object p0

    return-object p0
.end method

.method public warmUp(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->warmUp(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public varargs warmUp([Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->warmUp([Ljava/lang/Class;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithoutBatchStrategy;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionListenable$WithoutBatchStrategy;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$ClassFileBufferStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$DescriptionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$FallbackStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 16
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$InitializationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 23
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$InjectionStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 14
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$PoolStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 24
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$TransformerDecorator;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/agent/builder/AgentBuilder$TypeStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method

.method public with(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/agent/builder/AgentBuilder;
    .locals 0

    .line 15
    invoke-virtual {p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$Delegator;->materialize()Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    invoke-interface {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder;->with(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/agent/builder/AgentBuilder;

    move-result-object p0

    return-object p0
.end method
